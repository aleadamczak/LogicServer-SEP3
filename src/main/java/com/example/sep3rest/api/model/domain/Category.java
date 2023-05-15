package com.example.sep3rest.api.model.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

    @JsonProperty
    private String name;


    @JsonProperty
    private int id;

    @JsonCreator
    public Category(@JsonProperty("name") String name,
                    @JsonProperty("id") int id){
        this.name = name;
        this.id= id;
    }



    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }
}
