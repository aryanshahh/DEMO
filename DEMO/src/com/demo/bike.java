package com.demo;
public class bike implements engine, brake, gear{
    String bikename;

    bike(String bikename){
        this.bikename = bikename;
    }
    bike(){
        this.bikename = "Pulsar";
    }

    @Override
    public void apply() {
        System.out.println("Apply the brakes of " + this.bikename);
    }

    @Override
    public void release() {
        System.out.println("Release the brakes of " + this.bikename);
    }

    @Override
    public void start() {
        System.out.println("starts the engine of " + this.bikename);
    }
    @Override
    public void stop() {
        System.out.println("Stops the engine of " + this.bikename);
    }

    @Override
    public void gearup() {
        System.out.println("Increasing the Gear of  " + this.bikename);
    }

    @Override
    public void geardown() {
        System.out.println("Decreasing the Gear of  " + this.bikename);
    }
}