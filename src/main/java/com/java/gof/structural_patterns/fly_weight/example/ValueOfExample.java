package com.java.gof.structural_patterns.fly_weight.example;

public class ValueOfExample {
    // valueOf 도 많이 사용하는 데이터들을 caching 해놓기 떄문에 1, 10, 100같은 값들을 ==비교를 해도 true지만
    // 1000, 10000, 100000.. 등은 false가 반환된다.
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        System.out.println(i1 == i2);
    }
}
