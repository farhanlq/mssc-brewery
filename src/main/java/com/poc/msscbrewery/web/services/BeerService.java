package com.poc.msscbrewery.web.services;

import com.poc.msscbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);
}