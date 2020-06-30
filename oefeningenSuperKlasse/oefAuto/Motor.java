package oefeningenSuperKlasse.oefAuto;

class Motor {
    static final int MAX_TOERENTAL = 5800;
    private int toerental = 0;

    void verhoogToerental(int toename) {
        toerental += toename;
        if (toerental > MAX_TOERENTAL) {
            toerental = MAX_TOERENTAL;
        }
    }

    int getToerental() {
        return toerental;
    }

    void setToerental(int toerenT) {
        toerental = toerenT;
    }
}

