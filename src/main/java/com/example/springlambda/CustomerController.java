package com.example.springlambda;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public List<Customer> getCustomers() {
        return List.of(new Customer("1", "John", "Doe"));
    }
}
