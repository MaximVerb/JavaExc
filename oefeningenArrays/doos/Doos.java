package oefeningenArrays.doos;

public class Doos {
    String soort;
    double hoogte;
    double breedte;
    double lengte;

    public Doos(String srt, double lngt) {
        this(srt, lngt, lngt,lngt);
    }

    public Doos(String srt, double hgt, double brdt, double lngt) {
        soort = srt;
        hoogte = hgt;
        breedte = brdt;
        lengte = lngt;
    }

    public String getSoort() {
        return soort;
    }

    public double getHoogte() {
        return hoogte;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double oppervlakte() {
        double opp = (lengte * hoogte * 2) + (breedte * hoogte * 2) + (breedte * lengte * 2);
        return opp;
    }

    public double volume() {
        double vol = lengte * breedte * hoogte;
        return vol;
    }

    public double tapeLengte() {
        double tape = lengte + lengte + hoogte + hoogte;
        return tape;
    }

    @Override
    public String toString() {
        return String.format("Soort: %s\nLengte:%.2f\n" +
                "Breedte: %.2f\nHoogte: %.2f\nOppervlakte: %,.2fcm²\n" +
                "Volume: %,.2fcm³\nMinimale tapelengte: %.2fcm\n",getSoort(),getLengte(),
                getBreedte(),getHoogte(),oppervlakte(),volume(),tapeLengte());
    }

}
