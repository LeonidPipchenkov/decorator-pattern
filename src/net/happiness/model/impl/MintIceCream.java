package net.happiness.model.impl;

import net.happiness.model.IceCream;
import net.happiness.model.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding a Mint.");
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

}
