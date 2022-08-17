package com.ecommerce.app.model.mappers;

import com.ecommerce.app.model.dtos.ProductDTO;
import com.ecommerce.app.model.entities.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface ProdutMapper {

    @Mapping(target = "category", source = "categoryDTO")
    Product toEntity(ProductDTO productDTO);
    @InheritInverseConfiguration
    ProductDTO toDTO(Product product);

    default List<ProductDTO> toDTOList(List<Product> productList){
        if(productList == null){
            return new ArrayList<>();
        }
        return productList.stream().map(this::toDTO).toList();
    }

}
