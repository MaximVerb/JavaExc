package oefeningenSuperKlasse.oefContact;

public class Telefoon {
    String species;
    String number;

    public Telefoon(String aSpecies,String aNumber) {
        species =aSpecies;
        number = aNumber;
    }

    String getSpecies() { return species; }
    String getNumber() { return  number; }

    boolean isGeldigNummer() {
        if (number.length() == 9 || number.length() == 10) {
            if (number.substring(0,1).equals("0")) {
                return true; }
            else { return false; } }
        else{ return false; }
    }


}
