package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.Category;
import com.example.sep3rest.persistance.CategoryService;
import com.example.sep3rest.persistance.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired

    private CategoryService categoryService;


    @PostMapping("/uploadCategory")
    public ResponseEntity<Category> uploadCategory(@RequestBody Category category)
    {
        System.out.println("Category received in java server");
        System.out.println(category.getName());

        System.out.println("Category sent to the service");
        return categoryService.storeCategory(category);
    }
}
