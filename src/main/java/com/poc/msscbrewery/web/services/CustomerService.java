package com.poc.msscbrewery.web.services;

import com.poc.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
   CustomerDTO getCustomerById(UUID id);
}
