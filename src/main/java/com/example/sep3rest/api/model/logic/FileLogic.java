package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.DTOs.FileCreationDTO;
import com.example.sep3rest.api.model.DTOs.FileUpdateDto;
import com.example.sep3rest.api.model.domain.File;
import com.example.sep3rest.api.model.DTOs.FileDownloadDto;
import com.example.sep3rest.protobuf.Logicserver;
import org.springframework.stereotype.Component;

@Component
public interface FileLogic {



    void validateFile(Logicserver.FileCreationDto file) throws Exception;
    FileCreationDTO protoToFile(Logicserver.FileCreationDto file);

    FileUpdateDto protoToFileUpdate(Logicserver.FileUpdateDto file);

    Logicserver.File FileToProto(File file);
    Logicserver.FileDownloadDto FileToProto(FileDownloadDto file);
}
