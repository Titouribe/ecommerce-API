package com.ecommerce.app.model.dtos;

import com.ecommerce.app.model.entities.Address;
import com.ecommerce.app.model.entities.Customer;
import com.ecommerce.app.model.entities.Order;
import com.ecommerce.app.model.entities.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Pucharse {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
