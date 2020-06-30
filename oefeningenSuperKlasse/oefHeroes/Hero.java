package oefeningenSuperKlasse.oefHeroes;

import java.util.Random;

public class Hero {
    private  Random rand = new Random();
    private String heroName;
    private int ageHero;

    Hero() {
        heroName = alias();
        ageHero = age();
    }

    Hero(String naam) {
       heroName= naam;
       ageHero = age();
    }

    Hero(String naam, int anAge) {
        heroName = naam;
        ageHero = anAge;
    }

    void useSuperPower() {
        System.out.println("Pew Pew");
    }

    String alias() {
        String[] heroAlias = {"Clark Kent","Bruce Wayne","Peter Parker","Diana","Edward Nigma","Steven Roger","Tony Stark"};
        return heroAlias[rand.nextInt(6)];
    }

    int age() {
     return rand.nextInt(20) + 20;
    }

    String getHeroName() {
        return heroName;
    }
}
