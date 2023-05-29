package com.example.sep3rest.persistance;

import com.example.sep3rest.api.model.DTOs.FileCreationDTO;
import com.example.sep3rest.api.model.DTOs.FileUpdateDto;
import com.example.sep3rest.api.model.domain.File;
import com.example.sep3rest.api.model.DTOs.FileDownloadDto;

import com.example.sep3rest.protobuf.Logicserver;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {

//    private final Path fileStorageLocation;
    private RestTemplate restTemplate = new RestTemplate();



//    @Autowired
//    public FileService(FileStorageProperties fileStorageProperties) {
//        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();
//
//        try {
//            Files.createDirectories(this.fileStorageLocation);
//        } catch (Exception e) {
//            throw new RuntimeException("Could not create the directory", e);
//        }
//    }

    // method that sends the file to the data server
    public ResponseEntity<File> storeFile(FileCreationDTO file) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<FileCreationDTO> request = new HttpEntity<>(file, headers);
        String url = "http://localhost:5285/file/uploadFile";
        ResponseEntity<File> response = restTemplate.postForEntity(url, request, File.class);
        if (response.getStatusCode() != HttpStatus.CREATED) {
            throw new RuntimeException();
        }
        return response;
    }

    public ResponseEntity<FileDownloadDto> downloadFile(int fileId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Integer> request = new HttpEntity<>(fileId, headers);
        String url = "http://localhost:5285/File/downloadFile?fileId={fileId}";
        ResponseEntity<FileDownloadDto> response = restTemplate.exchange(url, HttpMethod.GET, request, FileDownloadDto.class,fileId);
        return response;

    }

//    public Resource loadFileAsResource(String filename)
//    {
//        try{
//            Path filePath = this.fileStorageLocation.resolve(filename).normalize();
//            Resource resource = new UrlResource(filePath.toUri());
//            if (resource.exists())
//            {
//                return resource;
//            } else {
//                throw new RuntimeException("File not found " + filename);
//            }
//        }catch (MalformedURLException e)
//        {
//            throw new RuntimeException("File not found " + filename);
//        }
//    }

    public List<File> getAllFiles() {
        String url = "http://localhost:5285/file/getAllFileDtos";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        String responseJson = responseEntity.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<File> files = new ArrayList<>();
        try {
            files = objectMapper.readValue(responseJson, new TypeReference<List<File>>() {});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        //for testing purpose
//        files.add(new FileDTO("TestTitle","Desc", "Category", new User(), new byte[0]));

        return files;
    }

    public ResponseEntity<File> delete(int id) throws Exception {
        String url = "http://localhost:5285/file/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        ResponseEntity<File> response = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, File.class);

        if (response.getStatusCode()!= HttpStatus.OK) {
            throw new Exception("Data server error" + response.getStatusCode());
        }
        return response;
    }

    public ResponseEntity<File> update(FileUpdateDto file) throws Exception {
        String url = "http://localhost:5285/file/uncategorize/" + file.getId();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        ResponseEntity<File> response = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, File.class);

        if (response.getStatusCode()!= HttpStatus.OK) {
            throw new Exception("Data server error" + response.getStatusCode());
        }
        return response;
    }




}
