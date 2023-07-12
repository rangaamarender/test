package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 10:56:07 pm
 */
public enum AssignmentReasonCodeList {
    ACQUISITION("Acquisition"), DEMOTION("Demotion"), LATERAL(
            "Lateral"), PROMOTION("Promotion"), TRANSFER("Transfer"), RE_HIRE(
                    "Re-hire"), RETIREMENT("Retirement"), LEAVE(
                            "Leave"), TERMINATION("Termination");
    private final String value;
    AssignmentReasonCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssignmentReasonCodeList fromValue(String v) {
        for (AssignmentReasonCodeList c : AssignmentReasonCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
