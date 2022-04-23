package com.mortgage;

public class Mortgage {
    public static double calculateMortgage(
            int totalCapital,
            float annualInterest,
            byte totalMortgageYears) {

        float monthlyInterest = annualInterest / GlobalStore.PERCENT / GlobalStore.MONTHS_IN_YEAR;
        float numberOfPayments = totalMortgageYears * GlobalStore.MONTHS_IN_YEAR;

        return totalCapital
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public static double calculateBalance(
            int totalCapital,
            float annualInterest,
            byte totalMortgageYears,
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = annualInterest / GlobalStore.PERCENT / GlobalStore.MONTHS_IN_YEAR;
        float numberOfPayments = totalMortgageYears * GlobalStore.MONTHS_IN_YEAR;

        return totalCapital
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
