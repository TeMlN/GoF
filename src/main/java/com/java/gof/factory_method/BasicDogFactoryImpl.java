package com.java.gof.factory_method;

public class BasicDogFactoryImpl implements DogFactory {

    @Override
    public Dog createDog() {
        return new BasicDog();
    }
}
