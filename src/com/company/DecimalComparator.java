package com.company;


public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        if ((int)(one * 1000) == (int)(two * 1000)){
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }
}
