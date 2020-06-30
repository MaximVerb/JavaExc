package oefeningenKlasse.boek;

public class Boek {
    //eigenschappen
    private String auteur;
    private String titel;
    private int aantalPag;
    private boolean ontleend;

    //constructors
    public Boek() {
        this("onbekend","onbekend",0);
    }

    public Boek(String aut, String tt, int pages) {
        auteur = aut;
        titel = tt;
        aantalPag = pages;
    }

    //getters
    public String getAuteur() {
        return auteur;
    }

    public String getTitel() {
        return titel;
    }

    public int getAantalPag() {
        return aantalPag;
    }

    public boolean isOntleend() {
        return ontleend;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    //setters
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAantalPag(int aantalPag) {
        this.aantalPag = aantalPag;
    }

    public void setOntleend(boolean ontleend) {
        this.ontleend = ontleend;
    }

    public void printDetails() {
        String text = ontleend?"ontleend":"niet ontleed";
        System.out.printf("Het boek %s (%d pagina's), geschreven door %s is momenteel %s",
                getTitel().toUpperCase(),getAantalPag(),getAuteur().toUpperCase(),text);
    }

}
