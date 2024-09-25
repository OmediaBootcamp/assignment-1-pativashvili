package dev.omedia;

public class LeapYear {
    public static boolean isLeapYear(int number) {
        if (number >= 1 && number <= 9999) {
            return (number % 4 == 0 && number % 100 != 0) || number % 400 == 0;
        }
        return false;
    }
}
