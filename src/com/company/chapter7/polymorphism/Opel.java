package com.company.chapter7.polymorphism;

public class Opel extends Car {

    public Opel(int cylinders, String licence, String brand) {
        super(cylinders, licence, brand);
    }

    @Override
    public String startEngine() {
        return "Opel -> Start engine";
    }

    @Override
    public String accelerate() {
        return "Opel -> Start accelerate";
    }

    @Override
    public String brake() {
        return "Opel -> brake";
    }
}
