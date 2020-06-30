package oefeningenSuperKlasse.oefDieren;

public class Basenji extends Hond{

    public Basenji( String kleur, int aantalPoten, String geluid) {
        super(kleur,aantalPoten,"");
    }

    @Override
    public Basenji getDierKopie() {return new Basenji(getKleur(), getAantalPoten(), ""); }

    @Override
    public String toString() {
        return super.toString();
    }
}
