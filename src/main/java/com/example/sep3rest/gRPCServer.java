package com.example.sep3rest;

import com.example.sep3rest.api.controller.CategoryController;
import com.example.sep3rest.api.controller.FileController;
import com.example.sep3rest.api.controller.UserController;
import com.example.sep3rest.api.model.logic.FileLogicImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class gRPCServer {
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8080).addService(new FileController())
                .addService(new UserController())
                .addService(new CategoryController()).build();
        try {
            server.start();
            System.out.println("Server started");
            server.awaitTermination();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
