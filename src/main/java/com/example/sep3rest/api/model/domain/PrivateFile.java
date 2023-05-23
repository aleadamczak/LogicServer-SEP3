package com.example.sep3rest.api.model.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PrivateFile {

    private String title;
    private String contentType;
    private User uploadedBy;
    private List<User> haveAccess;
    private byte[] bytes;
    private int id;

    @JsonCreator
    public PrivateFile(
            @JsonProperty("title") String title,
            @JsonProperty("contentType") String contentType,
            @JsonProperty("uploadedBy") User uploadedBy,
            @JsonProperty("haveAccess") List<User> haveAccess,
            @JsonProperty("bytes") byte[] bytes,
            @JsonProperty("id") int id) {
        this.title = title;
        this.contentType = contentType;
        this.uploadedBy = uploadedBy;
        this.haveAccess = haveAccess;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
