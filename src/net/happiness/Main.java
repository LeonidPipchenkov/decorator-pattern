package net.happiness;

import net.happiness.decorator.impl.BasicIceCream;
import net.happiness.decorator.impl.ChocolateIceCream;
import net.happiness.model.impl.EmptyIceCreamCone;
import net.happiness.model.IceCream;
import net.happiness.decorator.impl.VanillaIceCream;

public class Main {

    public static void main(String[] args) {
        IceCream emptyIceCreamCone = new EmptyIceCreamCone();
        System.out.printf("Empty ice-cream cone costs %.2f $.\n", emptyIceCreamCone.cost());

        IceCream basicIceCream = new BasicIceCream(emptyIceCreamCone);
        System.out.printf("After adding basic ice-cream it costs %.2f $.\n", basicIceCream.cost());

        IceCream vanillaIceCream = new VanillaIceCream(basicIceCream);
        System.out.printf("After adding vanilla ice-cream it costs %.2f $.\n", vanillaIceCream.cost());

        IceCream chocolateIceCream = new ChocolateIceCream(vanillaIceCream);
        System.out.printf("After adding chocolate ice-cream it costs %.2f $.\n", chocolateIceCream.cost());
    }

}
