package be.intecbrussel.eatables;

public enum Flavor {
    STRAWBERRY(), BANANA(), CHOCOLATE(), VANILLA(), LEMON(), STRACIATELLA(), MOKKA(), PISTACHE();

    Flavor() {
    }

    public String toString() {

            return String.format(" een bolletje %s ", name().toLowerCase());
    }
}
