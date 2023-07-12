/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author sgutti
 * @date Dec 8, 2019 12:41:02 PM
 */
public class GenerateKeys {
    // --------------------------------------------------------------- Constants
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>GenerateKeys</code>
     */
    private GenerateKeys() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    /**
     * @return
     */
    public static String generateUserSalt() {
        return RandomStringUtils.randomAlphanumeric(7);
    }

    /**
     * @return
     */
    public static String generateUserPassword() {
        return RandomStringUtils.randomAlphabetic(15);
    }

    /**
     * @param identifier
     * @return
     */
    public static String generateTenantExternalCode() {
        String name = "S";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dateFormat = format.format(Calendar.getInstance().getTime());
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(dateFormat);
        String temp = RandomStringUtils.randomNumeric(0, 7);
        builder.append(temp);
        return builder.toString();
    }

    /**
     * @param identifier
     * @return
     */
    public static String generateSupplierCode(long supplierID) {
        String name = "S";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
        String dateFormat = format.format(Calendar.getInstance().getTime());
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(dateFormat);
        String temp = RandomStringUtils.randomNumeric(0, 7);
        builder.append(temp);
        return builder.toString();
    }

    /**
     * @return
     */
    public static String generateSubAcctNbr() {
        String name = "AC";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dateFormat = format.format(Calendar.getInstance().getTime());
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(dateFormat);
        String temp = RandomStringUtils.randomNumeric(0, 4);
        builder.append(temp);
        return builder.toString();
    }

    /**
     * @return
     */
    public static String generateIssueLogCode() {
        String name = "";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmm");
        String dateFormat = format.format(Calendar.getInstance().getTime());
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(dateFormat);
        String temp = RandomStringUtils.randomNumeric(0, 7);
        builder.append(temp);
        return builder.toString();
    }
    // ----------------------------------------------------------- Inner Classes
}
