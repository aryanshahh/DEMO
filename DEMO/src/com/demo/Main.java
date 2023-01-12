package com.demo;
public class Main {
    public static void main(String[] args) {
        bike KTM = new bike("KTM");
        bike Pulsar = new bike ("Pulsar");
        KTM.start();
        KTM.apply();
        KTM.release();
        KTM.stop();
        KTM.gearup();

        Pulsar.geardown();
    }
}