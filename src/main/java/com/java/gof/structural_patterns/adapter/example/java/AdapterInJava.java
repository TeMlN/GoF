package com.java.gof.structural_patterns.adapter.example.java;

import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        //우리는 배열을 파라미터로 넘기지만, List로 반환해준다. 이는 asList가 Adapter Pattern으로 배열을 리스트로 변환해주는것이다.

        Enumeration<String> enumeration = Collections.enumeration(list);
        ArrayList<String> enumList = Collections.list(enumeration);
    }
}
