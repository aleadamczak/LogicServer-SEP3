package com.example.sep3rest.persistance;

import com.example.sep3rest.api.model.domain.FileDTO;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.domain.UserDisplayDto;
import com.example.sep3rest.protobuf.UserControllerGrpc;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private RestTemplate restTemplate;

@Autowired
    public UserService() {
        this.restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new MappingJackson2HttpMessageConverter());
        this.restTemplate.setMessageConverters(messageConverters);
    }


    public ResponseEntity<User> getUserByUsername(String username)  {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String url = "http://localhost:5285/users/" + username;
        System.out.println(url);
        ResponseEntity<User> response = restTemplate.getForEntity(url, User.class);
        User user = response.getBody();
//        if (user == null) {
//            throw  new Exception("User not found. It is not possible to upload files without being registered");
//        }
        if (response.getStatusCode() != HttpStatus.OK) {
           return response;
        }

       else return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    public ResponseEntity<List<UserDisplayDto>> getAll() {

        String url = "http://localhost:5285/users/getAll";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        ResponseEntity<List<UserDisplayDto>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<List<UserDisplayDto>>() {}
        );
        List<UserDisplayDto> users = responseEntity.getBody();
        return responseEntity;
    }
}
