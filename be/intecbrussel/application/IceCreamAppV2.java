package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.sellers.PriceList;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        Stock aStock = new Stock(5, 5, 5, 5);
        PriceList aPriceList = new PriceList(1, 2, 3);
        IceCreamCar anIceCreamCar = new IceCreamCar(aPriceList, aStock);

        IceCreamSeller anIceCreamSeller = anIceCreamCar;
        Eatable[] listOfEatables = new Eatable[7];

        System.out.println("You only have " + aStock.getIceRockets() + " icerockets in stock");

        try {
            for (int i = 1; i < 8; i++)
            {
                String statement = (i == 1) ? "You are ordering " + i + " icerocket" : "You are ordering " + i + " icerockets";
                System.out.println(statement);

                listOfEatables[i] = anIceCreamSeller.orderIceRocket();
                }
            }
        catch (NoMoreIceCreamException e)
        {
            System.out.println(e.getMessage());
        }


        try {
            for (Eatable eatable : listOfEatables) {
                eatable.eat();
            }
        }

        catch (NullPointerException npe) {
            System.out.println("You ate the entire stock");
        }
    }
}
