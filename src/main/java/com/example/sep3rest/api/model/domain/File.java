package com.example.sep3rest.api.model.domain;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface File  {


    String getTitle();
    User getUploadedBy();

    String getDescription();
}
