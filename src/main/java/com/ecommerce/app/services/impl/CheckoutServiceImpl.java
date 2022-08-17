package com.ecommerce.app.services.impl;

import com.ecommerce.app.model.dtos.Pucharse;
import com.ecommerce.app.model.dtos.PucharseResponse;
import com.ecommerce.app.model.entities.Customer;
import com.ecommerce.app.model.entities.Order;
import com.ecommerce.app.model.entities.OrderItem;
import com.ecommerce.app.repositories.ICustomerRepository;
import com.ecommerce.app.services.ICheckoutService;
import com.ecommerce.app.util.GenerateOrderTrackingNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class CheckoutServiceImpl implements ICheckoutService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private GenerateOrderTrackingNumber generateOrderTrackingNumber;

    @Override
    @Transactional
    public PucharseResponse placeOrder(Pucharse pucharse) {

        Order order = pucharse.getOrder();

        Customer customer = pucharse.getCustomer();

        String orderTrackingNumber = GenerateOrderTrackingNumber.generateRandomUUID();
        order.setOrderTrackingNumber(orderTrackingNumber);

        Set<OrderItem> orderItems = pucharse.getOrderItems();
        orderItems.forEach(order::addOrderItem);

        order.setBillingAddress(pucharse.getBillingAddress());
        order.setShoppingAddress(pucharse.getShippingAddress());

        customer.addOrder(order);

        customerRepository.save(customer);

        return new PucharseResponse(orderTrackingNumber);
    }
}
