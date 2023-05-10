package com.example.sep3rest.persistance;

import com.example.sep3rest.api.model.Category;
import com.example.sep3rest.api.model.File;
import com.example.sep3rest.api.model.FileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CategoryService {



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


}
