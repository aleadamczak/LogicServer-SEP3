package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.DTOs.FileDownloadDto;
import com.example.sep3rest.api.model.DTOs.PrivateFileDisplayDto;
import com.example.sep3rest.api.model.domain.PrivateFile;
import com.example.sep3rest.api.model.DTOs.PrivateFileCreationDTO;
import com.example.sep3rest.protobuf.Logicserver;

import java.util.List;

public interface PrivateFileLogic {

    void validateFile(Logicserver.PrivateFileCreationDto file) throws Exception;
    PrivateFileCreationDTO protoToFile(Logicserver.PrivateFileCreationDto file);
    Logicserver.PrivateFile FileToProto(PrivateFile file);
    Logicserver.FileDownloadDto FileToProto(FileDownloadDto file);


    Logicserver.PrivateFileDisplayDtoList filesToProto(List<PrivateFileDisplayDto> privateFileDisplayDtoList);
}
