package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 11:02:40 pm
 */
public enum ResourceRelationshipCodeList {
    /**
     * Employee
     */
    EMPLOYEE("Employee"),
    /**
     * VendorEmployee
     */
    VENDOR_EMPLOYEE("VendorEmployee");
    private final String value;
    ResourceRelationshipCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceRelationshipCodeList fromValue(String v) {
        for (ResourceRelationshipCodeList c : ResourceRelationshipCodeList
                .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
