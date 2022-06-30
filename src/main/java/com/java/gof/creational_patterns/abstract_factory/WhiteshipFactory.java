package com.java.gof.creational_patterns.abstract_factory;

import com.java.gof.creational_patterns.abstract_factory.old_code.DefaultShipFactory;
import com.java.gof.creational_patterns.abstract_factory.old_code.Ship;
import com.java.gof.creational_patterns.abstract_factory.old_code.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
