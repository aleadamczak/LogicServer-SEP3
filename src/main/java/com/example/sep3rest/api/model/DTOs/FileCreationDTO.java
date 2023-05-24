package com.example.sep3rest.api.model.DTOs;

import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.protobuf.Logicserver;

public class FileCreationDTO {

    private String title;
    private String description;
    private Category category;
    private User uploadedBy;
    private byte[] bytes;
    private String contentType;

    public FileCreationDTO(String title, String description, Category category, User uploadedBy, byte[] bytes, String contentType) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.uploadedBy = uploadedBy;
        this.bytes = bytes;
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public User getUploadedBy() {
        return uploadedBy;
    }

    public byte[] getBytes() {
        return bytes;
    }
}
