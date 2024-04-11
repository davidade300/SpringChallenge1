package com.challenge.services;

import com.challenge.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public double total(Order order) {
        return  order.getBasic() + shippingService.shipment(order)
                - order.getDiscount();
    }
}
