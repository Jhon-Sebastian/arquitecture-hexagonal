package com.century.arquitecturehexagonaldemo.application;

import com.century.arquitecturehexagonaldemo.domain.Customer;
import com.century.arquitecturehexagonaldemo.domain.Orders;
import com.century.arquitecturehexagonaldemo.infraestructure.inputport.CustomerInputPort;
import com.century.arquitecturehexagonaldemo.infraestructure.inputport.OrdersInputPort;
import com.century.arquitecturehexagonaldemo.infraestructure.outputport.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class OrdersUseCase implements OrdersInputPort {

    @Autowired
    private EntityRepository entityRepository;

    @Autowired
    private CustomerInputPort customerInputPort;

    @Override
    public Orders createOrders(String customerId, BigDecimal total) {
        Customer customer = customerInputPort.getById(customerId);
        if (customer == null) {
            throw new RuntimeException("No exits the customer");
        }
        Orders order = Orders.builder()
                .id(UUID.randomUUID().toString())
                .customerId(customer.getId())
                .total(total)
                .build();
        return entityRepository.save(order);
    }
}
