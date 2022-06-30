package com.java.gof.creational_patterns.builder.example.java;

public class StringUtilExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String taemin = stringBuilder.append("martial").append("taemin").toString();
        System.out.println(taemin);
    }

}
