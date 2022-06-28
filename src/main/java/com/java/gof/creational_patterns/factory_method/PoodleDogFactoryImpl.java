package com.java.gof.creational_patterns.factory_method;

public class PoodleDogFactoryImpl implements DogFactory {

    @Override
    public Dog createDog() {
        return new PoodleDog();
    }
}
