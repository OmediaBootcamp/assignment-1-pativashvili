package dev.omedia;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);

        for (int i = 0; i < stringA.length(); i++) {
            for (int j = 0; j < stringB.length(); j++) {
                if (stringA.charAt(i) == stringB.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
