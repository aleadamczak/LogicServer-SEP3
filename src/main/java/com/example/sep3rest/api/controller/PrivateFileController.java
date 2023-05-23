package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.domain.PrivateFile;
import com.example.sep3rest.api.model.logic.PrivateFileLogic;
import com.example.sep3rest.api.model.logic.PrivateFileLogicImpl;
import com.example.sep3rest.persistance.PrivateFileService;
import com.example.sep3rest.protobuf.Logicserver;
import com.example.sep3rest.protobuf.PrivateFileControllerGrpc;
import io.grpc.Status;
import io.grpc.reflection.v1alpha.ErrorResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivateFileController extends PrivateFileControllerGrpc.PrivateFileControllerImplBase {


    @Autowired
    private PrivateFileLogic privateFileLogic = new PrivateFileLogicImpl();
    @Autowired
    private PrivateFileService privateFileService = new PrivateFileService();

    @Override
    public void upload(Logicserver.PrivateFileCreationDto request, StreamObserver<Logicserver.PrivateFile> responseObserver) {
                try {
                    System.out.println("AM IA ASDISAJD");
            privateFileLogic.validateFile(request);
           PrivateFile privateFile =  privateFileService.storeFile(privateFileLogic.protoToFile(request)).getBody();
           responseObserver.onNext(privateFileLogic.FileToProto(privateFile));
           responseObserver.onCompleted();
        }
        catch (Exception e) {
            System.out.println("am I HERE?");
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

//    @Override
//    public void upload(Logicserver.PrivateFileCreationDto request, StreamObserver<Logicserver.PrivateFile> responseObserver){
//

//
//    }

    @Override
    public void download(Logicserver.Id request, StreamObserver<Logicserver.FileDownloadDto> responseObserver) {

    }

    @Override
    public void getSharedWith(Logicserver.User request, StreamObserver<Logicserver.PrivateFileDisplayDtoList> responseObserver) {

    }
}
