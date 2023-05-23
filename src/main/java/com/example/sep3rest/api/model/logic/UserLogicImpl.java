package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.domain.UserDisplayDto;
import com.example.sep3rest.persistance.FileService;
import com.example.sep3rest.persistance.UserService;
import com.example.sep3rest.protobuf.Logicserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    @Override
    public Logicserver.UserDisplayDtoList getAll() {
        List<UserDisplayDto> allUsers = userService.getAll().getBody();
        Logicserver.UserDisplayDtoList.Builder responseBuilder = Logicserver.UserDisplayDtoList.newBuilder();
        for (int i = 0; i < allUsers.size() ; i++) {

            UserDisplayDto current = allUsers.get(i);
            Logicserver.UserDisplayDto userDisplayDtoProto =
                    Logicserver.UserDisplayDto.newBuilder().
                            setName(current.getName()).setUsername(current.getUsername())
                                    .setIsAdmin(current.isAdmin()).
                            build();

            responseBuilder.addUsers(userDisplayDtoProto);

        }
        Logicserver.UserDisplayDtoList response = responseBuilder.build();
        return response;
    }

}

