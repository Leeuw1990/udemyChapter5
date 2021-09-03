package com.company;

public class EqualSumChecker {

    public static boolean hasEqualSum(int one, int two, int total){

        if(one + two == total) {
            System.out.println(true);
            return true;
        } else
            System.out.println(false);
            return false;
    }
}
