package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {
    @Value("${spring.profiles.active:Unknown}")
    private String activeProfile;

    @Autowired
    Environment environment;

    @GetMapping("/environment")
    public String environment() {
        return "Active profile: " + activeProfile;
    }

    @GetMapping("/environment2")
    public String environment2() {
        return "Data: " + environment.getProperty("my.prop");
    }
}
