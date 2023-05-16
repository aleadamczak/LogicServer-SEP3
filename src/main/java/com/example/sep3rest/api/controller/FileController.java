package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.domain.File;
import com.example.sep3rest.api.model.domain.FileDTO;
import com.example.sep3rest.api.model.domain.FileDownloadDto;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.logic.FileLogic;
import com.example.sep3rest.api.model.logic.FileLogicImpl;
import com.example.sep3rest.persistance.FileService;
import com.example.sep3rest.protobuf.FileControllerGrpc;
import com.example.sep3rest.protobuf.Logicserver;
import com.google.protobuf.ByteString;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class FileController extends FileControllerGrpc.FileControllerImplBase {

    @Autowired
    private FileService fileService = new FileService();

    @Autowired
    private FileLogic fileLogic = new FileLogicImpl();


    @Override
    public void upload(Logicserver.FileCreationDto request, StreamObserver<Logicserver.File> responseObserver) {

        System.out.println("in upload method" + request.getContentType());
        try {

            // first validate if the received object fulfills what it needs to :)
            fileLogic.validateFile(request);


            //convert proto file to domain object and then send to the data server
            FileDTO newFile = fileService.storeFile(fileLogic.protoToFile(request)).getBody();

            System.out.println(newFile.getContentType());

            //construct the proto response from the retrieved file
            Logicserver.Category categoryResponse = Logicserver.Category.newBuilder().setName(newFile.getCategory().getName()).build();
            User user = newFile.getUploadedBy();
            Logicserver.User userResponse = Logicserver.User.newBuilder().setName(user.getName())
                    .setUsername(user.getUsername()).setIsAdmin(user.isAdmin())
                    .setPassword(user.getPassword()).setId(user.getId()).build();

            Logicserver.File response = Logicserver.File.newBuilder().setBytes(ByteString.copyFrom(newFile.getBytes()))
                    .setCategory(categoryResponse).setContentType(newFile.getContentType())
                    .setUploadedBy(userResponse)
                    .setDescription(newFile.getDescription())
                    .setId(newFile.getId()).setTitle(newFile.getTitle()).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void download(Logicserver.Id request, StreamObserver<Logicserver.FileDownloadDto> responseObserver) {

        try{
            int id = request.getId();

            FileDownloadDto downloadFile = fileService.downloadFile(id).getBody();

            Logicserver.FileDownloadDto response = fileLogic.FileToProto(downloadFile);

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e)
        {
            if (e.getMessage().toString().equals("500 Internal Server Error: \"\"Object reference not set to an instance of an object.\"\""))
            {
                String errorMessage = e.getMessage();
                Logicserver.NullException nullException = Logicserver.NullException.newBuilder()
                                .setMessage(errorMessage)
                                        .build();
                responseObserver.onError(Status.INTERNAL.withDescription(errorMessage)
                        .asRuntimeException());
            }


            throw new RuntimeException(e);
        }




    }

    @Override
    public void getAll(Logicserver.Empty request, StreamObserver<Logicserver.FileDisplayList> responseObserver) {
        fileService.getAllFiles();
    }

    @Override
    public void getById(Logicserver.Id request, StreamObserver<Logicserver.File> responseObserver) {
        super.getById(request, responseObserver);
    }

    @Override
    public void getByCategory(Logicserver.Category request, StreamObserver<Logicserver.FileDisplayList> responseObserver) {
        super.getByCategory(request, responseObserver);
    }

    @Override
    public void getByTitle(Logicserver.String request, StreamObserver<Logicserver.FileDisplayList> responseObserver) {
        super.getByTitle(request, responseObserver);
    }

    @Override
    public void update(Logicserver.FileUpdateDto request, StreamObserver<Logicserver.File> responseObserver) {
        super.update(request, responseObserver);
    }

    @Override
    public void remove(Logicserver.Id request, StreamObserver<Logicserver.Empty> responseObserver) {
        super.remove(request, responseObserver);
    }

    // post end point for uploading a file :)
//    @PostMapping("/uploadFile")
//    public ResponseEntity<FileDTO>uploadFile(@RequestBody FileDTO file)
//    {
//        System.out.println("File received in java server");
//        file.setCategory("COMEDY BRO");
//        try {
//            fileLogic.validateFile(file);
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage());
//        }
//        fileService.storeFile(file);
//        System.out.println("File sent to the service");
//        return ResponseEntity.status(HttpStatus.OK).body(file);
//    }
//
//    @GetMapping("/downloadFile/{fileId:.+}")
//    public ResponseEntity<File> downloadFile(@PathVariable int fileId)
//    {
//        File resource = fileService.loadFileAsResource(fileId);
//
//        return ResponseEntity.status(HttpStatus.OK).body(resource);
//
//    }
//
//    @GetMapping("/getAllFiles")
//    public List<FileDTO> getAllFiles()
//    {
//        List<FileDTO> files = null;
//        try {
//            files = fileService.getAllFiles();
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//
//        return files;
//    }


}
