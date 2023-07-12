package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 10:46:46 pm
 */
public enum WeekdayCodeList {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY(
            "Thursday"), FRIDAY(
                    "Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");
    private final String value;
    WeekdayCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeekdayCodeList fromValue(String v) {
        for (WeekdayCodeList c : WeekdayCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
