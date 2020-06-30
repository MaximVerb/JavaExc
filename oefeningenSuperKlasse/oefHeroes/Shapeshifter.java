package oefeningenSuperKlasse.oefHeroes;

public class Shapeshifter extends Hero {
    public Shapeshifter() {
    }

    public Shapeshifter(String naam) {
        super(naam);
    }

    public Shapeshifter(String naam, int anAge) {
        super(naam, anAge);
    }

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("and let's DISAPPEAR from view");
    }

    @Override
    public String toString() {
        System.out.println("\n"+getHeroName());
        useSuperPower();
        return "*Whistles*";
    }

    @Override
    public String getHeroName() {
        return super.getHeroName();
    }
}
