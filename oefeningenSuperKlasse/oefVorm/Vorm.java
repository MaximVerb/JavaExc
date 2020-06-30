package oefeningenSuperKlasse.oefVorm;

public abstract class Vorm {
    String kleur;

    public Vorm(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public abstract double oppervlakte();

    public abstract double volume();

}
