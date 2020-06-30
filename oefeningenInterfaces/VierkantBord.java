package oefeningenInterfaces;

public class VierkantBord extends Bord{
    double zijde;
    public static final String SOORT = "SOORT";

    public VierkantBord(String kleur, String materiaal, double zijde) {
        super(kleur, materiaal);
        this.zijde=zijde;
    }

    @Override
    public double oppervlakte() {
        return zijde*zijde;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t\t%-9s %.2f",SOORT,oppervlakte());
    }
}
