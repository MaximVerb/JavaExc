package Enums_Static_EenvoudigeClasses.oefPersoon;

public class Persoon implements Comparable<Persoon> {

    String voornaam;
    String familieNaam;

    public Persoon(String voornaam, String familieNaam) {
        this.voornaam = voornaam;
        this.familieNaam = familieNaam;
    }


    @Override
    public int compareTo(Persoon aPerson) {
     return this.familieNaam.compareTo(aPerson.familieNaam);

    }

    @Override
    public String toString() {
        return String.format("%s %s",voornaam,familieNaam);
    }


}
