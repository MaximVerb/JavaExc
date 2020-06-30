package oefeningenSuperKlasse.oefContact;

public class Contact {
    private String naam;
    private ContactGegevens gegevens;

    public Contact(String naam, String mail, String nummer, String gsmNummer) {
        this.naam = naam;
        this.gegevens = new ContactGegevens(mail,nummer,gsmNummer);
    }

    @Override
    public String toString() {
        return String.format("Naam is:%s\n",naam) + gegevens.toString();
    }

    public void toonInfo() {
        System.out.println("Naam: " + naam);
        System.out.println("E-mail: " + gegevens.geteMail());
        System.out.println("Tel: " + gegevens.getTelefoon().getNumber());
        System.out.println("Gsm: " + gegevens.getGsm().getNumber());
    }


}
