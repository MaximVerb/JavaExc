package oefeningenArrays.cirkel;

public class demoCirkel {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(5);
        Cirkel klein = new Cirkel(10, "Rood");
        Cirkel groot = new Cirkel(11, "Blauw");
        System.out.println(cirkel);
        System.out.println(klein);
        System.out.println(groot);

    }
}