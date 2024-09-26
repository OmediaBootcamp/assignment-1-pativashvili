package dev.omedia;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int max = 0;
        for (int i = 1; i <= first; i++) {
            if (first % i == 0 && second % i == 0) {
                int commonDivider = i;
                if (max < commonDivider) {
                    max = commonDivider;
                }
            }
        }

        for (int i = 1; i <= second; i++) {
            if (second % i == 0 && first % i == 0) {
                int commonDivider = i;
                if (max < commonDivider) {
                    max = commonDivider;
                }
            }
        }

        return max;
    }
}
