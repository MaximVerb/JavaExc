package oefeningenArrays.coordinaten;

import java.util.Scanner;

public class Coordinaten {
    final int GROOTTE = 6;
    int[][] matrix;
    int teller;

    public Coordinaten() {
        matrix = new int[GROOTTE][GROOTTE];
    }

    public int getTeller() {
        return teller;
    }

    public void markeerCoordinaten(int rij, int kolom) {
        if (rij > 0 && rij <= GROOTTE && kolom > 0 && kolom <= GROOTTE) {
            rij -= 1;
            kolom -= 1;
            matrix[rij][kolom] += 1;
            teller++;
        } else {
            System.out.println("Geef een andere waarde in, kolom/rij klopt niet");
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Geef de kolom op");
            kolom = keyboard.nextInt();
            System.out.println("Geef de rij op");
            rij = keyboard.nextInt();
            markeerCoordinaten(rij, kolom);
        }
    }

    @Override
    public String toString() {
        String text = "";
        for (int[] elem : matrix) {
            text += "\n";
            for (int el : elem) {
                text += el + "\t";
            }
        }
        return text;
    }
}
