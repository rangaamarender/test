package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 11:02:12 pm
 */
public enum PositionTypeCodeList {
    /**
     * Direct Hire
     */
    DIRECT_HIRE("DirectHire"),
    /**
     * Temporary
     */
    TEMPORARY("Temporary"),
    /**
     * Temporary To Hire
     */
    TEMPORARY_TO_HIRE("TemporaryToHire"),
    /**
     * Contract To Hire
     */
    CONTRACT_TO_HIRE("ContractToHire"),
    /**
     * Contract
     */
    CONTRACT("Contract"),
    /**
     * Internship
     */
    INTERNSHIP("Internship"),
    /**
     * Externship
     */
    EXTERNSHIP("Externship"),
    /**
     * Apprenticeship
     */
    APPRENTICESHIP("Apprenticeship"),
    /**
     * Seasonal
     */
    SEASONAL("Seasonal"),
    /**
     * Student
     */
    STUDENT("Student"),
    /**
     * Volunteer
     */
    VOLUNTEER("Volunteer");
    private final String value;
    PositionTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionTypeCodeList fromValue(String v) {
        for (PositionTypeCodeList c : PositionTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
