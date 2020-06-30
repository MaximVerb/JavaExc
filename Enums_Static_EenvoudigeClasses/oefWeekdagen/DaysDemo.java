package Enums_Static_EenvoudigeClasses.oefWeekdagen;

public class DaysDemo {
    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day.name());
            System.out.println(day.ordinal());
            System.out.println(day);
        }
    }
}
