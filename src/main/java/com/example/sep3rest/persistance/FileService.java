package com.example.sep3rest.persistance;

import com.example.sep3rest.api.model.File;
import com.example.sep3rest.api.model.FileDTO;
import com.example.sep3rest.property.FileStorageProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileService {

    private final Path fileStorageLocation;
    private RestTemplate restTemplate = new RestTemplate();



    @Autowired
    public FileService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception e) {
            throw new RuntimeException("Could not create the directory", e);
        }
    }

    // method that sends the file to the data server
    public String storeFile(FileDTO file) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<File> request = new HttpEntity<>(file, headers);
        String url = "http://localhost:5285/file/uploadFile";
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException(response.getBody());
        }
        return response.getBody();

    }

    public FileDTO loadFileAsResource(int fileId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Integer> request = new HttpEntity<>(fileId, headers);
        String url = "http://localhost:5285/File/downloadFile?fileId={fileId}";
        ResponseEntity<FileDTO> response = restTemplate.exchange(url, HttpMethod.GET, request, FileDTO.class,fileId);
        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException(response.getBody().toString());
        }
        return response.getBody();
    }

    }

