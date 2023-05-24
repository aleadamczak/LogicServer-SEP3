package com.example.sep3rest.api.model.DTOs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLoginDto
{
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;

    @JsonCreator
    public UserLoginDto(@JsonProperty("username") String username,
        @JsonProperty("password") String password)
    {
      this.username = username;
      this.password = password;

    }

    public UserLoginDto()
    {

    }

    public String getUsername() {
      return username;
    }

    public String getPassword() {
      return password;
    }

}