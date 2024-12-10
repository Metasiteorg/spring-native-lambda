package com.example.springlambda.customer;

import java.util.List;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private ObjectId id;
    private String firstName;
    private String lastName;

    private List<String> log;
}
