package com.century.arquitecturehexagonaldemo.infraestructure.inputport;

import com.century.arquitecturehexagonaldemo.domain.Orders;

import java.math.BigDecimal;

public interface OrdersInputPort {

    Orders createOrders(String customerId, BigDecimal total);

}
