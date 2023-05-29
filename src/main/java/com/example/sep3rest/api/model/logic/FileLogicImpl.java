package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.DTOs.FileCreationDTO;
import com.example.sep3rest.api.model.DTOs.FileDownloadDto;
import com.example.sep3rest.api.model.DTOs.FileUpdateDto;
import com.example.sep3rest.api.model.domain.*;
import com.example.sep3rest.protobuf.Logicserver;
import com.google.protobuf.ByteString;
import org.springframework.stereotype.Component;



@Component
public class FileLogicImpl implements FileLogic {


    @Override
    public void validateFile(Logicserver.FileCreationDto file) throws Exception{

        if (file.getTitle().isEmpty() || file.getDescription().isEmpty()
        || file.getBytes() == null || file.getCategory() == null) {
            throw new Exception("You have not filled all the fields. TRY AGAIN.");
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
    public Logicserver.File FileToProto(File file) {
        Logicserver.Category category = Logicserver.Category.newBuilder()
            .setName(file.getCategory().getName())
            .build();

        Logicserver.User user = Logicserver.User.newBuilder()
            .setUsername(file.getUploadedBy().getUsername())
            .setPassword(file.getUploadedBy().getPassword())
            .setName(file.getUploadedBy().getName())
            .setIsAdmin(file.getUploadedBy().isAdmin())
            .setId(file.getUploadedBy().getId())
            .build();

        return Logicserver.File.newBuilder()
            .setTitle(file.getTitle())
            .setDescription(file.getDescription())
            .setCategory(category)
            .setId(file.getId())
            .setUploadedBy(user)
            .build();
    }

    @Override
    public Logicserver.FileDownloadDto FileToProto(FileDownloadDto file) {
        Logicserver.FileDownloadDto response = Logicserver.FileDownloadDto.newBuilder()
                .setBytes(ByteString.copyFrom(file.getBytes()))
                .setTitle(file.getTitle())
                .setContentType(file.getContentType()).build();
        return response;
    }

    @Override
    public FileUpdateDto protoToFileUpdate(Logicserver.FileUpdateDto file) {
        Category category = new Category("Uncategorized",0);

        return new FileUpdateDto(file.getTitle(), file.getDescription(), category,
                file.getId());
    }
}
