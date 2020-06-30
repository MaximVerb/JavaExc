package Enums_Static_EenvoudigeClasses.oefWapenStilstand;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class WapenStilstand {
    public static void main(String[] args) {
        LocalDate wapenStil = LocalDate.of(1918,11,11);
        System.out.printf("Wapenstilstand viel op een: %s%n",
                wapenStil.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.getDefault()));

        int[] jarenWapenStil = new int[10];
        for(int i = 1980,j=11,k=11,l=0; i <= 2040; i++ ) {
            LocalDate aDate = LocalDate.of(i, j, k);
            if (aDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                jarenWapenStil[l] = i;
                System.out.print(jarenWapenStil[l] +"\t");
                l++;
            }
        }
    }
}
