package com.example.sep3rest.api.model.DTOs;

import com.example.sep3rest.api.model.domain.User;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PrivateFileDisplayDto {

    private String title;
    private String contentType;
//    private User uploadedBy;
    private byte[] bytes;

    private int id;

    @JsonCreator
    public PrivateFileDisplayDto(
            @JsonProperty("title") String title,
            @JsonProperty("contentType") String contentType,
            @JsonProperty("uploadedBy") User uploadedBy,
            @JsonProperty("bytes") byte[] bytes,
            @JsonProperty("id") int id) {
        this.title = title;
        this.contentType = contentType;
//        this.uploadedBy = uploadedBy;
        this.bytes = bytes;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

//    public User getUploadedBy() {
//        return uploadedBy;
//    }
//
//    public void setUploadedBy(User uploadedBy) {
//        this.uploadedBy = uploadedBy;
//    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
