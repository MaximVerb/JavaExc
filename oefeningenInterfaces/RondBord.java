package oefeningenInterfaces;

public class RondBord extends Bord{
    double diameter;
    static final String SOORT = "Rond";

    public RondBord(String kleur, String materiaal, double diameter) {
        super(kleur, materiaal);
        this.diameter = diameter;
    }

    @Override
    public double oppervlakte() {
        return diameter* Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t\t%-9s %.2f",SOORT,oppervlakte());
    }
}
