package oefeningenSuperKlasse.oefVorm;

public class TestVorm {
    public static void main(String[] args) {
        Bol bol = new Bol("rood", 10);
        Bol knikker = new Bol("blauw", 1);
        Pyramide piramide = new Pyramide("groen", 10, 12);
        Pyramide artifact = new Pyramide("geel", 1, 1);
        System.out.println("bol = " + bol);
        System.out.println("knikker = " + knikker);
        System.out.println("piramide = " + piramide);
        System.out.println("artifact = " + artifact);
        artifact.setKleur("orange");
        artifact.setZijde(2);
        artifact.setHoogte(2);
        System.out.println("Na wijzigen kleur.");
        System.out.println("artifact = " + artifact);
    }
}

