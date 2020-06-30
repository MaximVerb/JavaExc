package be.intecbrussel.eatables;

public enum MagnumType {
    MILKCHOCOLATE(), WHITECHOCOLATE(), BLACKCHOCOLATE(), ALPINENUTS(), ROMANTICSTRAWBERRIES();

    private MagnumType() {}

    public String toString() {
        return String.format("; a %s magnum to be precise",name().toLowerCase());
    }
}
