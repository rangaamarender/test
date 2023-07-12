package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 11:00:21 pm
 */
public enum PayRateIntervalCodeList {
    /**
     * Hour
     */
    HOUR("Hour"),
    /**
     * Day
     */
    DAY("Day"),
    /**
     * Week
     */
    WEEK("Week"),
    /**
     * Two Week 24
     */
    TWO_WEEK_24("TwoWeek24"),
    /**
     * Two Week 26
     */
    TWO_WEEK_26("TwoWeek26"),
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
     * Quarter To Date
     */
    QUARTER_TO_DATE("QuarterToDate"),
    /**
     * Year To Date
     */
    YEAR_TO_DATE("YearToDate"),
    /**
     * Once
     */
    ONCE("Once");
    private final String value;
    PayRateIntervalCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayRateIntervalCodeList fromValue(String v) {
        for (PayRateIntervalCodeList c : PayRateIntervalCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
