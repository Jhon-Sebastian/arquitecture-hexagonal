package com.century.arquitecturehexagonaldemo.infraestructure.inputadapter;

import com.century.arquitecturehexagonaldemo.domain.Customer;
import com.century.arquitecturehexagonaldemo.infraestructure.inputport.CustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/customer")
public class CustomerAPI {

    @Autowired
    private CustomerInputPort customerInputPort;

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer get(@RequestParam String customerId) {
        return customerInputPort.getById(customerId);
    }

    @GetMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getAll() {
        return customerInputPort.getAll();
    }

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer create(@RequestParam String name, @RequestParam String country) {
        return customerInputPort.createCustomer(name, country);
    }

}
