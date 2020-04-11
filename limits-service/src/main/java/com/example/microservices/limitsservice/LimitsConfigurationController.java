package com.example.microservices.limitsservice;

import com.example.microservices.limitsservice.beans.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsConfiguration() {
        //return new LimitsConfiguration(1000, 1);
        return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
