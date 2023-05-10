package com.example.sep3rest.persistance;

import com.example.sep3rest.api.model.File;
import com.example.sep3rest.api.model.FileDTO;
import com.example.sep3rest.property.FileStorageProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    public ResponseEntity<File> storeFile(FileDTO file) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<FileDTO> request = new HttpEntity<>(file, headers);
        String url = "http://localhost:5285/file/uploadFile";
        ResponseEntity<File> response = restTemplate.postForEntity(url, request, File.class);
        if (response.getStatusCode() != HttpStatus.CREATED) {
            throw new RuntimeException();
        }
        return response;

    }

    public Resource loadFileAsResource(String filename)
    {
        try{
            Path filePath = this.fileStorageLocation.resolve(filename).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists())
            {
                return resource;
            } else {
                throw new RuntimeException("File not found " + filename);
            }
        }catch (MalformedURLException e)
        {
            throw new RuntimeException("File not found " + filename);
        }
    }
}
