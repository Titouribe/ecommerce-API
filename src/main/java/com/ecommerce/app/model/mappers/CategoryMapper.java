package com.ecommerce.app.model.mappers;

import com.ecommerce.app.model.dtos.CategoryDTO;
import com.ecommerce.app.model.entities.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(target = "products", source = "productsDTO")
    Category toEntity(CategoryDTO categoryDTO);
    @InheritInverseConfiguration
    CategoryDTO toDTO(Category category);

    default List<CategoryDTO> toDTOList(List<Category> categoryList){
        if(categoryList == null){
            return new ArrayList<>();
        }
        return categoryList.stream().map(this::toDTO).toList();
    }
}
