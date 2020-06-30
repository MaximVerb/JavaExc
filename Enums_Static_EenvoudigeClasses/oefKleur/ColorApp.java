package Enums_Static_EenvoudigeClasses.oefKleur;

public class ColorApp {
    public static void main(String[] args) {
        Color voorgrond = Color.BLUE;
        Color achtergrond = Color.GREEN;
        printColor(voorgrond);
        printColor(achtergrond);
    }

    public static void printColor(Color color) {
        System.out.println("De kleur is: "+ color.name());
        System.out.println("De ordinale waarde is: " + color.ordinal());
    }
}
