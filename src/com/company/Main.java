package com.company;

import com.company.chapter7.encapsulationChallenge.Printer;

public class Main {

    public static void main(String[] args) {

//        long miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles = " + miles);
//
//        SpeedConverter.printConversion(10.5);
//
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//
//        BarkingDog.shouldWakeUp(true, 1);
//
//        LeapYearCalculator.isLeapYear(454555454);
//
//        DecimalComparator.areEqualByThreeDecimalPlaces(1.455, 1.455);
//
//        EqualSumChecker.hasEqualSum(1,1,3);
//
//        TeenNumberChecker.hasTeen(55, 31, 23);
//
//        MethodOverloading.calculateScore("Jeffrey", 500);
//        MethodOverloading.calculateScore(75);
//        MethodOverloading.calculateScore();
//
//        MethodOverloading.calcFeetAndInchesToCentimeters(7, 15);
//        MethodOverloading.calcFeetAndInchesToCentimeters(157);
//
//        System.out.println(SecondsAndMinutesChallenge.getDurationString(65, 45));
//        System.out.println(SecondsAndMinutesChallenge.getDurationString(3945L));
//
//        AreaCalculator.area(5.0);
//        AreaCalculator.area(5.0,4.0);
//
//        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);
//
//        EqualityPrinter.printEqual(1,2,1);
//
//        PlayingCat.isCatPlaying(true, 36);

//        Wall wall1 = new Wall("west");
//        Wall wall2 = new Wall("north");
//        Wall wall3 = new Wall("east");
//        Wall wall4 = new Wall("south");
//
//        Ceiling ceiling = new Ceiling(3,55);
//        Bed bed = new Bed("Modern", 4,3,2,1);
//        Lamp lamp = new Lamp("Classic", false,75);
//        BedRoom bedRoom = new BedRoom("Jeffrey", wall1, wall2,wall3,wall4,ceiling,bed,lamp);
//        bedRoom.getLamp().turnOn();
//        bedRoom.makeBed();

//        Player player = new Player();
//        player.name = "Jeff";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        int damage1 = 11;
//        player.loseHealth(damage1);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Jeff",75, "Sword");
//        System.out.println("Initial health is " + player.getHitPoints());

        Printer printer = new Printer(50,true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was " +  pagesPrinted + " new total print count for printer  " + printer.getPagesPrinted());





    }
}
