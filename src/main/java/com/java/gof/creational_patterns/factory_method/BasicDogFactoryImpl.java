package com.java.gof.creational_patterns.factory_method;

public class BasicDogFactoryImpl implements DogFactory {

    @Override
    public Dog createDog() {
        return new BasicDog();
    }
}
