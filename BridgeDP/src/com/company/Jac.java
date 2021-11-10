package com.company;

public class Jac extends Car {
    public Jac() {
        super("Car model Jac");
    }

    @Override
    public void useCharger() {
        System.out.println("Jac starts using charger!");
        charger.chargeCar();
    }
}
