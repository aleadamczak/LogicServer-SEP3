package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.Category;
import com.example.sep3rest.api.model.PublicFile;
import com.example.sep3rest.persistance.FileService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.tomcat.util.file.ConfigurationSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
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

    @PostMapping("/uploadFile")
    public PublicFile uploadFile(@RequestParam("file")MultipartFile file)
    {
        String fileName = fileService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile")
                .path(fileName)
                .toUriString();
        return new PublicFile(fileName, fileDownloadUri, new Category("comedy"));
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
