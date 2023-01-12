package com.demo;
public class Main {
    public static void main(String[] args) {
        bike KTM = new bike("KTM");
        KTM.start();
        KTM.apply();
        KTM.release();
        KTM.stop();
    }
}