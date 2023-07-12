package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 10:56:39 pm
 */
public enum CareerLevelCodeList {
    /**
     * Student
     */
    STUDENT("Student"),
    /**
     * Entry Level
     */
    ENTRY_LEVEL("EntryLevel"),
    /**
     * Recent Graduate
     */
    RECENT_GRADUATE("RecentGraduate"),
    /**
     * Mid Career
     */
    MID_CAREER("MidCareer"),
    /**
     * Manager
     */
    MANAGER("Manager"),
    /**
     * Experienced Non-Manager
     */
    EXPERIENCED_NON_MANAGER("ExperiencedNonManager"),
    /**
     * Senior Executive
     */
    SENIOR_EXECUTIVE("SeniorExecutive");
    private final String value;
    CareerLevelCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CareerLevelCodeList fromValue(String v) {
        for (CareerLevelCodeList c : CareerLevelCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
