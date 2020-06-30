package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum(){}

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }

    public void eat() {
        System.out.println(Eatable.AUTO_ANSWER + "a magnum " + type.toString()+".");
    }
}
