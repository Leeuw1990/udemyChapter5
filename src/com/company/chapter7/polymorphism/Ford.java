package com.company.chapter7.polymorphism;

public class Ford extends Car {

    public Ford(int cylinders, String licence, String brand) {
        super(cylinders, licence, brand);
    }

    @Override
    public String startEngine() {
        return "Ford -> Start engine";
    }

    @Override
    public String accelerate() {
        return "Ford -> Start accelerate";
    }

    @Override
    public String brake() {
        return "Ford -> brake";
    }
}
