package com.poc.msscbrewery.web.services;

import com.poc.msscbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
