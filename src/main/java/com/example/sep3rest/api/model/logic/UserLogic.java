package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.protobuf.Logicserver;
import org.springframework.stereotype.Component;

@Component
public interface UserLogic {

    User isUserRegistered(String username) throws Exception;
    Logicserver.UserDisplayDtoList getAll();

    User protoToUser(Logicserver.User user);
}
