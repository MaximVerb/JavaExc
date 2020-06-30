package Enums_Static_EenvoudigeClasses.oefVergelijk;

public class Vergelijk {
    public static void main(String[] args) {
        String eerste = "Hello World";
        String tweede = "Hello World";
        String derde = new String("Hello World");
        System.out.println("Met ==");
        System.out.println(" " + (eerste == tweede) + " " +
                (eerste == derde) + " " + (tweede == derde) + "\n");
        System.out.println("Met equals");
        System.out.println(" " + (eerste.equals(tweede)) + " " +
                (eerste.equals(derde)) + " " +(tweede.equals(derde)) + "\n");
        StringBuilder een = new StringBuilder(eerste);
        StringBuilder twee = new StringBuilder(tweede);
        StringBuilder drie = new StringBuilder(derde);
        System.out.println("Met ==");
        System.out.println(" " + (een == twee) + " " + (een == twee) +
                " " + (een == twee) + "\n");
        System.out.println("Met equals");
        System.out.println(" " + (een.equals(twee)) + " " +
                (een.equals(twee)) + " " +(twee.equals(drie)) + "\n");
    }
}