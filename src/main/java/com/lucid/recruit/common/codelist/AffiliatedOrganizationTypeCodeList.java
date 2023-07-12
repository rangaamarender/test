package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 10:54:44 pm
 */
public enum AffiliatedOrganizationTypeCodeList {
    /**
     * Professional
     */
    PROFESSIONAL("Professional"),
    /**
     * Social
     */
    SOCIAL("Social"),
    /**
     * Community
     */
    COMMUNITY("Community"),
    /**
     * Non-profit
     */
    NON_PROFIT("Non-profit"),
    /**
     * Religious
     */
    RELIGIOUS("Religious"),
    /**
     * Political
     */
    POLITICAL("Political");
    private final String value;
    AffiliatedOrganizationTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AffiliatedOrganizationTypeCodeList fromValue(String v) {
        for (AffiliatedOrganizationTypeCodeList c : AffiliatedOrganizationTypeCodeList
                .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
