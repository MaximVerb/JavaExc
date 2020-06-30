package oefeningenKlasse.boek;

public class TestBoek {
    public static void main(String [] args) {
        Boek boek1 = new Boek("Joseph Stiglitz", "De euro", 250);
        boek1.setOntleend(true);
        boek1.printDetails();
    }
}
