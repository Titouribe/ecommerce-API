package com.ecommerce.app.services;

import com.ecommerce.app.model.dtos.Pucharse;
import com.ecommerce.app.model.dtos.PucharseResponse;

public interface ICheckoutService {

    PucharseResponse placeOrder(Pucharse pucharse);
}
