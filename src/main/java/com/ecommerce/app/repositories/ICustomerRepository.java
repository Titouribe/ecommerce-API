package com.ecommerce.app.repositories;

import com.ecommerce.app.model.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
