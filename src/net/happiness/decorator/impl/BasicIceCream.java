package net.happiness.decorator.impl;

import net.happiness.decorator.IceCreamDecorator;
import net.happiness.model.IceCream;

public class BasicIceCream extends IceCreamDecorator {

    public BasicIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding a basic ice-cream");
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

}
