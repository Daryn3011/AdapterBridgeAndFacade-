package com.company;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Car myTesla = new Tesla();
        Jac myJac = new Jac();
        JacAdapter adapter = new JacAdapter(myJac);
        client.insertChademoConnectorIntoCar(myTesla);
        client.insertChademoConnectorIntoCar(adapter);
    }

}
