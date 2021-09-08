package com.company.chapter5;

public class SharedDigit {

        public static boolean hasSharedDigit(int first, int second) {
        if ((first >= 10 && first <= 99) && (second >= 10 && second <= 99)) {
            int firstNumberLastDigit = first % 10;
            int secondNumberLastDigit = second % 10;
            first /= 10;
            second /= 10;
            int firstNumberFirstDigit = first;
            int secondNumberFirstDigit = second;
            System.out.println("Is there any shared digit in both given numbers?");
            return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit == secondNumberLastDigit));
        }
        System.out.println("Invalid input.");
        return false;
    }
}

