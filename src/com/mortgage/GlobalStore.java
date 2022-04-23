package com.mortgage;

final class GlobalStore {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    final static byte ANNUAL_ITEREST_RATE_MIN = 1;
    final static byte ANNUAL_ITEREST_RATE_MAX = 30;

    final static int TOTAL_CAPITAL_MIN = 1000;
    final static int TOTAL_CAPITAL_MAX = 1_000_000;

    final static int TOTAL_MORTGAGE_YEARS_MIN = 2;
    final static int TOTAL_MORTGAGE_YEARS_MAX = 27;

    private GlobalStore() {
        return;
    }
}
