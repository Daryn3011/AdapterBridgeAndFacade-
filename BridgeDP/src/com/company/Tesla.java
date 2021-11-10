package com.company;

public class Tesla extends Car {
    public Tesla() {
        super("Car model Tesla");
    }

    @Override
    public void useCharger() {
        System.out.println("Tesla starts using charger!");
        charger.chargeCar();
    }
}
