package com.company.chapter4;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        if ((year > 0) && (year < 9999)) {
            if (year % 4 != 0) {
                System.out.println(false + " 1");
                return false;
            } else if (year % 400 == 0) {
                System.out.println(true + " 2");
                return true;
            } else if (year % 100 == 0) {
                System.out.println(false + " 3");
                return false;
            } else {
                System.out.println(true + " 4");
                return true;
            }
        }
        System.out.println(false + " 6");
        return false;
    }
}
