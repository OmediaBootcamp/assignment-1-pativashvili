package dev.omedia;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        String stringNum = Integer.toString(number);
        int res = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            int varToAdd = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            if (varToAdd % 2 == 0) {
                res += varToAdd;
            }
        }
        return res;
    }
}
