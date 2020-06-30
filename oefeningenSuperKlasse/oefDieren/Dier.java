package oefeningenSuperKlasse.oefDieren;

import java.util.Objects;

public class Dier {
    String kleur;
    int aantalPoten;

    public Dier(String eenKleur, int dePoten) {
        kleur = eenKleur;
        aantalPoten = dePoten;
    }

    public Dier getDierKopie() { return new Dier(kleur, aantalPoten);}

    public String getKleur() {
        return kleur;
    }

    public int getAantalPoten() {
        return aantalPoten;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dier dier = (Dier) o;

        return getAantalPoten() == dier.getAantalPoten() &&
                kleur.equals(dier.kleur);
    }

    @Override // kan ook fout zijn
    public int hashCode() {
        return Objects.hash(getKleur(), getAantalPoten());
    }

    @Override
    public String toString() {
        return String.format("%s\t\t\t%d\t\t\t",getKleur(),getAantalPoten());
    }
}
