package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 10:57:52 pm
 */
public enum PatentStatusCodeList {
    FILED("Filed"), ISSUED("Issued"), PENDING("Pending");
    private final String value;
    PatentStatusCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatentStatusCodeList fromValue(String v) {
        for (PatentStatusCodeList c : PatentStatusCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
