package dev.omedia;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        if (((a * 1000) % 1000) == 0 && ((b * 1000) % 1000) == 0) {
            return a == b;
        } else {
            int firstOne = (int) (a * 1000);
            int secondOne = (int) (b * 1000);
            return firstOne % 1000 == secondOne % 1000;
        }
    }
}
