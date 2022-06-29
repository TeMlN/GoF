package com.java.gof.creational_patterns.factory_method.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String hello() {
        return "hello";
    }

    @Bean
    public String bye() {
        return "bye";
    }
}
