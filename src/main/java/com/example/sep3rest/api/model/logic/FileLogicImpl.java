package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.*;
import com.example.sep3rest.protobuf.Logicserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class FileLogicImpl implements FileLogic {


    @Override
    public void validateFile(Logicserver.FileCreationDto file) throws Exception{

        if (file.getTitle().isEmpty()) {
            throw new Exception("Title cannot be empty");
        }

        if (file.getTitle().length() < 3 || file.getTitle().length() > 30) {
            throw new Exception("Invalid title length");
        }

        if (file.getUploadedBy() == null) {
            throw new Exception("Cannot upload a file without being logged in.");
        }

        if (file.getDescription().isEmpty()) {
            throw new Exception("File Description cannot be empty");
        }

    }

    @Override
    public FileCreationDTO protoToFile(Logicserver.FileCreationDto file) {
        Category category = new Category(file.getCategory().getName(),0);

        User user = new User(file.getUploadedBy().getUsername(),
                file.getUploadedBy().getPassword(),file.getUploadedBy().getName(),
                file.getUploadedBy().getIsAdmin(), file.getUploadedBy().getId());

        return new FileCreationDTO(file.getTitle(), file.getDescription(), category,
        user,file.getBytes().toByteArray(), file.getContentType());
    }

    @Override
    public Logicserver.File FileToProto(FileDTO file) {

        return null;
    }
}
