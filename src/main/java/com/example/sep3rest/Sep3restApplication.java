package com.example.sep3rest;

import com.example.sep3rest.api.controller.CategoryController;
import com.example.sep3rest.api.controller.FileController;
import com.example.sep3rest.api.controller.PrivateFileController;
import com.example.sep3rest.api.controller.UserController;
import com.example.sep3rest.api.model.logic.FileLogicImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;


@SpringBootApplication

public class Sep3restApplication {

    public static void main(String[] args) {


        SpringApplication.run(Sep3restApplication.class, args);

        Server server = ServerBuilder.forPort(9090).addService(new FileController())
                .addService(new UserController())
                .addService(new CategoryController()).
        addService(new PrivateFileController()).build();
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
