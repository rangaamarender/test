package com.lucid.recruit.common.codelist;

/**
 * @author sgutti
 * @date 25-Jan-2023 11:00:59 pm
 */
public enum PayTypeCodeList {
    /**
     * Base Pay
     */
    BASE_PAY("BasePay"),
    /**
     * Commission
     */
    COMMISSION("Commission"),
    /**
     * Bonus
     */
    BONUS("Bonus"),
    /**
     * Short-Term Incentive
     */
    SHORT_TERM_INCENTIVE("ShortTermIncentive"),
    /**
     * Shift Pay
     */
    SHIFT_PAY("ShiftPay"),
    /**
     * On Call
     */
    ON_CALL("OnCall"),
    /**
     * Hazard
     */
    HAZARD("Hazard"),
    /**
     * Variable Pay
     */
    VARIABLE_PAY("VariablePay"),
    /**
     * Allowance
     */
    ALLOWANCE("Allowance"),
    /**
     * Overtime
     */
    OVERTIME("Overtime");
    private final String value;
    PayTypeCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayTypeCodeList fromValue(String v) {
        for (PayTypeCodeList c : PayTypeCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
