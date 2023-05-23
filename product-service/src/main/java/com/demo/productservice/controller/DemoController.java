package com.demo.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class DemoController {

    @Value("${spring.cloud.consul.discovery.instance-id:}")
    private String instance;

    @GetMapping
    public String ping() {
        return instance;
    }
}
