package oefeningenSuperKlasse.oefHeroes;

public class HeroApp {
    public static void main (String[] args) {

        AllTheHeroes listOfHeroes = new AllTheHeroes();

        ArmoredHero ironMan = new ArmoredHero("Iron Man", 54);
        Tank hulk = new Tank("Hulk", 55);
        Energizer ironFist = new Energizer("Iron Fist", 43);
        Shapeshifter misterFantastic = new Shapeshifter("Mister Fantastic", 56);
        Energizer havok = new Energizer("Havok", 48);
        Shapeshifter mystique = new Shapeshifter("Mystique", 39);

        listOfHeroes.addSuperHero(ironMan);
        listOfHeroes.addSuperHero(hulk);
        listOfHeroes.addSuperHero(ironFist);
        listOfHeroes.addSuperHero(misterFantastic);

        listOfHeroes.removeSuperHero(ironMan);
        listOfHeroes.removeSuperHero(ironFist);
        listOfHeroes.addSuperHero(havok);
        listOfHeroes.addSuperHero(mystique); // mister fantastic is een shapeshifter, dus dat gaat die code niet toevoegen

        print(listOfHeroes.getHeroes());
    }


    private static void print(Hero[] listOfHeroes) {
        printHeader();
        for(Hero aHero : listOfHeroes) {
            if (aHero != null) {
                System.out.println(aHero);
            }
        }
}

    private static void printHeader() {
        fancyLines(45);
        System.out.println("\t\t\t\tLIST OF HEROES\n");
        fancyLines(45);
    }

    private static void fancyLines (int numbOfLines){
        for (int i = 0; i < numbOfLines; i++){
            System.out.print("-");
            if (i == (numbOfLines-1)){
                System.out.println("|\n");
            }
        }
    }
}
