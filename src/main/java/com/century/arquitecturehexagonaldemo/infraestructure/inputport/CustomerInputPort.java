package com.century.arquitecturehexagonaldemo.infraestructure.inputport;

import com.century.arquitecturehexagonaldemo.domain.Customer;

import java.util.List;

public interface CustomerInputPort {

    Customer createCustomer(String name, String country);

    Customer getById(String customerId);

    List<Customer> getAll();

}
