package com.company.chapter4;

public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long day = remainingMinutes / 1440;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }
}
