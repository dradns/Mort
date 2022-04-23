package com.mortgage;

public class Main {
    public static void main(String[] args) {
        int totalCapital = (int) Reader.readTotalCapital();
        float annualPercent = (float) Reader.readAnnualPercent();
        byte totalMortgageYears = (byte) Reader.readTotalMortgageYears();

        Printer.printMonthlyPayment(totalCapital, annualPercent, totalMortgageYears);
        Printer.printPaymentSchedule(totalCapital, annualPercent, totalMortgageYears);
    }

    public static double calculateBalance(
            int totalCapital,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = annualInterest / GlobalStore.PERCENT / GlobalStore.MONTHS_IN_YEAR;
        float numberOfPayments = years * GlobalStore.MONTHS_IN_YEAR;

        double remainMortgageAmount = totalCapital
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return remainMortgageAmount;
    }

    public static double calculateMortgage(
            int totalCapital,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / GlobalStore.PERCENT / GlobalStore.MONTHS_IN_YEAR;
        float numberOfPayments = years * GlobalStore.MONTHS_IN_YEAR;

        double mortgage = totalCapital
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
}

