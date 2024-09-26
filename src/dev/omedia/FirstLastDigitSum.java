package dev.omedia;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int a = 0;
        String stringNum = Integer.toString(number);
        for (int i = 0; i < stringNum.length(); i++) {
            int varToAdd = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            if (i == 0) {
                a += varToAdd;
            }
            if ((stringNum.length() - i - 1) == 0) {
                a += varToAdd;
            }
        }
        System.out.println(a);
        return a;
    }
}
