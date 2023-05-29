package com.example.sep3rest.api.model.DTOs;

import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.api.model.domain.User;
import com.example.sep3rest.protobuf.Logicserver;

public class FileUpdateDto {

    private String title;
    private String description;
    private Category category;
    private int id;

    public FileUpdateDto(String title, String description, Category category,int id) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.id = id;
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

    public int getId(){return id;}
}
