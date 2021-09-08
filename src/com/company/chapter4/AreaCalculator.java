package com.company.chapter4;

public class AreaCalculator {

    public static double area(double radius) {

        if(radius < 0) {
            System.out.println("Invalid Value");
            return -1;
        }

        double area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is " + area);
        return area;
    }

    public static double area(double x, double y) {

        if(x < 0 || y < 0) {
            System.out.println("Invalid Value");
            return -1;
        }
        double area = (x * y);
        System.out.println("The area of the rectangle " + area);
        return area;

    }


}
