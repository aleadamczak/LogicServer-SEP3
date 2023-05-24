package com.example.sep3rest.api.model.DTOs;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCreationDto {

  @JsonProperty
  private String username;
  @JsonProperty
  private String password;
  @JsonProperty
  private String name;
  @JsonProperty
  private boolean isAdmin;

  @JsonCreator
  public UserCreationDto(@JsonProperty("username") String username,
      @JsonProperty("password") String password,
      @JsonProperty("name") String name,
      @JsonProperty("isAdmin") boolean isAdmin)
  {
    this.username = username;
    this.password = password;
    this.name = name;
    this.isAdmin = isAdmin;
  }

  public UserCreationDto()
  {

  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getName() {
    return name;
  }

  public boolean isAdmin() {
    return isAdmin;
  }
}
