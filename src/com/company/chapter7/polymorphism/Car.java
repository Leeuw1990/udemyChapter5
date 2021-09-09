package com.company.chapter7.polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String licence;
    private String brand;

    public Car(int cylinders, String licence, String brand) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.licence = licence;
        this.brand = brand;
    }

    public String startEngine() {
        return "Car -> start engine";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> brake";
    }



    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getLicence() {
        return licence;
    }

    public String getBrand() {
        return brand;
    }
}
