package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.PriceList;

public class IceCreamSalon implements  IceCreamSeller {
    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        Cone aCone = new Cone(flavors);
        totalProfit+=(priceList.getBallPrice()*flavors.length);
        return aCone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket anIceRocket = new IceRocket();
        totalProfit+=(priceList.getRocketPrice());
        return anIceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType aType) {
        Magnum aMagnum = new Magnum(aType);
        totalProfit+=(priceList.getMagnumStandardPrice(aType));
        return aMagnum;
    }

    @Override
    public String toString() {
        return String.format("You have accumulated %.2f euro profits.\n%s",getProfit(),
                "Now you can finally afford that hitman for your mother-in-law using a different magnum.");
    }
}
