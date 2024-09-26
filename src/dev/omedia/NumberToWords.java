package dev.omedia;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int a = 0;
        for (int i = 1; i <= getDigitCount(number); i++) {
            a = number % (10*i);
            number = number/(10*i);
            System.out.println(a);
        }


    }

    public static int getDigitCount(int number) {
        // returns count of digits
        if (number < 0) {
            return -1;
        }
        String numToString = Integer.toString(number);
        return numToString.length();
    }

    public static int reverse(int number) {
        return 0;
    }

}
