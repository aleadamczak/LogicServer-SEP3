package com.example.sep3rest.persistance;

import com.example.sep3rest.api.model.File;
import com.example.sep3rest.api.model.FileDTO;
import com.example.sep3rest.api.model.User;
import com.example.sep3rest.property.FileStorageProperties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

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

    public List<FileDTO> getAllFiles() {
        String url = "http://localhost:5285/file/getAllFiles";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        String responseJson = responseEntity.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<FileDTO> files = new ArrayList<>();
        try {
            files = objectMapper.readValue(responseJson, new TypeReference<List<FileDTO>>() {});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        //for testing purpose
//        files.add(new FileDTO("TestTitle","Desc", "Category", new User(), new byte[0]));

        return files;
    }
}
