package com.ecommerce.app.model.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class ProductDTO {

    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal unitPrice;
    private String imgUrl;
    private boolean active;
    private int unitsInStock;
    private Date dateCreated;
    private Date lastUpdated;
    private CategoryDTO categoryDTO;

}
