package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 10:58:41 pm
 */
public enum PayCycleIntervalCodeList {
    /**
     * Day
     */
    DAY("Day"),
    /**
     * Week
     */
    WEEK("Week"),
    /**
     * Two Weeks
     */
    TWO_WEEKS("TwoWeeks"),
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
     * Month-Week
     */
    MONTH_WEEK("MonthWeek"),
    /**
     * Month-Week 2
     */
    MONTH_WEEK_2("MonthWeek2"),
    /**
     * Month-Week 3
     */
    MONTH_WEEK_3("MonthWeek3"),
    /**
     * Month-Week 4
     */
    MONTH_WEEK_4("MonthWeek4"),
    /**
     * Month-Week 5
     */
    MONTH_WEEK_5("MonthWeek5"),
    /**
     * Month-Week-Last
     */
    MONTH_WEEK_LAST("MonthWeekLast"),
    /**
     * Quarter
     */
    QUARTER("Quarter"),
    /**
     * Half Year
     */
    HALF_YEAR("HalfYear"),
    /**
     * Year
     */
    YEAR("Year");
    private final String value;
    PayCycleIntervalCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayCycleIntervalCodeList fromValue(String v) {
        for (PayCycleIntervalCodeList c : PayCycleIntervalCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
