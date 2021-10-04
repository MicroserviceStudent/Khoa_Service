package com.example.khoa_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class KhoaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhoaServiceApplication.class, args);
    }
}
