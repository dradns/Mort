package com.mortgage;

import java.text.NumberFormat;

public class Printer {
    static void printMonthlyPayment(int totalCapital, float annualInterest, byte years) {
        double mortgage = Main.calculateMortgage(totalCapital, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    static void printPaymentSchedule(int totalCapital, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * GlobalStore.MONTHS_IN_YEAR; month++) {
            double balance = Main.calculateBalance(totalCapital, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
