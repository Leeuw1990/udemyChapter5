package com.company.chapter5;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if ((year > 0) && (year < 9999)) {
            if (year % 4 != 0) {
                System.out.println(year + " is not a leap year");
                return false;
            } else if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
                return true;
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year");
                return false;
            } else {
                System.out.println(year + " is not a leap year");
                return true;
            }
        }
        System.out.println(false + " 6");
        return false;
    }

    public static int getDaysOfTheMonth(int month, int year) {

        if((month < 1) || (month > 12)) {
            return -1;
        } if ((year < 1) || (year > 9999)) {
            return -1;
        }

        switch (month) {
            case 1:
                System.out.println("January " + year + " had 31 days");
                break;
            case 2:
                System.out.println("February " + year + " had" + ((isLeapYear(year)) ? " 29 days" : " 28 days"));
                break;
            case 3:
                System.out.println("March " + year + " had 31 days");
                break;
            case 4:
                System.out.println("April " + year + " had 30 days");
                break;
            case 5:
                System.out.println("May " + year + " had 31 days");
                break;
            case 6:
                System.out.println("June " + year + " had 30 days");
                break;
            case 7:
                System.out.println("July " + year + " had 31 days");
                break;
            case 8:
                System.out.println("August " + year + " had 31 days");
                break;
            case 9:
                System.out.println("September " + year + " had 30 days");
                break;
            case 10:
                System.out.println("October " + year + " had 31 days");
                break;
            case 11:
                System.out.println("November " + year + " had 30 days");
                break;
            case 12:
                System.out.println("December " + year + " had 31 days");
                break;
        }
        return -1;
    }

    }


