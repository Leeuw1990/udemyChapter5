package com.company.chapter4;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour <0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double KilometersPerHour) {

        if(KilometersPerHour <0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(KilometersPerHour);
            System.out.println(KilometersPerHour +
                    " Km/h = " + milesPerHour +
                    " mi/h");
        }
    }
}
