package com.company.chapter5;

public class Switch {

    public static void switchPractice() {
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
    }

    public static void switchWithChar() {

        char value = 'z';

        switch (value) {
            case 'a':
                System.out.println("Value a");
                break;
            case 'b':
                System.out.println("Value b");
                break;
            case 'c':
                System.out.println("Value c");
                break;
            case 'd':
                System.out.println("Value d");
                break;
            case 'e':
                System.out.println("Value e");
                break;
            default:
                System.out.println(value + " was found");
                break;
        }
    }




}
