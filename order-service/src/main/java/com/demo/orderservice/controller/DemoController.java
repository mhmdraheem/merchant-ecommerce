package com.demo.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class DemoController {

    @Value("${spring.cloud.consul.discovery.instance-id:}")
    private String instance;

    @GetMapping
    public String ping() {
        return instance;
    }
}
