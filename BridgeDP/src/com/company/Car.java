package com.company;

public abstract class Car {
    protected Charger charger;
    protected String model;

    public Car(String model){
        this.model = model;
    }

    public void setCharger(Charger charger){
        this.charger = charger;
    }

    public abstract void useCharger();
}
