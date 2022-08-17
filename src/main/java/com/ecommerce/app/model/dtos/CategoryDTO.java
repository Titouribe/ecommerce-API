package com.ecommerce.app.model.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
public class CategoryDTO {

    private Long id;
    private String name;
    private Set<ProductDTO> productsDTO;

}
