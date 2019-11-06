package com.poc.msscbrewery.web.controller;

import com.poc.msscbrewery.web.model.BeerDTO;
import com.poc.msscbrewery.web.services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {


    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDTO> handlePost(BeerDTO beerDTO){

        BeerDTO saveDTO = beerService.saveNewBeer(beerDTO);
        HttpHeaders headers =  new HttpHeaders();
        headers.add("Location","http:localhost:8080/api/v1/beer/"+ saveDTO.getId().toString());
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> handleUpdate(@PathVariable("beerId") UUID beerId ,BeerDTO beerDTO){
    beerService.updateBeer(beerId,beerDTO);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}