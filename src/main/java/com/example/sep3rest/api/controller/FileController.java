package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.File;
import com.example.sep3rest.api.model.FileDTO;
import com.example.sep3rest.api.model.User;
import com.example.sep3rest.persistance.FileService;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
        System.out.println(file.getTitle());
        System.out.println(file.getBytes());
        file.setCategory("COMEDY BRO");
        User user = new User("papp", "papp", "Papp",true);
        file.setUser(user);
        String fileName = fileService.storeFile(file);
        System.out.println("File sent to the service");
        return ResponseEntity.status(HttpStatus.OK).body(file);
    }

    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request)
    {
        Resource resource = fileService.loadFileAsResource(fileName);

        String contentType = null;

        try
        {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());

        } catch (IOException e){
            throw new RuntimeException("Could not determine file type");
        }

        if (contentType == null)
        {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
