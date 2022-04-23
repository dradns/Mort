package com.mortgage;

import java.text.NumberFormat;

public class Printer {
    static void printMonthlyPayment(double mortgage) {
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    static void printPaymentSchedule(Maker maker) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= maker.totalMortgageYears * GlobalStorage.MONTHS_IN_YEAR; month++) {
            double balance = Mortgage.calculateBalance(maker, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
