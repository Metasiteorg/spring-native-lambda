package com.example.springlambda.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CustomerRepository {

    private final MongoOperations mongoOperations;
    public Optional<Customer> getCustomer(String id) {
        return Optional.ofNullable(mongoOperations.findById(id, Customer.class));
    }

    public Customer saveCustomer(Customer customer) {
        return mongoOperations.save(customer);
    }

    public List<CustomerView> listCustomers() {
        return mongoOperations.query(Customer.class).as(CustomerView.class).all();
    }
}
