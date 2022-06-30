package com.java.gof.creational_patterns.builder;

public class Client {
    public static void main(String[] args) {

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cacncunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();

        System.out.println(tourPlan);
        System.out.println(tourPlan1);
    }
}
