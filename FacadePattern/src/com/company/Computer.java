package com.company;

public class Computer {
    Switching switching = new Switching();
    DVD dvd = new DVD();
    HardDrive hardDrive = new HardDrive();

    void copy(){
        switching.on();
        dvd.load();
        hardDrive.copyFromDVD(dvd);
    }
}
