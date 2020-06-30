package Enums_Static_EenvoudigeClasses.oefPersoon;

import java.util.Arrays;
import java.util.List;

public class TestPersoon {
    private static final Persoon[] data = {
            new Persoon("Jan", "Van den Broecke"),
            new Persoon("Jozef", "Vandenbroeke"),
            new Persoon("Els", "Van Damme"),
            new Persoon("Emma", "Devocht"),
            new Persoon("Annick", "Devocht"),
            new Persoon("Annie", "De Vocht"),
            new Persoon("Frans", "D'Hooghe"),
            new Persoon("Fons", "De Wilde"),
            new Persoon("Magda", "De Haene"),
            new Persoon("Julie", "Vermeulen"),
            new Persoon("Charlotte", "Van Den Brande"),
            new Persoon("Jean-Pierre", "Daemen"),
            new Persoon("Bert", "Van Basten"),
            new Persoon("Stien", "D'Haene"),
            new Persoon("Sterre", "Vandenbrande"),
    };
    public static void main(String[] args) {
        Personen personen = new Personen(Arrays.asList(data));
        personen.sorteer();

        List<Persoon> lijst = personen.getPersonen();
        for (Persoon persoon : lijst) {
            System.out.println(persoon);
        }
    }
}
// Haal de lijst op uit personen en print elk Persoon-object
// via de toString methode
