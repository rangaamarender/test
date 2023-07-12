/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.util;

/**
 * @author sgutti
 * @date Jul 24, 2022 5:07:23 PM
 */
public abstract interface EnvConfig {
    // --------------------------------------------------------------- Constants
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    // ---------------------------------------------------------- Public Methods
    /**
     * @return Returns the noreplyEmailAddress.
     */
    public String getNoreplyEmailAddress();

    /**
     * @return Returns the supportEmailAddress.
     */
    public String getSupportEmailAddress();

    /**
     * @return
     */
    public String getDefaultPassword();

    /**
     * @return Returns the noreplyEmailAddress.
     */
    public String getSubscriptionInitURL(String code);

    /**
     * @return
     */
    public String getLoginURL();

    /**
     * @return
     */
    public boolean isProdMode();
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
