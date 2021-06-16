package com.microservicepractice.limitsservice.controller;

import com.microservicepractice.limitsservice.configuration.Configuration;
import com.microservicepractice.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @GetMapping ("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMaximum(), configuration.getMinimum());
    }
}
