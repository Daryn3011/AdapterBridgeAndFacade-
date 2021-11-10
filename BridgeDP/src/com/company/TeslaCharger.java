package com.company;

public class TeslaCharger implements Charger {
    @Override
    public void chargeCar() {
        System.out.println("Tesla charger is charging!");
    }
}
