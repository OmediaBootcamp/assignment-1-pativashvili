package dev.omedia;

import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        System.out.println("Enter number click enter, When you want to finish click any other char");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int count = 0;
        while (true) {
            try {
                sum += Integer.parseInt(sc.nextLine());
                count++;
                avg =  Math.round((float) sum / count);
            } catch (Exception e) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}