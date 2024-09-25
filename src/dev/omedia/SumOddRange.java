package dev.omedia;

public class SumOddRange {
    public static boolean isOdd(int num) {
        if (num <= 0) {
            return false;
        }
        return num % 2 == 1;
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }
        if (isOdd(start)) {
            for (int i = start; i <= end; i += 2) {
                sum += i;
            }
        } else {
            for (int i = start + 1; i <= end; i += 2) {
                sum += i;
            }
        }
        return sum;
    }
}
