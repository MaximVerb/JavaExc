package oefeningenInterfaces;

public class Bord {
    private String materiaal;
    private String kleur;

    public Bord(String kleur, String materiaal) {
        this.kleur = kleur;
        this.materiaal = materiaal;
    }

    public double oppervlakte() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%-9s %-6s", materiaal, kleur);
    }
}
