package com.mortgage;

import java.util.Scanner;

public class Reader {

    public static double readAnnualPercent() {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            value = scanner.nextFloat();
            if (value >= GlobalStore.ANNUAL_ITEREST_RATE_MIN && value <= GlobalStore.ANNUAL_ITEREST_RATE_MAX)
                break;
            System.out.println("Enter a value between " + GlobalStore.ANNUAL_ITEREST_RATE_MIN + " and " + GlobalStore.ANNUAL_ITEREST_RATE_MAX);
        }
        return value;
    }

    public static double readTotalCapital() {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("Your total capital: ");
            value = scanner.nextFloat();
            if (value >= GlobalStore.TOTAL_CAPITAL_MIN && value <= GlobalStore.TOTAL_CAPITAL_MAX)
                break;
            System.out.println("Enter a value between " + GlobalStore.TOTAL_CAPITAL_MIN + " and " + GlobalStore.TOTAL_CAPITAL_MAX);
        }
        return value;
    }

    public static double readTotalMortgageYears() {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("Period (Years): ");
            value = scanner.nextFloat();
            if (value >= GlobalStore.TOTAL_MORTGAGE_YEARS_MIN && value <= GlobalStore.TOTAL_MORTGAGE_YEARS_MAX)
                break;
            System.out.println("Enter a value between " + GlobalStore.TOTAL_MORTGAGE_YEARS_MIN + " and " + GlobalStore.TOTAL_MORTGAGE_YEARS_MAX);
        }
        return value;
    }
}
