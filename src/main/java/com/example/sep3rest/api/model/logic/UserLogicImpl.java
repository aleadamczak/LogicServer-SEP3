package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.persistance.FileService;
import com.example.sep3rest.persistance.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserLogicImpl implements UserLogic{

    @Autowired
    private UserService userService = new UserService();
    @Override
    public User isUserRegistered(String username) throws Exception {
        User user;
        try {
            user = userService.getUserByUsername(username).getBody();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("User not found.");
        }
        return user;
    }
}
