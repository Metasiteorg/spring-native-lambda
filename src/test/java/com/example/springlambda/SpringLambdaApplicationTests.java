package com.example.springlambda;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class SpringLambdaApplicationTests {

    @Container
    @ServiceConnection
    private static final MongoDBContainer MONGO_DB_CONTAINER = new MongoDBContainer();

    @Test
    void contextLoads() {
    }

}
