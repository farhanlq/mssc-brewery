package com.poc.msscbrewery.web.controller;

import com.poc.msscbrewery.web.services.CustomerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


}
