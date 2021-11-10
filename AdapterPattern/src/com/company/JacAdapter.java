package com.company;

public class JacAdapter implements Car {
    private Jac jac;

    public JacAdapter(Jac jac) {
        this.jac = jac;
    }

    @Override
    public void insertIntoGBTPort() {
        System.out.println("Adapter converts Chademo port into GBT");
        jac.insertIntoGBTPort();
    }
}
