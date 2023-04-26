package com.example.sep3rest;

import com.example.sep3rest.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class Sep3restApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sep3restApplication.class, args);
    }

}
