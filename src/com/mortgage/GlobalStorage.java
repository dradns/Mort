package com.mortgage;

public final class GlobalStorage {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    final static byte ANNUAL_INTEREST_RATE_MIN = 1;
    final static byte ANNUAL_INTEREST_RATE_MAX = 30;

    final static int TOTAL_CAPITAL_MIN = 10;
    final static int TOTAL_CAPITAL_MAX = 1_000_000;

    final static int TOTAL_MORTGAGE_YEARS_MIN = 1;
    final static int TOTAL_MORTGAGE_YEARS_MAX = 27;

    private GlobalStorage() {
    }
}
