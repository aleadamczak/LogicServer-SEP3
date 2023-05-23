package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.*;
import com.example.sep3rest.protobuf.Logicserver;
import com.google.protobuf.ByteString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrivateFileLogicImpl implements PrivateFileLogic{
    @Override
    public void validateFile(Logicserver.PrivateFileCreationDto file) throws Exception {

        if (file.getTitle().isEmpty() || file.getBytes() == null) {
            throw new Exception("You have not filled all the fields. TRY AGAIN.");
        }

        if (file.getTitle().length() < 3 || file.getTitle().length() > 30) {
            throw new Exception("Invalid title length");
        }

        if (file.getUploadedBy() == null) {
            throw new Exception("Cannot upload a file without being logged in.");
        }
    }

    @Override
    public PrivateFileCreationDTO protoToFile(Logicserver.PrivateFileCreationDto file) {
        User user = protoToUser(file.getUploadedBy());
        List<Logicserver.User> protoUserList = file.getHaveAccess().getUsersList();
        List<User> domainUserList = new ArrayList<>();
        for (Logicserver.User u:
             protoUserList) {
            domainUserList.add(protoToUser(u));
        }

        return new PrivateFileCreationDTO(file.getTitle(), file.getContentType(),
                user,domainUserList,file.getBytes().toByteArray());

    }

    @Override
    public Logicserver.PrivateFile FileToProto(PrivateFile file) {

        Logicserver.User user = Logicserver.User.newBuilder()
                .setId(file.getUploadedBy().getId()).setIsAdmin(file.getUploadedBy().isAdmin())
                .setName(file.getUploadedBy().getName()).setPassword(
                        file.getUploadedBy().getPassword()).setUsername(file.getUploadedBy().getUsername()).build();

        Logicserver.UserList.Builder responseBuilder = Logicserver.UserList.newBuilder();

        List<User> haveAccessDomain = file.getHaveAccess();
        for (int i = 0; i < haveAccessDomain.size() ; i++) {

            User current = haveAccessDomain.get(i);
            Logicserver.User currentProto = Logicserver.User.newBuilder()
                    .setId(current.getId())
                    .setName(current.getName()).setIsAdmin(current.isAdmin())
                    .setUsername(current.getUsername()).setPassword(current.getPassword())
                    .build();

            responseBuilder.addUsers(currentProto);

        }
        Logicserver.UserList userList = responseBuilder.build();

        return Logicserver.PrivateFile.newBuilder().setId(file.getId())
                .setBytes(ByteString.copyFrom(file.getBytes())).setUploadedBy(user)
                .setContentType(file.getContentType()).setHaveAccess(userList).build();
    }

    private User protoToUser(Logicserver.User user) {

    return new User(user.getUsername(),
            user.getPassword(),user.getName(),
            user.getIsAdmin(), user.getId());
    }


}
