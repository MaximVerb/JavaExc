package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList aPriceList = new PriceList(1,2,3);
        IceCreamSalon anIceCreamSalon = new IceCreamSalon(aPriceList);

        IceCreamSeller anIceCreamSeller = anIceCreamSalon ;
        Eatable[] listOfEatables = new Eatable[] {anIceCreamSeller.orderIceRocket(),anIceCreamSeller.orderMagnum(MagnumType.BLACKCHOCOLATE),
        anIceCreamSeller.orderCone(new Flavor[]{Flavor.BANANA, Flavor.CHOCOLATE})};

        for(Eatable eatable: listOfEatables) { eatable.eat();}

       System.out.println(anIceCreamSeller.toString());
    }
}
