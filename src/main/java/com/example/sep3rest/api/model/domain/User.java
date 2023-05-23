package com.example.sep3rest.api.model.domain;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
    @JsonProperty
    private String name;
    @JsonProperty
    private boolean isAdmin;
    @JsonProperty
    private int id;

   @JsonCreator
    public User(@JsonProperty("username") String username,
                @JsonProperty("password") String password,
                @JsonProperty("name") String name,
                @JsonProperty("isAdmin") boolean isAdmin,
                @JsonProperty("id") int id

   ) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.isAdmin = isAdmin;
        this.id = id;
    }

    public User()
    {

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
       return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
