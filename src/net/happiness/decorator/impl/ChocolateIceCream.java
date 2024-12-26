package net.happiness.decorator.impl;

import net.happiness.model.IceCream;
import net.happiness.decorator.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding a chocolate ice-cream");
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }

}
