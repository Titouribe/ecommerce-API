package com.ecommerce.app.repositories;

import com.ecommerce.app.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Long> {
}
