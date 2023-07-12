/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.exception;

/**
 * @author sgutti
 * @date Sep 22, 2019 10:14:26 PM
 */
public class ParameterException extends BaseException {
    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = -6877293955093752027L;
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>ParameterException</code>
     * 
     * @param errorCode
     * @param message
     * @param cause
     */
    public ParameterException(String errorCode, String message,
            Throwable cause) {
        super(errorCode, message, cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * Create a new <code>ParameterException</code>
     * 
     * @param errorCode
     * @param message
     */
    public ParameterException(String errorCode, String message) {
        super(errorCode, message);
        // TODO Auto-generated constructor stub
    }
    // ---------------------------------------------------------- Public Methods
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
