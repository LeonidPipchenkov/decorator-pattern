package net.happiness.decorator.impl;

import net.happiness.model.IceCream;
import net.happiness.decorator.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding a vanilla ice-cream");
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

}
