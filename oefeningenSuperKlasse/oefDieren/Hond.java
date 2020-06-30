package oefeningenSuperKlasse.oefDieren;

import java.util.Objects;

public class Hond extends Dier{
    String geluid;

    public Hond(String kleur, int aantalPoten, String geluid) {
        super(kleur, aantalPoten);
        this.geluid = geluid;
    }

    @Override
    public Hond getDierKopie() {return new Hond(getKleur(),getAantalPoten(),getGeluid());}

    public String getGeluid() {
        return geluid;
    }

    public void setGeluid(String eenGeluid) { geluid = eenGeluid; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Hond hond = (Hond) o;

        return getGeluid().equals(hond.getGeluid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), geluid);
    }

    @Override
    public String toString() {
        return String.format("%s\t\t\t%s",super.toString(),getGeluid());
    }
}
