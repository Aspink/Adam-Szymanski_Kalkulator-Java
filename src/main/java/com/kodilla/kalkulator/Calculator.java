package com.kodilla.kalkulator;

public class Calculator {
    public double addAToB(double a, double b) {
        return a + b;
    }

    public double substractAFromB(double a, double b) {
        return a - b;
    }
    public static void main(String args[]) {
        double x = 23.4;
        double y = 17.1;
        Calculator calculator = new Calculator();
        double sumXY = calculator.addAToB(x,y);
        double subsXY = calculator.substractAFromB(x,y);
        System.out.println("Suma liczb: " + x + " i " + y + " wynosi " + sumXY);
        System.out.println("Różnica liczb: " + x + " i " + y + " wynosi " + subsXY);
    }
}
