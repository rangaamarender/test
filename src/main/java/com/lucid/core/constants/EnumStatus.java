/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.constants;

/**
 * @author sgutti
 * @date Dec 8, 2019 11:01:57 AM
 */
public class EnumStatus {
    // --------------------------------------------------------------- Constants
    public static final int ACTIVE = 1;
    public static final int INACTIVE = 0;
    public static final String ACTIVE_STR = "ACTIVE";
    public static final String INACTIVE_STR = "INACTIVE";
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>EnumStatus</code>
     */
    private EnumStatus() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    /**
     * @param status
     * @return
     */
    public static String toString(int status) {
        if (status == ACTIVE) {
            return ACTIVE_STR;
        }
        if (status == INACTIVE) {
            return INACTIVE_STR;
        }
        return "";
    }

    /**
     * @param status
     * @return
     */
    public static boolean isActiveBoo(int status) {
        return (status == ACTIVE);
    }
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
