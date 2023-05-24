package com.example.sep3rest.api.model.domain;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class File {

    private String title;
    private String description;
    private Category category;
    private User uploadedBy;
    private byte[] bytes;
    private int id;
    private String contentType;

    @JsonCreator
    public File(@JsonProperty("id") int id, @JsonProperty("title") String title,
                @JsonProperty("description") String description,
                @JsonProperty("category") Category category,
                @JsonProperty("uploadedBy") User uploadedBy,
                @JsonProperty("bytes") byte[] bytes, @JsonProperty("contentType") String contentType) {
        this.id = id;
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

    public void setCategory(Category category) {
        this.category = category;
    }


    public Category getCategory() {
        return category;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public int getId()
    {
        return id;
    }

    public User getUploadedBy()
    {
        return uploadedBy;
    }

}
