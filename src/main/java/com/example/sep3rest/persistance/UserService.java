package com.example.sep3rest.persistance;


import com.example.sep3rest.api.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private RestTemplate restTemplate = new RestTemplate();


    public User isUserRegistered(String username) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String url = "http://localhost:5285/users/" + username;
        ResponseEntity<User> response = restTemplate.getForEntity(url, User.class);
        User user = response.getBody();
        if (user == null) {
            throw  new RuntimeException("User not found. It is not possible to upload files without being registered");
        }
       else return user;
    }
}
