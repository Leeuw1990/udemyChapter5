package com.company;

public class MethodOverloading {

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored" + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored and no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((inches < 0) || (inches > 12) || (feet < 0)) {
            System.out.println("Invalid value");
            return -1;
        }
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
