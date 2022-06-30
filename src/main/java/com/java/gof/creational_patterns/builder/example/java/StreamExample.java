package com.java.gof.creational_patterns.builder.example.java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        Stream<String> build = Stream.<String>builder().add("taemin").add("martial").build();
        build.forEach(System.out::println);
    }
}
