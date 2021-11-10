package com.company;

public class HardDrive {
    void copyFromDVD(DVD dvd){
        if(dvd.hasData()){
            System.out.println("Performing copy from disk");
        }
        else {
            System.out.println("Insert disk with data");
        }
    }
}
