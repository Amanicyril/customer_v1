package com.javaguides.CustomerSpringBootv1.controller;

import com.javaguides.CustomerSpringBootv1.entity.customer;
import com.javaguides.CustomerSpringBootv1.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/customers")
public class controller {

    @Autowired
    private repository Repository;

    @GetMapping
    public List<customer>getAllCustomer(){
        return Repository.findAll();

    }
@PostMapping
public Object createCustomers(@RequestBody customer Customer) { return Repository.save(Customer);
    }
}
