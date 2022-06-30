package com.java.gof.structural_patterns.adapter.example.spring;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class SpringMvcExample {
    public static void main(String[] args) {
        //우리가 작성하는 다양한 형태의 핸들러 코드를 Spring MVC가 실행할 수 있는 형태로 변환해주는 어댑터용 인터페이스.
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
    }
}
