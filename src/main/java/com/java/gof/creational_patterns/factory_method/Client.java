package com.java.gof.creational_patterns.factory_method;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new PoodleDogFactoryImpl(), "Poodle", "female");
        client.print(new BasicDogFactoryImpl() , "Basic Dog", "male");
    }
    private void print(DogFactory dogFactory, String name, String gender) {
        System.out.println(dogFactory.bringDog(name, gender));
    }
}