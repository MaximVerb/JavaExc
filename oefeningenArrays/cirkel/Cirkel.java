package oefeningenArrays.cirkel;

import static java.lang.Math.PI;

public class Cirkel {
    int straal;
    String kleur = "zwart";

    public Cirkel(int eenStraal) {
        this(eenStraal,"zwart");
    }

    public Cirkel(int eenStraal, String eenkleur) {
        straal = eenStraal;
        kleur = eenkleur;
    }

    public double omtrek() {
        double omtrek = 2 * PI * straal;
        return omtrek;
    }

    public int getStraal() {
        return straal;
    }

    public String getKleur() {
        return kleur;
    }

    public double oppervlakte() {
       double oppervlakte = PI * Math.pow(straal,2);
       return oppervlakte;
    }

    public double verschilOmtrek(Cirkel eenAndereCirkel) {
        double result = omtrek() - eenAndereCirkel.omtrek();
        return result;
    }

    public double verschilOppervlakte(Cirkel eenAndereCirkel) {
        double result = oppervlakte() - eenAndereCirkel.oppervlakte();
        return result;
    }

    @Override
    public String toString(){
        return String.format("De kleur is: %s \n" +
                "De straal is: %d\n" +
                "De omtrek is: %.2f\n" +
                "De oppervlakte is: %.2f\n", getKleur(), getStraal(), omtrek(), oppervlakte());
    }
}
