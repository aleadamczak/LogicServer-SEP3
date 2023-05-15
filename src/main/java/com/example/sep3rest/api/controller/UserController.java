package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.persistance.UserService;
import com.example.sep3rest.protobuf.Logicserver;
import com.example.sep3rest.protobuf.UserControllerGrpc;
import io.grpc.stub.StreamObserver;
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

    @Override
    public void getByUsername(Logicserver.String request, StreamObserver<Logicserver.User> responseObserver) {
        String username = request.getString();
        System.out.println("In this method bro");
        //get the user from the data server
        User user = null;
        try {
            user = service.isUserRegistered(username).getBody();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // create the response
        Logicserver.User response = Logicserver.User.newBuilder().setId(user.getId())
                .setUsername(user.getUsername()).setPassword(user.getPassword())
                .setIsAdmin(user.isAdmin()).setName(user.getName()).build();
        //send the response
        responseObserver.onNext(response);
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
