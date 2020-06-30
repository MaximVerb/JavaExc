package oefeningenKlasse.kaarten;

public class CardGame {
    public static void main(String[] args) {
        String[] color = {"Schoppen", "Ruiten", "Klaveren", "Harten"};
        Speelkaart[] deck = new Speelkaart[52];
        int index = 0;

        for (int i = 0; i < color.length; i++) {
            for (int j = 1; j <= (deck.length / 4); j++) {
                deck[index] = new Speelkaart(j, color[i]);
                index++;
            }
        }

        System.out.println(deck[0].toString());
        System.out.println(deck[51].toString());
    }
}
