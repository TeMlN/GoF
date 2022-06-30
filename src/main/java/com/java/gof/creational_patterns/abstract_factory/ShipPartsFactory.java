package com.java.gof.creational_patterns.abstract_factory;

// 추상 팩토리
public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
