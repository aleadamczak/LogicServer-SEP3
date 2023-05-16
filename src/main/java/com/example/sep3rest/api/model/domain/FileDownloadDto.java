package com.example.sep3rest.api.model.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FileDownloadDto {
    private String title;
    private byte[] bytes;

    @JsonCreator
    public FileDownloadDto(@JsonProperty("title") String title, @JsonProperty("bytes") byte[] bytes)
    {
        this.title = title;
        this.bytes = bytes;
    }

    public String getTitle() {
        return title;
    }

    public byte[] getBytes() {
        return bytes;
    }
}
