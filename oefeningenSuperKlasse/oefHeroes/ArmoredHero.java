package oefeningenSuperKlasse.oefHeroes;

public class ArmoredHero extends Hero {
    public ArmoredHero() {
    }

    public ArmoredHero(String naam) {
        super(naam);
    }

    public ArmoredHero(String naam, int anAge) {
        super(naam, anAge);
    }

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("and let's RAAAMMMMM it");
    }

    @Override
    public String toString() {
        System.out.println("\n"+getHeroName());
        useSuperPower();
        return "I am THE armored hero";
    }

    @Override
    public String getHeroName() {
        return super.getHeroName();
    }
}
