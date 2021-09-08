package com.company.chapter6;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double add(double real, double imaginary) {
        return real + imaginary;
    }

    public double add(ComplexNumber complexNumber) {
        return complexNumber.imaginary + complexNumber.real;
    }

    public double subtract(double real, double imaginary) {
        return real - imaginary;
    }

    public double subtract(ComplexNumber complexNumber) {
        return complexNumber.real - complexNumber.imaginary;
    }

}
