package dev.omedia;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        char rightMostA = Integer.toString(a).charAt(Integer.toString(a).length() - 1);;
        char rightMostB = Integer.toString(b).charAt(Integer.toString(b).length() - 1);
        char rightMostC = Integer.toString(c).charAt(Integer.toString(c).length() - 1);
        return rightMostA == rightMostB || rightMostA == rightMostC || rightMostB == rightMostC;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 100;
    }

    public static char rightMostChar(int something) {
        String tostring = Integer.toString(something);
        return tostring.charAt(tostring.length() - 1);
    }
}
