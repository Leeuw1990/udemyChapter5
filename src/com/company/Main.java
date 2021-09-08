package com.company;

import com.company.chapter4.*;

public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        BarkingDog.shouldWakeUp(true, 1);

        LeapYearCalculator.isLeapYear(454555454);

        DecimalComparator.areEqualByThreeDecimalPlaces(1.455, 1.455);

        EqualSumChecker.hasEqualSum(1,1,3);

        TeenNumberChecker.hasTeen(55, 31, 23);

        MethodOverloading.calculateScore("Jeffrey", 500);
        MethodOverloading.calculateScore(75);
        MethodOverloading.calculateScore();

        MethodOverloading.calcFeetAndInchesToCentimeters(7, 15);
        MethodOverloading.calcFeetAndInchesToCentimeters(157);

        System.out.println(SecondsAndMinutesChallenge.getDurationString(65, 45));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(3945L));

        AreaCalculator.area(5.0);
        AreaCalculator.area(5.0,4.0);

        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);

        EqualityPrinter.printEqual(1,2,1);

        PlayingCat.isCatPlaying(true, 36);




    }
}
