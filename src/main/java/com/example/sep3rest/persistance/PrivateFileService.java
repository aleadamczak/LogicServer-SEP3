package com.example.sep3rest.persistance;


import com.example.sep3rest.api.model.domain.FileCreationDTO;
import com.example.sep3rest.api.model.domain.FileDTO;
import com.example.sep3rest.api.model.domain.PrivateFile;
import com.example.sep3rest.api.model.domain.PrivateFileCreationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrivateFileService {

    private RestTemplate restTemplate = new RestTemplate();
    private HttpHeaders headers = new HttpHeaders();

    public PrivateFileService() {
        headers.setContentType(MediaType.APPLICATION_JSON);
    }

    public ResponseEntity<PrivateFile> storeFile(PrivateFileCreationDTO file) {
        HttpEntity<PrivateFileCreationDTO> request = new HttpEntity<>(file, headers);
        String url = "http://localhost:5285/privateFile/uploadFile";
        ResponseEntity<PrivateFile> response = restTemplate.postForEntity(url, request, PrivateFile.class);
        if (response.getStatusCode() != HttpStatus.CREATED) {
            throw new RuntimeException();
        }
        return response;
    }



}
