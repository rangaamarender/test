package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 11:01:25 pm
 */
public enum PositionScheduleTypeCodeList {
    /**
     * Full-Time
     */
    FULL_TIME("FullTime"),
    /**
     * Part-Time
     */
    PART_TIME("PartTime"),
    /**
     * Flex Time
     */
    FLEX_TIME("FlexTime"),
    /**
     * Shared Time
     */
    SHARED_TIME("SharedTime");
    private final String value;
    PositionScheduleTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionScheduleTypeCodeList fromValue(String v) {
        for (PositionScheduleTypeCodeList c : PositionScheduleTypeCodeList
                .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
