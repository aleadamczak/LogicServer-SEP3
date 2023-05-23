package com.example.sep3rest.api.model.DTOs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDisplayDto {

    @JsonProperty
    private String username;
    @JsonProperty
    private String name;
    @JsonProperty
    private boolean isAdmin;

    @JsonCreator
    public UserDisplayDto(@JsonProperty ("username") String username,
                          @JsonProperty ("name") String name,
                          @JsonProperty("isAdmin") boolean isAdmin) {
        this.username = username;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
