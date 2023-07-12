package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 11:03:15 pm
 */
public enum ScheduledHoursCodeList {
    /**
     * Week
     */
    WEEK("Week"),
    /**
     * Two Weeks
     */
    TWO_WEEKS("TwoWeeks"),
    /**
     * Four Weeks
     */
    FOUR_WEEKS("FourWeeks"),
    /**
     * Half Month
     */
    HALF_MONTH("HalfMonth"),
    /**
     * Month
     */
    MONTH("Month"),
    /**
     * Two Months
     */
    TWO_MONTHS("TwoMonths"),
    /**
     * Quarter
     */
    QUARTER("Quarter"),
    /**
     * Seasonal Term
     */
    SEASONAL_TERM("SeasonalTerm"),
    /**
     * Half Year
     */
    HALF_YEAR("HalfYear"),
    /**
     * Year
     */
    YEAR("Year"),
    /**
     * Shift
     */
    SHIFT("Shift");
    private final String value;
    ScheduledHoursCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScheduledHoursCodeList fromValue(String v) {
        for (ScheduledHoursCodeList c : ScheduledHoursCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
