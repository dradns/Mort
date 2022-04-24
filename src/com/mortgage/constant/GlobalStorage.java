package com.mortgage.constant;

public final class GlobalStorage {

    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;

    public final static byte ANNUAL_INTEREST_RATE_MIN = 1;
    public final static byte ANNUAL_INTEREST_RATE_MAX = 30;

    public final static int TOTAL_CAPITAL_MIN = 10;
    public final static int TOTAL_CAPITAL_MAX = 1_000_000;

    public final static int TOTAL_MORTGAGE_YEARS_MIN = 1;
    public final static int TOTAL_MORTGAGE_YEARS_MAX = 27;

    private GlobalStorage() {
    }
}
