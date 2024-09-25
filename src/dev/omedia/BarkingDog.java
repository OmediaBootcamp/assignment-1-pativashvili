package dev.omedia;

public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay < 24) {
            return barking && (hourOfDay < 8 || hourOfDay > 22);
        }
        return false;
    }
}