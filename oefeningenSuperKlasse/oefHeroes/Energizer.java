package oefeningenSuperKlasse.oefHeroes;

public class Energizer extends Hero {
    public Energizer() {
    }

    public Energizer(String naam) {
        super(naam);
    }

    public Energizer(String naam, int anAge) {
        super(naam, anAge);
    }

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("and let's LAZERBLAST it");
    }

    @Override
    public String toString() {
        System.out.println("\n"+getHeroName());
        useSuperPower();
        return  "I am THE energizer *wink*";
    }

    @Override
    public String getHeroName() {
        return super.getHeroName();
    }
}
