package net.happiness.decorator.impl;

import net.happiness.model.IceCream;
import net.happiness.decorator.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding a mint ice-cream");
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }

}
