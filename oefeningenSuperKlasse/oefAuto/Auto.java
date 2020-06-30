package oefeningenSuperKlasse.oefAuto;

import java.util.Objects;

class Auto extends Motor {
    String brand;
    String numberPlate;
    Motor aMotor;

    Auto(String aBrand) {
        this(aBrand,"onbekende nrplaat");
    }

    Auto(String aBrand, String aNumberPlate) {
        brand = aBrand;
        numberPlate = aNumberPlate;
        aMotor = new Motor();
    }

    Auto(Auto sameCar) {
        this(sameCar.brand,sameCar.numberPlate);
    }

    String getBrand() {
        return brand;
    }

    String getNumberPlate() {
        return numberPlate;
    }

    void geefGas() { aMotor.verhoogToerental(200);}

    void geefGas(int soMuch) {aMotor.verhoogToerental(soMuch);}

    void rem() { aMotor.setToerental(0);}

    void toonToerental() {
        System.out.println(aMotor.getToerental());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Auto aCar = (Auto) object;

        return numberPlate.equals(aCar.numberPlate);
    }

    @Override
    public int hashCode() {
        return numberPlate.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s met kenteken %s", getBrand(),getNumberPlate());
    }
}
