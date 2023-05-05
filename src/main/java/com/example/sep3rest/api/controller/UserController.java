package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.User;
import com.example.sep3rest.persistance.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping ("/getUser")
    public ResponseEntity<User> isUserRegistered(String username) {

       return ResponseEntity.status(HttpStatus.OK).body(service.isUserRegistered(username));

    }
}
