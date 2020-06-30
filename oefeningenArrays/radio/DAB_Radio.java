package oefeningenArrays.radio;

public class DAB_Radio {
    private boolean status;
    private int zenderNummer = 1;
    private final String[] zenderNamen = new String[]{
            "Radio 1", "Radio 2", "Klara", "Stu Bru", "MNM",
            "Continue", "Sporza", "Nieuws+", "MNM Hits"};

    public boolean getStatus() {
        return status;
    }

    public void setZender(int zenderNmr) {
        zenderNummer = zenderNmr;
    }
    public void aan() { status = true; }
    public void uit() {status = false; }

    public String getResponse() {
        if(status == false) { String text = "Zet eerst de radio aan\n";return text; }
        else if (status == true && (zenderNummer <1 || zenderNummer > 9)) {
            String text ="Geen geldig zendernummer\n"; return text;}
        else {String text = String.format("U luistert naar %s\n",zenderNamen[zenderNummer-1]);return text;}
    }
}
