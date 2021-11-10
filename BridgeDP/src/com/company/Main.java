package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Jac();
        Car car2 = new Tesla();
        Charger jac = new TeslaCharger();
        Charger tesla = new JacCharger();

        car1.setCharger(jac);
        car1.useCharger();
        System.out.println("----------------------");
        car2.setCharger(tesla);
        car2.useCharger();
    }
}
