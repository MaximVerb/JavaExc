package Enums_Static_EenvoudigeClasses.oefPersoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personen {
    private final List<Persoon> personen;

    public Personen(List<Persoon> data) {
        personen = new ArrayList<>(data);
    }

    public List<Persoon> getPersonen() {
        return personen;
    }

    public void sorteer() {
        Collections.sort(personen); //dit is nu mogelijk omwille van de compareTo-methode bij klasse Persoon
    }
}
