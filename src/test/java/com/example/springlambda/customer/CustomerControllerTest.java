package com.example.springlambda.customer;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import jakarta.annotation.Resource;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CustomerController.class)
class CustomerControllerTest {
    @MockitoBean
    private CustomerRepository customerRepository;

    @Resource
    private MockMvc mockMvc;

    @Test
    void testGetCustomers() throws Exception {
        var customer = new CustomerView("1", "John", "Doe");
        when(customerRepository.listCustomers()).thenReturn(List.of(customer));

        mockMvc.perform(get("/customer"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$[0].id").value("1"))
               .andExpect(jsonPath("$[0].firstName").value("John"))
               .andExpect(jsonPath("$[0].lastName").value("Doe"));
    }
}
