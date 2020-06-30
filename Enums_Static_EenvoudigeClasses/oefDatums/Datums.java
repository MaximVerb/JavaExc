package Enums_Static_EenvoudigeClasses.oefDatums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.time.format.TextStyle.FULL;

public class Datums {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        System.out.printf("De datum is %s", fullFormat.format(date));

    }
}
