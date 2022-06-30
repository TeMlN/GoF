package com.java.gof.creational_patterns.builder.example.spring;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class UriComponentExample {
    public static void main(String[] args) {

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("martial.tistory.com")
                .build().encode();

        System.out.println(uriComponents);
    }
}
