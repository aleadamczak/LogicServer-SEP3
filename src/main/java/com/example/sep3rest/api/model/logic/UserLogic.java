package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.DTOs.UserCreationDto;
import com.example.sep3rest.api.model.DTOs.UserLoginDto;
import com.example.sep3rest.protobuf.Logicserver;
import org.springframework.stereotype.Component;

@Component
public interface UserLogic {

    User isUserRegistered(String username) throws Exception;

    Logicserver.UserCreationDto UserToProto(UserCreationDto userCreationDto);

    UserCreationDto ProtoToUser(Logicserver.UserCreationDto userCreationDto);

    Logicserver.UserLogInDto UserToProto (UserLoginDto userLoginDto);

    UserLoginDto ProtoToUser (Logicserver.UserLogInDto userLogInDto);
    Logicserver.UserDisplayDtoList getAll();

    User protoToUser(Logicserver.User user);
}
