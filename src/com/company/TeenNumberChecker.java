package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen(int one, int two, int three) {

        if(((one > 12) && (one < 20)) || ((two > 12) && (two < 20) || (three > 12) && (three < 20))) {
            System.out.println(true);
            return true;
        } else
            System.out.println(false);
            return false;
    }
}
