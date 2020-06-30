package oefeningenSuperKlasse.oefHeroes;

public class Tank extends Hero {
    public Tank() {
    }

    public Tank(String naam) {
        super(naam);
    }

    public Tank(String naam, int anAge) {
        super(naam, anAge);
    }

    @Override
    public void useSuperPower() {
        super.useSuperPower();
        System.out.println("and let's SOOOOOAAAK it");
    }

    @Override
    public String toString() {
        System.out.println("\n"+getHeroName());
        useSuperPower();
        return  "I am THE tank, the vanguard, the club in the night";
    }

    @Override
    public String getHeroName() {
        return super.getHeroName();
    }
}
