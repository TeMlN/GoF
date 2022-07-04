package com.java.gof.structural_patterns.decorator.example.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());
        books.add(new Item());

        Collections.unmodifiableList(list);
    }

    private static class Book {

    }

    private static class Item {

    }
}
