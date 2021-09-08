package com.company.chapter5;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 10) {
            return -1;
        }

        int last = number % 10;
        int first = number;

        while (first >= 10) {
            first = first / 10;
        }
        return  first + last;
    }
}
