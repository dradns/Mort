package com.mortgage;

public class Main {
    public static void main(String[] args) {
        var maker = new Maker();
        double mortgage = Mortgage.calculateMortgage(maker);

        Printer.printMonthlyPayment(mortgage);
        Printer.printPaymentSchedule(maker);
    }
}

