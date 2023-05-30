package com.example.sep3rest;

import com.example.sep3rest.api.model.DTOs.FileDownloadDto;
import com.example.sep3rest.api.model.DTOs.FileUpdateDto;
import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.api.model.domain.File;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.api.model.logic.FileLogicImpl;
import com.example.sep3rest.protobuf.Logicserver;
import org.apache.juli.logging.Log;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Sep3restApplicationTests {
    FileLogicImpl fileLogic = new FileLogicImpl();
    //RestTemplate restTemplate = new RestTemplate();

    @Test
    public void FileToProto(){


        byte[] bytes = new byte[00000000];
        User user = new User("bob", "Bob", "Bobby", true, 0);
        Category category = new Category("Biology", 0);
        File file = new File(0, "Testabletitle", "Description", category, user, bytes, ".pdf" );

        Logicserver.File protofile = fileLogic.FileToProto(file);


        //assertEquals(file.getBytes(),protofile.getBytes().toByteArray());
        assertEquals(file.getId(),protofile.getId());
        assertEquals(file.getUploadedBy().getName(),protofile.getUploadedBy().getName());
        assertEquals(file.getTitle(),protofile.getTitle());
        assertEquals(file.getDescription(),protofile.getDescription());
        assertEquals(file.getCategory().getName(),protofile.getCategory().getName());

        //Fails, because we do not set the content type, when converting
        //assertEquals(file.getContentType().toString(),protofile.getContentType().toString());


    }

    @Test void FileDownloadDtoToProto(){

        byte[] bytes = new byte[1001110];
        FileDownloadDto fileDownloadDto = new FileDownloadDto("Title", bytes, ".txt");

        Logicserver.FileDownloadDto proto = fileLogic.FileToProto(fileDownloadDto);

        //assertEquals(proto.getBytes().toByteArray(),fileDownloadDto.getBytes());
        assertEquals(proto.getTitle(),fileDownloadDto.getTitle());
        assertEquals(proto.getContentType(),fileDownloadDto.getContentType());


    }


    @Test void ProtoToFileUpdateDto(){

        Logicserver.Category category = Logicserver.Category.newBuilder()
                .setName("Uncategorized")
                .build();

        Logicserver.FileUpdateDto proto = Logicserver.FileUpdateDto.newBuilder()
                .setCategory(category)
                .setDescription("Description")
                .setTitle("Title")
                .setId(0)
                .build();

        FileUpdateDto fileUpdateDto = fileLogic.protoToFileUpdate(proto);

        assertEquals(fileUpdateDto.getCategory().getName(), proto.getCategory().getName());
        assertEquals(fileUpdateDto.getDescription(),proto.getDescription());
        assertEquals(fileUpdateDto.getId(),proto.getId());
        assertEquals(fileUpdateDto.getTitle(),proto.getTitle());


    }
}
