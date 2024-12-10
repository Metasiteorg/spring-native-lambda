package com.example.springlambda.customer;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import jakarta.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Testcontainers
class CustomerRepositoryTest {

    @Container
    @ServiceConnection
    private static final MongoDBContainer MONGO_DB_CONTAINER = new MongoDBContainer();
    @Resource
    private CustomerRepository customerRepository;

    @Test
    public void testListCustomer() {
        var customer = new Customer(null, "John", "Doe", List.of("log1", "log2"));
        var savedCustomer = customerRepository.saveCustomer(customer);

        var result = customerRepository.listCustomers();

        assertEquals(1, result.size());
        assertEquals(savedCustomer.getId().toString(), result.getFirst().id());
    }

}
