package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.File;
import com.example.sep3rest.api.model.FileDTO;
import com.example.sep3rest.persistance.FileService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    // post end point for uploading a file :)
    @PostMapping("/uploadFile")
    public ResponseEntity<FileDTO>uploadFile(@RequestBody FileDTO file)
    {
        System.out.println("File received in java server");
        file.setCategory("COMEDY BRO");
        fileService.storeFile(file);
        System.out.println("File sent to the service");
        return ResponseEntity.status(HttpStatus.OK).body(file);
    }

    @GetMapping("/downloadFile/{fileId:.+}")
    public ResponseEntity<File> downloadFile(@PathVariable int fileId)
    {
        File resource = fileService.loadFileAsResource(fileId);

        return ResponseEntity.status(HttpStatus.OK).body(resource);

    }
}
