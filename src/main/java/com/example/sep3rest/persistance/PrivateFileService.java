package com.example.sep3rest.persistance;


import com.example.sep3rest.api.model.DTOs.FileDownloadDto;
import com.example.sep3rest.api.model.DTOs.PrivateFileDisplayDto;
import com.example.sep3rest.api.model.DTOs.UserDisplayDto;
import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.api.model.domain.File;
import com.example.sep3rest.api.model.domain.PrivateFile;
import com.example.sep3rest.api.model.DTOs.PrivateFileCreationDTO;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.protobuf.Logicserver;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
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

    public ResponseEntity<PrivateFile> storeFile(PrivateFileCreationDTO file) throws Exception {
        HttpEntity<PrivateFileCreationDTO> request = new HttpEntity<>(file, headers);
        String url = "http://localhost:5285/privateFile/uploadFile";
        ResponseEntity<PrivateFile> response = restTemplate.postForEntity(url, request, PrivateFile.class);
        if (response.getStatusCode() != HttpStatus.CREATED) {
            throw new Exception(response.getStatusCode().toString());
        }
        return response;
    }

    public ResponseEntity<List<PrivateFileDisplayDto>> getSharedWith(User user) throws Exception {
        String url = "http://localhost:5285/PrivateFile/getSharedWithMe/" + user.getId();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        ResponseEntity<List<PrivateFileDisplayDto>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<List<PrivateFileDisplayDto>>() {}
        );

        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception(responseEntity.getStatusCode().toString());
        }
        return responseEntity;
    }

    public ResponseEntity<FileDownloadDto> downloadFile(int fileId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Integer> request = new HttpEntity<>(fileId, headers);
        String url = "http://localhost:5285/PrivateFile/downloadPrivateFile?fileId={fileId}";
        ResponseEntity<FileDownloadDto> response = restTemplate.exchange(url, HttpMethod.GET, request, FileDownloadDto.class,fileId);

        return response;
    }

    public ResponseEntity<PrivateFile> delete(int id) throws Exception {
        String url = "http://localhost:5285/PrivateFile/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        ResponseEntity<PrivateFile> response = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, PrivateFile.class);

        if (response.getStatusCode()!= HttpStatus.OK) {
            throw new Exception("Data server error" + response.getStatusCode() + response.toString());
        }
        return response;
    }



}
