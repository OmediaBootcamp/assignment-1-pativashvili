package dev.omedia;

public class Main {

    public static void main(String[] args) {

        PositiveNegativeZero.checkNumber(25);                     //Ex1
        SpeedConverter.printConversion(25);       //Ex2
        MegaBytesConverter.printMegaBytesAndKiloBytes(255);       //Ex3
        IntEqualityPrinter.printEqual(22, 11, 3);                 //Ex11
        InputCalculator.inputThenPrintSumAndAverage();            //Ex28
        //EX 30
        SimpleCalculator calc  = new SimpleCalculator(11,22);
        System.out.println(calc.getAdditionResult());


    }
}
