package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
        this(0, 0, 0);
    }

    public PriceList(double ballPrice,double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice =rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumStandardPrice(MagnumType aType) {
        //if (aType.getClass().isInstance(MagnumType.values())) {
            switch (aType) {
                case ALPINENUTS:
                    return 1.2 * magnumStandardPrice;
                case MILKCHOCOLATE:
                case BLACKCHOCOLATE:
                    return 1.5 * magnumStandardPrice;
                case WHITECHOCOLATE:
                case ROMANTICSTRAWBERRIES:
                    return 2.0 * magnumStandardPrice;
            }
        return 0.0;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
