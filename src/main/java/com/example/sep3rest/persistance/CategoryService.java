package com.example.sep3rest.persistance;

import com.example.sep3rest.api.model.domain.Category;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService  {



    private RestTemplate restTemplate = new RestTemplate();


    public  ResponseEntity<Category> storeCategory(Category category) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Category> request = new HttpEntity<>(category, headers);
        String url = "http://localhost:5285/category/uploadCategory";
        ResponseEntity<Category> response = restTemplate.postForEntity(url, request, Category.class);
        if (response.getStatusCode() != HttpStatus.CREATED) {
            throw new RuntimeException();
        }
        System.out.println(response.getStatusCode());
        return response;

    }

    public ResponseEntity<List<Category>> getAllCategories(){
        String url = "http://localhost:5285/Category/getCategories";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        String responseJson = responseEntity.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<Category> categories = new ArrayList<>();
        try {
            categories = objectMapper.readValue(responseJson, new TypeReference<>() {
            });
            if (!categories.isEmpty())
                System.out.println(categories.get(0).getName());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    public ResponseEntity<Category> removeCategory(Category category){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Category> request = new HttpEntity<>(category, headers);
        String url = "http://localhost:5285/category/deleteCategory";
        ResponseEntity<Category> response = restTemplate.exchange(url, HttpMethod.DELETE, request, Category.class);
        if (response.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException();
        }

        return response;

    }

}
