package com.java.gof.factory_method;

public class PoodleDogFactoryImpl implements DogFactory {

    @Override
    public Dog createDog() {
        return new PoodleDog();
    }
}
