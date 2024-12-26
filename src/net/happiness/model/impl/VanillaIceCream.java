package net.happiness.model.impl;

import net.happiness.model.IceCream;
import net.happiness.model.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding a Vanilla.");
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

}
