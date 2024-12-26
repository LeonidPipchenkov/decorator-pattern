package net.happiness.decorator;

import net.happiness.model.IceCream;

public class IceCreamDecorator implements IceCream {

    private final IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        return this.iceCream.cost();
    }

}
