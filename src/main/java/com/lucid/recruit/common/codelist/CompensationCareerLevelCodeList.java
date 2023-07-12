package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 10:57:13 pm
 */
public enum CompensationCareerLevelCodeList {
    /**
     * Entry Level
     */
    ENTRY_LEVEL("EntryLevel"),
    /**
     * Some Relevant Experience
     */
    SOME_RELEVANT_EXPERIENCE("SomeRelevantExperience"),
    /**
     * Experienced
     */
    EXPERIENCED("Experienced"),
    /**
     * Senior Level
     */
    SENIOR_LEVEL("SeniorLevel"),
    /**
     * Mastery Level
     */
    MASTERY_LEVEL("MasteryLevel"),
    /**
     * Industry Expert
     */
    INDUSTRY_EXPERT("IndustryExpert");
    private final String value;
    CompensationCareerLevelCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompensationCareerLevelCodeList fromValue(String v) {
        for (CompensationCareerLevelCodeList c : CompensationCareerLevelCodeList
                .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
