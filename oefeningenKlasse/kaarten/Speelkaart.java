package oefeningenKlasse.kaarten;

public class Speelkaart {
    private int value;
    private String color;

    public Speelkaart(int val, String clr) {
        value = val;
        color = clr;
    }

    public int getValue() {
        if (value > 10 ) { return 10; }
        else {return value;}
    }

    public String getColor() {
        return color;
    }

    public String toString() {
       String text = "U trekt ";
        switch (value) {
            case 1:
                text += getColor() +  " Aas";
                break;
            case 11:
                text += getColor() + " Boer";
                break;
            case 12:
                text += getColor() + " Dame";
                break;
            case 13:
                text += getColor() + " Heer";
                break;
            default:
                text += getColor() + " " + value;
                break;
        }
        return text;
    }
}
