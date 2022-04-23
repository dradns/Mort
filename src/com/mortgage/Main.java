package com.mortgage;

public class Main {
    public static void main(String[] args) {
        int totalCapital = (int) Reader.readTotalCapital();
        float annualInterest = (float) Reader.readAnnualPercent();
        byte totalMortgageYears = (byte) Reader.readTotalMortgageYears();

        double mortgage = Mortgage.calculateMortgage(totalCapital,annualInterest, totalMortgageYears);

        Printer.printMonthlyPayment(mortgage);
        Printer.printPaymentSchedule(totalCapital, annualInterest, totalMortgageYears);
    }

}

