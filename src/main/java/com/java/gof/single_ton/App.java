package com.java.gof.single_ton;

public class App {
    public static void main(String[] args) {
//        Settings settings = new Settings();
//        Settings settings1 = new Settings();
//        System.out.println(settings!=settings1); // 서로 다른 instance이기 떄문에 true

        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();

        System.out.println(settings!=settings1);

    }
}
