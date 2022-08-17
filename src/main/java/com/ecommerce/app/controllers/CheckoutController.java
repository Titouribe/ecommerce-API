package com.ecommerce.app.controllers;

import com.ecommerce.app.model.dtos.Pucharse;
import com.ecommerce.app.model.dtos.PucharseResponse;
import com.ecommerce.app.services.impl.CheckoutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkout")
@CrossOrigin(origins = "http://localhost:8081")
public class CheckoutController {

    @Autowired
    private CheckoutServiceImpl checkoutService;

    @PostMapping("/pucharse")
    public PucharseResponse doOrder(@RequestBody Pucharse pucharse) {
        return checkoutService.placeOrder(pucharse);
    }
}
