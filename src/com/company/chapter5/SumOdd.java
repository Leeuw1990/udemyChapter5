package com.company.chapter5;

public class SumOdd {

    public static boolean isOdd(int number) {

        if ((number > 0) && (number % 2 != 0)) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sumOfOdd = 0;
        if (start > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfOdd = sumOfOdd + i;
                }
            }
            return sumOfOdd;
        } else {
            return -1;
            }
        }
    }

