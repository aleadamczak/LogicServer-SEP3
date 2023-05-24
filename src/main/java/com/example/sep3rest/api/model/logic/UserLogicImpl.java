package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.DTOs.UserCreationDto;
import com.example.sep3rest.api.model.DTOs.UserLoginDto;
import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.DTOs.UserDisplayDto;
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

    @Override public Logicserver.UserCreationDto UserToProto(UserCreationDto userCreationDto)
    {
        Logicserver.UserCreationDto response = Logicserver.UserCreationDto.newBuilder().setName(
            userCreationDto.getName()).setIsAdmin(userCreationDto.isAdmin()).setPassword(
            userCreationDto.getPassword()).setUsername(
            userCreationDto.getUsername()).build();
        return response;
    }

    public UserCreationDto ProtoToUser(Logicserver.UserCreationDto user) {

        return new UserCreationDto(user.getUsername(),
            user.getPassword(),user.getName(),
            user.getIsAdmin());
    }

    public Logicserver.UserLogInDto UserToProto (UserLoginDto userLoginDto)
    {
        Logicserver.UserLogInDto response = Logicserver.UserLogInDto.newBuilder().setUsername(
            userLoginDto.getUsername()).setPassword(userLoginDto.getPassword()).build();
        return response;
    }

    public UserLoginDto ProtoToUser (Logicserver.UserLogInDto userLogInDto)
    {
        return new UserLoginDto(userLogInDto.getUsername(),
            userLogInDto.getPassword());

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

    @Override
    public User protoToUser(Logicserver.User user) {
        return new User(user.getUsername(), user.getPassword(), user.getName()
        , user.getIsAdmin(), user.getId());
    }

}

