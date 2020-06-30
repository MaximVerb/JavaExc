package be.intecbrussel.application;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable{

    Cone orderCone(Flavor[] flavors);

    IceRocket orderIceRocket();

    Magnum orderMagnum(MagnumType aType);

    double getProfit();

}
