package net.happiness.model.impl;

import net.happiness.model.IceCream;
import net.happiness.model.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding a Chocolate.");
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }

}
