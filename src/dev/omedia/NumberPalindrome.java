package dev.omedia;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        boolean isPalindrome = false;
        if (number < 0) {
            number = number * -1;
        }
        String numToString = Integer.toString(number);
        for (int i = 0; i < numToString.length() / 2; i++) {
            char a = numToString.charAt(i);
            char b = numToString.charAt(numToString.length() - i - 1);
            isPalindrome = a == b;
            if (!isPalindrome) {
                return false;
            }
        }
        return isPalindrome;
    }
}
