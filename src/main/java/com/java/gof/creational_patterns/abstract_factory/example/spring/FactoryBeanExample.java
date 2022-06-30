package com.java.gof.creational_patterns.abstract_factory.example.spring;

import com.java.gof.creational_patterns.abstract_factory.old_code.Ship;
import com.java.gof.creational_patterns.abstract_factory.old_code.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanExample implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
