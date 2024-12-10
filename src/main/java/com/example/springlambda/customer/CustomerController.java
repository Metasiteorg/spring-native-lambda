package com.example.springlambda.customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;
    @GetMapping
    public List<CustomerView> getCustomers() {
        return customerRepository.listCustomers();
    }
}
