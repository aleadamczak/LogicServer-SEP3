package com.example.sep3rest.api.model.DTOs;

import com.example.sep3rest.api.model.domain.User;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;


public class PrivateFileCreationDTO {

    private String title;
    private String contentType;
    private User uploadedBy;
    private List<User> haveAccess;
    private byte[] bytes;


    @JsonCreator
    public PrivateFileCreationDTO(
            @JsonProperty("title") String title,
            @JsonProperty("contentType") String contentType,
            @JsonProperty("uploadedBy") User uploadedBy,
            @JsonProperty("haveAccess") List<User> sharedWithUsers,
            @JsonProperty("bytes") byte[] bytes) {
        this.title = title;
        this.contentType = contentType;
        this.uploadedBy = uploadedBy;
        this.haveAccess = sharedWithUsers;
        this.bytes = bytes;
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

    public User getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(User uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public List<User> getHaveAccess() {
        return haveAccess;
    }

    public void setHaveAccess(List<User> haveAccess) {
        this.haveAccess = haveAccess;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
