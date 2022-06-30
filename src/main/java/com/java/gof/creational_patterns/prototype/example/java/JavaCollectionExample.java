package com.java.gof.creational_patterns.prototype.example.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student taemin = new Student("taemin");
        Student youjin = new Student("youjin");
        List<Student> students = new ArrayList<>();

        students.add(taemin);
        students.add(youjin);
        System.out.println(students);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
