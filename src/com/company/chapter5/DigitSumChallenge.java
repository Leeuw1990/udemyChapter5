package com.company.chapter5;

public class DigitSumChallenge {

    public static int sumDigigts(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
           int digit = number % 10;
           sum += digit;

           number /= 10;
        }
        return sum;
    }

}
