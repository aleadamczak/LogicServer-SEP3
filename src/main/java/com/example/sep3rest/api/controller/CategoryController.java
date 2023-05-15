package com.example.sep3rest.api.controller;

import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.persistance.CategoryService;
import com.example.sep3rest.protobuf.CategoryControllerGrpc;
import com.example.sep3rest.protobuf.Logicserver;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController extends CategoryControllerGrpc.CategoryControllerImplBase {

    @Autowired

    private CategoryService categoryService;

    @Override
    public void addCategory(Logicserver.Category request, StreamObserver<Logicserver.Category> responseObserver) {

    }

    @Override
    public void removeCategory(Logicserver.Category request, StreamObserver<Logicserver.Empty> responseObserver) {

    }

    @Override
    public void getAll(Logicserver.Empty request, StreamObserver<Logicserver.CategoryList> responseObserver) {

    }

    @Override
    public void update(Logicserver.Category request, StreamObserver<Logicserver.Category> responseObserver) {

    }

    //    @PostMapping("/uploadCategory")
//    public ResponseEntity<Category> uploadCategory(@RequestBody Category category)
//    {
//        System.out.println("Category received in java server");
//        System.out.println(category.getName());
//
//        System.out.println("Category sent to the service");
//        return categoryService.storeCategory(category);
//    }
}
