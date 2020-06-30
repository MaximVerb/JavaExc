package Enums_Static_EenvoudigeClasses.oefSortAndReplace;

import java.util.Scanner;

public class TestSortAndReplace {
    public static void main(String[] args) {
        boolean einde = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\nGeef een string (stop met <enter>): ");
            String string = scanner.nextLine();
            if (!string.isEmpty()) {
                SortAndReplace replace = new SortAndReplace(string);
                System.out.println(replace);
            } else {
                einde = true;
            }
        } while (!einde);
    }
}
