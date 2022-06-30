package com.java.gof.creational_patterns.abstract_factory;

import com.java.gof.creational_patterns.abstract_factory.old_code.Ship;
import com.java.gof.creational_patterns.abstract_factory.old_code.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();

        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        ShipFactory whiteshipFactory = new WhiteshipFactory(new WhiteShipPartsFactory());
    }
}
