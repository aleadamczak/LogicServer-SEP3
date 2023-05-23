package com.example.sep3rest.api.model.logic;

import com.example.sep3rest.api.model.domain.Category;
import com.example.sep3rest.protobuf.Logicserver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryLogic {

    Category protoToCategory(Logicserver.Category category);

    Logicserver.CategoryList categoriesToProto(List<Category> categories);

    Logicserver.Category categoryToProto(Category category);
}
