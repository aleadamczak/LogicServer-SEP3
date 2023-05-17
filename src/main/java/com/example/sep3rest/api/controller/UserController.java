package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.logic.UserLogic;
import com.example.sep3rest.api.model.logic.UserLogicImpl;
import com.example.sep3rest.persistance.UserService;
import com.example.sep3rest.protobuf.Logicserver;
import com.example.sep3rest.protobuf.UserControllerGrpc;
import io.grpc.Status;
import io.grpc.reflection.v1alpha.ErrorResponse;
import io.grpc.stub.StreamObserver;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Service
public class UserController extends UserControllerGrpc.UserControllerImplBase {

    @Autowired
    private UserService service = new UserService();

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
    public void getById(Logicserver.Id request, StreamObserver<Logicserver.User> responseObserver) {

    }

    @Override
    public void getAll(Logicserver.Empty request, StreamObserver<Logicserver.UserList> responseObserver) {

    }

    @Override
    public void create(Logicserver.UserCreationDto request, StreamObserver<Logicserver.User> responseObserver) {

    }

    @Override
    public void logIn(Logicserver.UserLogInDto request, StreamObserver<Logicserver.User> responseObserver) {

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
