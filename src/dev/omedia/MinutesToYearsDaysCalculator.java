package dev.omedia;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long years = (minutes / 60 / 24 / 365);
            long yearsToMin = years * 60 * 24 * 365;
            long days = (minutes - yearsToMin) / 60 / 24;
            System.out.println(minutes + " min = " + (int) years + " y and " + days + " d");
        }
    }
}
