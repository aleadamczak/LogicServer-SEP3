package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.DTOs.FileDownloadDto;
import com.example.sep3rest.api.model.DTOs.PrivateFileDisplayDto;
import com.example.sep3rest.api.model.domain.PrivateFile;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.logic.PrivateFileLogic;
import com.example.sep3rest.api.model.logic.PrivateFileLogicImpl;
import com.example.sep3rest.api.model.logic.UserLogic;
import com.example.sep3rest.api.model.logic.UserLogicImpl;
import com.example.sep3rest.persistance.PrivateFileService;
import com.example.sep3rest.protobuf.Logicserver;
import com.example.sep3rest.protobuf.PrivateFileControllerGrpc;
import io.grpc.Status;
import io.grpc.reflection.v1alpha.ErrorResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivateFileController extends PrivateFileControllerGrpc.PrivateFileControllerImplBase {


    @Autowired
    private PrivateFileLogic privateFileLogic = new PrivateFileLogicImpl();

    @Autowired
    private UserLogic userLogic = new UserLogicImpl();
    @Autowired
    private PrivateFileService privateFileService = new PrivateFileService();

    @Override
    public void upload(Logicserver.PrivateFileCreationDto request, StreamObserver<Logicserver.PrivateFile> responseObserver) {

        try {
            privateFileLogic.validateFile(request);
            try {
                PrivateFile privateFile =  privateFileService.storeFile(privateFileLogic.protoToFile(request)).getBody();
                responseObserver.onNext(privateFileLogic.FileToProto(privateFile));
                responseObserver.onCompleted();
            }
            catch (Exception e) {
                String errorMessage = e.getMessage();
                ErrorResponse response = ErrorResponse.newBuilder()
                        .setErrorMessage(errorMessage)
                        .build();
                responseObserver.onError(
                        Status.INTERNAL
                                .withDescription(errorMessage)
                                .asRuntimeException());
            }

        } catch (Exception e) {
            String errorMessage = e.getMessage();
            ErrorResponse response = ErrorResponse.newBuilder()
                    .setErrorMessage(errorMessage)
                    .build();
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription(errorMessage)
                            .asRuntimeException());
        }

    }


    @Override
    public void download(Logicserver.Id request, StreamObserver<Logicserver.FileDownloadDto> responseObserver) {
        try{
            int id = request.getId();

            FileDownloadDto downloadFile = privateFileService.downloadFile(id).getBody();

            Logicserver.FileDownloadDto response = privateFileLogic.FileToProto(downloadFile);

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e)
        {
            if (e.getMessage().toString().equals("500 Internal Server Error: \"\"Object reference not set to an instance of an object.\"\""))
            {
                String errorMessage = e.getMessage();
                responseObserver.onError(Status.INTERNAL.withDescription(errorMessage)
                        .asRuntimeException());
            }
            else {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void getSharedWith(Logicserver.User request, StreamObserver<Logicserver.PrivateFileDisplayDtoList> responseObserver) {
        User user = null;
        try {
            user = userLogic.isUserRegistered(request.getUsername());
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            ErrorResponse response = ErrorResponse.newBuilder()
                    .setErrorMessage(errorMessage)
                    .build();
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription(errorMessage)
                            .asRuntimeException());
        }
        List<PrivateFileDisplayDto> fileDisplayDtoList = null;
        try {
            fileDisplayDtoList = privateFileService.getSharedWith(user).getBody();
            responseObserver.onNext(privateFileLogic.filesToProto(fileDisplayDtoList));
            responseObserver.onCompleted();
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            ErrorResponse response = ErrorResponse.newBuilder()
                    .setErrorMessage(errorMessage)
                    .build();
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription(errorMessage)
                            .asRuntimeException());
        }


    }

    @Override
    public void remove(Logicserver.Id request, StreamObserver<Logicserver.Empty> responseObserver) {
        try {
            privateFileService.delete(request.getId()).getBody();
            responseObserver.onNext(Logicserver.Empty.newBuilder().build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            ErrorResponse response = ErrorResponse.newBuilder()
                    .setErrorMessage(errorMessage)
                    .build();
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription(errorMessage)
                            .asRuntimeException());
        }
    }
}
