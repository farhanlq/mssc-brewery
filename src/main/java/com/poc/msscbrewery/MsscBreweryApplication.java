package com.poc.msscbrewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.poc.msscbrewery.web.services","com.poc.msscbrewery.web.controller","com.poc.msscbrewery.web.model"})
public class MsscBreweryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBreweryApplication.class, args);
    }

}
