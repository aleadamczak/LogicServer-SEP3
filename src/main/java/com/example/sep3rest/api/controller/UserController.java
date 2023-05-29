package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.authentication.JwtTokenGenerator;
import com.example.sep3rest.api.model.domain.File;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.DTOs.UserCreationDto;
import com.example.sep3rest.api.model.DTOs.UserDisplayDto;
import com.example.sep3rest.api.model.logic.UserLogic;
import com.example.sep3rest.api.model.logic.UserLogicImpl;
import com.example.sep3rest.persistance.UserService;
import com.example.sep3rest.protobuf.Logicserver;
import com.example.sep3rest.protobuf.UserControllerGrpc;
import io.grpc.Status;
import io.grpc.reflection.v1alpha.ErrorResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserController extends UserControllerGrpc.UserControllerImplBase {


    @Autowired
    private UserService userService = new UserService();

    @Autowired
    private UserLogic userLogic = new UserLogicImpl();

    @Override
    public void getByUsername(Logicserver.String request, StreamObserver<Logicserver.User> responseObserver) {
        String username = request.getString();
        System.out.println("In this method bro");
        //get the user from the data server
        User user = null;
        try {
            user = userLogic.isUserRegistered(username);
            // create the response
            Logicserver.User response = Logicserver.User.newBuilder().setId(user.getId())
                    .setUsername(user.getUsername()).setPassword(user.getPassword())
                    .setIsAdmin(user.isAdmin()).setName(user.getName()).build();
            //send the response
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    public void getAllDisplay(Logicserver.Empty request, StreamObserver<Logicserver.UserDisplayDtoList> responseObserver) {
        Logicserver.UserDisplayDtoList userDisplayDtoList = userLogic.getAll();
        responseObserver.onNext(userDisplayDtoList);
        responseObserver.onCompleted();
    }


    @Override
    public void getById(Logicserver.Id request, StreamObserver<Logicserver.User> responseObserver) {

    }

    @Override
    public void getAll(Logicserver.Empty request, StreamObserver<Logicserver.UserList> responseObserver) {

    }

    @Override
    public void create(Logicserver.UserCreationDto request, StreamObserver<Logicserver.User> responseObserver) {

        try {

            // first validate if the received object fulfills what it needs to :)
//            userLogic.validateUser(request);


            //convert proto file to domain object and then send to the data server
            UserCreationDto newUser = userService.createUser(userLogic.ProtoToUser(request)).getBody();

            //construct the proto response from the retrieved file
            Logicserver.User userResponse = Logicserver.User.newBuilder().setName(newUser.getName())
                .setUsername(newUser.getUsername()).setIsAdmin(newUser.isAdmin())
                .setPassword(newUser.getPassword()).build();

            responseObserver.onNext(userResponse);
            responseObserver.onCompleted();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void logIn(Logicserver.UserLogInDto request, StreamObserver<Logicserver.UserTokenDto> responseObserver) {

        User user;
        try {
            user = userService.Login(userLogic.ProtoToUser(request)).getBody();

            if (user.getPassword().equals(request.getPassword()))
            {
                String token = JwtTokenGenerator.generateJwtToken(user);

                // create the response
                Logicserver.UserTokenDto response = Logicserver.UserTokenDto.newBuilder().setId(user.getId()).setUsername(user.getUsername())
                    .setPassword(user.getPassword()).setIsAdmin(user.isAdmin()).setName(user.getName()).setToken(token).build();
                //send the response
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            else
            {
                System.out.println("Wrong password");
            }
        } catch (Exception e) {
            System.out.println("Exception in method Login");
            System.out.println(e.getMessage());
            String errorMessage = e.getMessage();

            // Send the error response
            responseObserver.onError(
                Status.INTERNAL
                    .withDescription(errorMessage)
                    .asRuntimeException());
        }
    }

    @Override
    public void update(Logicserver.UserUpdateDto request, StreamObserver<Logicserver.User> responseObserver) {

    }

    @Override
    public void remove(Logicserver.Id request, StreamObserver<Logicserver.Empty> responseObserver) {

    }



    //
//
//    @GetMapping ("/getUser/{username}")
//    public ResponseEntity<User> isUserRegistered(@PathVariable String username) {
//       return service.isUserRegistered(username);
//
//    }
}
