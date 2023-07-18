package com.century.arquitecturehexagonaldemo.infraestructure.inputadapter;

import com.century.arquitecturehexagonaldemo.domain.Orders;
import com.century.arquitecturehexagonaldemo.infraestructure.inputport.OrdersInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "api/orders")
public class OrdersAPI {

    @Autowired
    private OrdersInputPort ordersInputPort;


    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Orders create(@RequestParam String customerId, @RequestParam BigDecimal total) {
        return ordersInputPort.createOrders(customerId, total);
    }
}
