package com.mortgage;

public class Mortgage {

    public static double calculateMortgage(Maker maker) {
        float monthlyInterest = maker.annualInterest / GlobalStorage.PERCENT / GlobalStorage.MONTHS_IN_YEAR;
        float numberOfPayments = maker.totalMortgageYears * GlobalStorage.MONTHS_IN_YEAR;

        return maker.totalCapital
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public static double calculateBalance(Maker maker, int numberOfPaymentsMade) {
        float monthlyInterest = maker.annualInterest / GlobalStorage.PERCENT / GlobalStorage.MONTHS_IN_YEAR;
        float numberOfPayments = maker.totalMortgageYears * GlobalStorage.MONTHS_IN_YEAR;

        return maker.totalCapital
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
