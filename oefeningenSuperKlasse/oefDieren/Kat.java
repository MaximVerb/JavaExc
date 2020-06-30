package oefeningenSuperKlasse.oefDieren;

public class Kat extends Dier {
    private String geluid = "Miauw";

    public Kat(String kleur, int aantalPoten, String geluid) {
        super(kleur, aantalPoten);
        this.geluid = geluid;
    }

    public void setGeluid(String geluid) {
        this.geluid = geluid;
    }

    @Override
    public Kat getDierKopie() {
        return new Kat(getKleur(),getAantalPoten(),geluid);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Kat) {
        Kat kat = (Kat) object;
        return geluid.equals(kat.geluid);}
        else {return false; }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        return 31 * result + geluid.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s\t\t\t\t\t%s", super.toString(), geluid);
    }
}


