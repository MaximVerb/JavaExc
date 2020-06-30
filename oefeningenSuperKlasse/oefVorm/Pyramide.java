package oefeningenSuperKlasse.oefVorm;

public class Pyramide extends Vorm {
    int zijde;
    int hoogte;

    public Pyramide(String kleur, int zijde, int hoogte) {
        super(kleur);
        this.zijde = zijde;
        this.hoogte = hoogte;
    }

    public int getZijde() {
        return zijde;
    }

    public void setZijde(int zijde) {
        this.zijde = zijde;
    }

    public int getHoogte() {
        return hoogte;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public double oppervlakte() {
        double result = (zijde*zijde) + (2 * zijde) * Math.sqrt((getZijde()/2) * (getZijde()/2) + hoogte*hoogte);
        return result;
    }

    public double volume() {
        double result = (double)(zijde*zijde*hoogte)/3;
        return result;
    }

    @Override
    public String toString() {
        return String.format("De kleur is:%s\n" +
                "De zijde is: %d\n"+
                "De hoogte is: %d\n" +
                "De oppervlakte is: %.2f\n"+
                "Het volume is: %.2f\n",super.getKleur(),getZijde(),getHoogte(),oppervlakte(),volume());
    }


}
