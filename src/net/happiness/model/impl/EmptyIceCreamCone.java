package net.happiness.model.impl;

import net.happiness.model.IceCream;

public class EmptyIceCreamCone implements IceCream {

    public EmptyIceCreamCone() {
        System.out.println("Taking an empty ice-cream cone");
    }

    @Override
    public double cost() {
        return 0.50;
    }

}
