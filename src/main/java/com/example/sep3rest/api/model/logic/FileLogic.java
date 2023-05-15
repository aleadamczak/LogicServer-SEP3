package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.File;
import com.example.sep3rest.api.model.domain.FileCreationDTO;
import com.example.sep3rest.api.model.domain.FileDTO;
import com.example.sep3rest.protobuf.Logicserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface FileLogic {



    void validateFile(Logicserver.FileCreationDto file) throws Exception;
    FileCreationDTO protoToFile(Logicserver.FileCreationDto file);

    Logicserver.File FileToProto(FileDTO file);
}
