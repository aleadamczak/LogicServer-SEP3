package com.example.sep3rest.api.model.DTOs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FileDownloadDto {
    private String title;
    private byte[] bytes;
    private String contentType;

    @JsonCreator
    public FileDownloadDto(@JsonProperty("title") String title, @JsonProperty("bytes") byte[] bytes, @JsonProperty("contentType") String contentType)
    {
        this.title = title;
        this.bytes = bytes;
        this.contentType = contentType;
    }

    public String getTitle() {
        return title;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public String getContentType() {
        return contentType;
    }
}
