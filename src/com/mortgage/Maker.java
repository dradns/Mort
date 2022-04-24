package com.mortgage;

import com.mortgage.constant.GlobalStorage;

import java.util.Scanner;

public class Maker {
    int totalCapital;
    float annualInterest;
    byte totalMortgageYears;

    public Maker() {
        totalCapital = readTotalCapital();
        annualInterest = readAnnualPercent();
        totalMortgageYears = readTotalMortgageYears();
    }

    public static float readAnnualPercent() {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            value = scanner.nextFloat();
            if (value >= GlobalStorage.ANNUAL_INTEREST_RATE_MIN && value <= GlobalStorage.ANNUAL_INTEREST_RATE_MAX)
                break;
            System.out.println("Enter a value between " + GlobalStorage.ANNUAL_INTEREST_RATE_MIN + " and " + GlobalStorage.ANNUAL_INTEREST_RATE_MAX);
        }
        return (float) value;
    }

    public static int readTotalCapital() {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("Your total capital: ");
            value = scanner.nextFloat();
            if (value >= GlobalStorage.TOTAL_CAPITAL_MIN && value <= GlobalStorage.TOTAL_CAPITAL_MAX)
                break;
            System.out.println("Enter a value between " + GlobalStorage.TOTAL_CAPITAL_MIN + " and " + GlobalStorage.TOTAL_CAPITAL_MAX);
        }
        return (int) value;
    }

    public static byte readTotalMortgageYears() {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("Period (Years): ");
            value = scanner.nextFloat();
            if (value >= GlobalStorage.TOTAL_MORTGAGE_YEARS_MIN && value <= GlobalStorage.TOTAL_MORTGAGE_YEARS_MAX)
                break;
            System.out.println("Enter a value between " + GlobalStorage.TOTAL_MORTGAGE_YEARS_MIN + " and " + GlobalStorage.TOTAL_MORTGAGE_YEARS_MAX);
        }
        return (byte) value;
    }
}
