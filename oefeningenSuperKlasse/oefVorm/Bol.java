package oefeningenSuperKlasse.oefVorm;

public class Bol extends Vorm {
    int straal;

    public Bol(String kleur, int straal) {
        super(kleur);
        this.straal = straal;
    }

    public int getStraal() {
        return straal;
    }

    public double oppervlakte() {
        double result = 4.00 * Math.PI * (straal*straal);
        return result;
    }

    public double volume() {

        double result = 4.00/3.00*Math.PI*(straal*straal*straal);
        return result;
    }

    @Override
    public String toString() {
        return String.format("De kleur is:%s\n" +
                "De straal is: %d\n"+
                "De oppervlakte is: %.2f\n"+
                "Het volume is: %.2f\n",super.getKleur(),getStraal(),oppervlakte(),volume());
    }
}
