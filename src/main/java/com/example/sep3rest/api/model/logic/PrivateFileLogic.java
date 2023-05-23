package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.FileCreationDTO;
import com.example.sep3rest.api.model.domain.FileDTO;
import com.example.sep3rest.api.model.domain.PrivateFile;
import com.example.sep3rest.api.model.domain.PrivateFileCreationDTO;
import com.example.sep3rest.protobuf.Logicserver;

public interface PrivateFileLogic {

    void validateFile(Logicserver.PrivateFileCreationDto file) throws Exception;
    PrivateFileCreationDTO protoToFile(Logicserver.PrivateFileCreationDto file);
    Logicserver.PrivateFile FileToProto(PrivateFile file);
}
