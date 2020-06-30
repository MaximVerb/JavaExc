package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.PriceList;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone (Flavor[] flavors) throws NoMoreIceCreamException {
        stock.setCones(stock.getCones()-1);
        if (stock.getCones() > 0 )
        {
            return prepareCone(flavors);
        }
        else {throw new NoMoreIceCreamException("There are no more Cones left in stock.");}
    }

    private Cone prepareCone(Flavor[] flavors) {
        Cone aCone = new Cone(flavors);
        profit+=(priceList.getBallPrice()*flavors.length);
        return aCone;
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException{
        stock.setIceRockets(stock.getIceRockets()-1);
        if(stock.getIceRockets() > 0)
        {
            return prepareRocket();
        }
        else { throw new NoMoreIceCreamException("There are no more Icerockets in stock.");}
    }

    private IceRocket prepareRocket() {
        IceRocket anIceRocket = new IceRocket();
        profit += (priceList.getRocketPrice());
        return anIceRocket;
    }

    @Override
    public Magnum orderMagnum (MagnumType aType) throws NoMoreIceCreamException {
        stock.setMagni(stock.getMagni()-1);
        if(stock.getMagni() > 0)
        {
            return prepareMagnum(aType);
        }
        else {
            throw new NoMoreIceCreamException("There are no more magnums left in stock.");
            }
    }

    private Magnum prepareMagnum (MagnumType aType) {
        Magnum aMagnum = new Magnum(aType);
        profit+=(priceList.getMagnumStandardPrice(aType));
        return aMagnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
