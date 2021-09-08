package com.company.chapter5;

public class WhileStatement {

    public static void whileState() {
        int count = 1;
        while (count != 6) {
            System.out.println("While: Count value is " + count);
            count ++;
        }

        for (int i = 1; i < 6; i++) {
            System.out.println("For: Count value is " + i);
        }

        int counter = 6;
        do {
            System.out.println("DO While: Count value is " + counter);
            counter++;
            if (counter > 100) {
                break;
            }
        } while (counter != 6);

    }

    public static boolean isEvenNumber(int number) {

        if(number % 2 == 0) {
            System.out.println(true);
            return true;
        } else
            System.out.println(false);
        return false;
    }

    public static void whileIsEvenNumber(int startNum, int endNum) {

        int counter = 0;
        while (startNum <= endNum) {
            startNum++;
            if(!isEvenNumber(startNum)) {
                continue;
            } else {
                System.out.println("Even number " + startNum);
                counter++;
                if (counter == 5) {
                    System.out.println("Amount of even numbers: " + counter);
                    return;
                }
            }
        }
    }
}
