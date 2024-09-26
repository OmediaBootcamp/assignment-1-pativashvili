package dev.omedia;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        return goal <= (5 * bigCount + smallCount) && !(goal % 5 > smallCount) && goal > 0;
    }
}
