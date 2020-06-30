package oefeningenSuperKlasse.oefHeroes;

public class AllTheHeroes {
    private Hero[] listOfHeroes;

    public AllTheHeroes() {
        listOfHeroes = new Hero[4];
    }

    public void addSuperHero(Hero hero) {
        if (!isHeroTypePresent(hero)) {
            for (int i = 0; i < listOfHeroes.length; i++) {
                if (listOfHeroes[i] == null) {
                    listOfHeroes[i] = hero;
                    return;
                }
            }
        }
    }

    public void removeSuperHero(Hero hero) {
        if (isHeroTypePresent(hero)){
            for (int i = 0; i < listOfHeroes.length; i++){
                if (hero.equals(listOfHeroes[i])){
                    listOfHeroes[i] = null;
                    return;
                }
            }
        }
    }

    private boolean isHeroTypePresent (Hero hero) {
        for (Hero h: listOfHeroes) {
            if (h != null) {
                if (h.getClass() == hero.getClass()){
                    return true;
                }
            }
        }
        return false;
    }


    public Hero[] getHeroes () {
        return listOfHeroes;
    }
}
