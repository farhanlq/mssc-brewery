package com.poc.msscbrewery.web.services;

import com.poc.msscbrewery.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ace")
                .build();

    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO) {
         return BeerDTO.builder().id(UUID.randomUUID())
                 .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {

    }
}
