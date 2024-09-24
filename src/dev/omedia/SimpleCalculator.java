package dev.omedia;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;


    public SimpleCalculator(double first, double sec){
        this.firstNumber = first;
        this.secondNumber = sec;
    }
    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }

    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if (this.firstNumber == 0 || this.secondNumber == 0) {
            return 0;
        } else {
            return this.firstNumber / this.secondNumber;
        }

    }

}