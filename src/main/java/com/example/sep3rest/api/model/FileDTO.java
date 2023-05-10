package com.example.sep3rest.api.model;



import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileDTO implements File {

    @JsonProperty
    private String title;
    @JsonProperty
    private String description;
    @JsonProperty
    private String category;
    @JsonProperty
    private User uploadedBy;
//    private MultipartFile file;
    @JsonProperty
    private byte[] bytes;

    @JsonCreator
    public FileDTO(@JsonProperty("title") String title,@JsonProperty("description") String description,@JsonProperty("category") String category,@JsonProperty("uploaded by") User uploadedBy,@JsonProperty("bytes") byte[] bytes) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.uploadedBy = uploadedBy;
        this.bytes = bytes;
    }

//    public MultipartFile getFile() {
//        return file;
//    }

    public void setUser(User uploadedBy) {
        this.uploadedBy = uploadedBy;
    }


    public String getTitle() {
        return title;
    }
    public String getBytesString() {
        var string = "";
        for (int i = 0; i < bytes.length; i++) {
            string += bytes[i];
        }
        return string;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public User getUploadedBy() {
        return uploadedBy;
    }

    public String getCategory() {
        return category;
    }

    public byte[] getBytes() {
        return bytes;
    }
}
