package Enums_Static_EenvoudigeClasses.oefSpeelkaart;

import java.util.Random;

public class SpeelKaart {
    public enum KaartKleur {
        HARTEN(), SCHOPPEN(), RUITEN(), KLAVEREN();

        KaartKleur() {
        }

        @Override
        public String toString() {
            return String.format("%s\t",name().toLowerCase());
        }
    }

    public enum KaartWaarde {
        TWEE(2),DRIE(3),VIER(4),VIJF(5),ZES(6),ZEVEN(7),ACHT(8),NEGEN(9),TIEN(10),BOER(10),DAME(10),HEER(10),AAS(1);

        private int getal ;

        private KaartWaarde(int eenGetal) {
            getal = eenGetal;
        }

        public int getGetal() {
            return getal;
        }

        @Override
        public String toString() {
            return String.format("%s\t",name().toLowerCase());
        }
    }

    public static final Random random = new Random();
    public KaartKleur kleur;
    public KaartWaarde waarde;

    public SpeelKaart(KaartKleur kleur, KaartWaarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public void setKaart(KaartKleur kleur,KaartWaarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public KaartKleur getKleur() {
        return kleur;
    }

    public KaartWaarde getWaarde() {
        return waarde;
    }

    public int getGetalWaarde() {
        return this.getWaarde().getGetal();
    }

    public void maakWillekeurigeKaart() {
       KaartKleur[] kleuren = KaartKleur.values();
       kleur = kleuren[random.nextInt(kleuren.length)];
       KaartWaarde[] waarden = KaartWaarde.values();
       waarde = waarden[random.nextInt(waarden.length)];
    }

    public String toonKaart() {
        String deWaarde = waarde.toString();
        if (waarde.ordinal() < 9) {
            deWaarde = Integer.toString(waarde.getGetal());
        }
        return kleur + " " + deWaarde;
    }

    @Override
    public String toString() {
        return String.format("%n%s%n%s",getKleur().toString(),getWaarde().toString());
    }
}
