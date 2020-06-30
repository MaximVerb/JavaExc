package oefeningenSuperKlasse.oefContact;

public class ContactGegevens {
    String eMail;
    Telefoon telefoon;
    Telefoon gsm;

    public ContactGegevens(String mail, String eenNummer, String eenGsmNummer) {
        eMail = mail;
        telefoon = new Telefoon("vast", eenNummer);
        gsm = new Telefoon("mobiel", eenGsmNummer);
    }

    public String geteMail() {
        return eMail;
    }

    public Telefoon getTelefoon() {
        return telefoon;
    }

    public Telefoon getGsm() {
        return gsm;
    }

    @Override
    public String toString() {
        return String.format("E-mail:%s\nTel:%s\nGSM:%s",geteMail(),getTelefoon().getNumber(),getGsm().getSpecies());
    }


}
