package dev.omedia;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int number) {
        if (number >= 1 && number <= 9999) {
            return (number % 4 == 0 && number % 100 != 0) || number % 400 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int februaryDays = isLeapYear(year) ? 29 : 28;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                return februaryDays;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            default -> {
                return -1;
            }

        }

    }
}
