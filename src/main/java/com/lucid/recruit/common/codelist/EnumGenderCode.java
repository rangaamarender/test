package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 12:24:46 am
 */
public enum EnumGenderCode {
    MALE("Male"), FEMALE("Female");
    private final String value;
    /**
     * Create a new <code>EnumGenderCode</code>
     * 
     * @param v
     */
    EnumGenderCode(String v) {
        value = v;
    }

    /**
     * @return
     */
    public String value() {
        return value;
    }

    /**
     * @param v
     * @return
     */
    public static EnumGenderCode fromValue(String v) {
        for (EnumGenderCode c : EnumGenderCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
