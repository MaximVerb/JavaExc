package Enums_Static_EenvoudigeClasses.oefVrijdagDe13de;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Vrijdag13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2010, 1, 13);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        for (int i = 2010; i <= 2020; i++) {
            for (int j = 1; j <= 12; j++) {
                LocalDate dertien = LocalDate.of(i, j, 13);
                if (dertien.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    System.out.printf("De volgende data: %s%n", formatter.format(dertien));
                }
            }
        }
    }
}