package com.java.gof.creational_patterns.factory_method.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFactoryBeanExample {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        String hello = ac.getBean("hello", String.class);
        System.out.println(hello);

        String bye = ac.getBean("bye", String.class);
        System.out.println(bye);

        System.out.println(hello == bye); //false
    }
}
