package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.protobuf.Logicserver;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Component
public class CategoryLogicImpl implements CategoryLogic{



    @Override
    public Category protoToCategory(Logicserver.Category category) {
        return new Category(category.getName(), category.getId());

    }

    @Override
    public Logicserver.CategoryList categoriesToProto(List<Category> categories) {

        Logicserver.CategoryList.Builder responseBuilder = Logicserver.CategoryList.newBuilder();
        for (int i = 0; i < categories.size() ; i++) {

//            Category current = categories.get(i);
//            Logicserver.Category category = Logicserver.Category.newBuilder().setId(current.getId()).setName(current.getName()).build();
//
//            response.newBuilder().setCategories(i, category).build();

            Category current = categories.get(i);
            Logicserver.Category category = Logicserver.Category.newBuilder()
                    .setId(current.getId())
                    .setName(current.getName())
                    .build();

            responseBuilder.addCategories(category);

        }
        Logicserver.CategoryList response = responseBuilder.build();
        return response;
    }
}
