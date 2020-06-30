package oefeningenSuperKlasse.oefDieren;

public class TestDieren {
    public static void main(String[] args) {
        Hond hond = new Hond("Roodbruin", 4, "Waf");
        Basenji basenji = new Basenji("Geelbruin", 4, "geen");
        Kat kat = new Kat("Ros", 4, "Maw");

        Hond hondKopie = hond.getDierKopie();
        Basenji basenjiKopie = basenji.getDierKopie();
        Kat katKopie = kat.getDierKopie();

        hondKopie.setKleur("Roestbruin");
        basenjiKopie.setKleur("Bruin");
        katKopie.setKleur("Zwart");
        hondKopie.setGeluid("Woef woef");
        katKopie.setGeluid("Kssss!");

        System.out.println(hond);
        System.out.println(kat);
        System.out.println(basenji);
        System.out.println();
        System.out.println(hondKopie);
        System.out.println(katKopie);
        System.out.println(basenjiKopie);

        hondKopie = hond.getDierKopie();
        basenjiKopie = basenji.getDierKopie();
        katKopie = kat.getDierKopie();

        boolean isHondGelijk = hondKopie.equals(hond);
        boolean isKatGelijk = katKopie.equals(kat);
        boolean isBasenjiGelijk = basenjiKopie.equals(basenji);
        System.out.println(isHondGelijk + " " + isKatGelijk + " " +
                isBasenjiGelijk);
    }
}
