package Enums_Static_EenvoudigeClasses.oefWeekdagen;

public enum Days {
    MAANDAG(true), DINSDAG(true), WOENSDAG(true), DONDERDAG(true),
    VRIJDAG(true), ZATERDAG(false), ZONDAG(false);

    private boolean isWeekday;

    private Days(boolean aValue) {
        isWeekday = aValue;
    }

    @Override
    public String toString() {
        return String.format("De dag is %s\n" +
                "en dit is een %s", name(), isWeekday ? "weekdag" : "weekend");
    }

}


