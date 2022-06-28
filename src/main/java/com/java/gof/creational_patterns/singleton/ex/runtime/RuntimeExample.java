package com.java.gof.creational_patterns.singleton.ex.runtime;

public class RuntimeExample {
    public static void main(String[] args) {

        // Runtime 클래스에서 static eager initialization 으로 Runtime 인스턴스를 생성함
        // new 생성자() 사용불가능
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
