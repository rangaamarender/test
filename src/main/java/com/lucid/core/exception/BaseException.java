/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.exception;

/**
 * @author sgutti
 * @date Sep 22, 2019 4:02:40 PM
 */
public abstract class BaseException extends Exception {
    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = -3732019724128352605L;
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    private String errorCode;
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>WebException</code>
     * 
     * @param message
     * @param cause
     */
    public BaseException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    /**
     * Create a new <code>WebException</code>
     * 
     * @param errorCode
     * @param message
     */
    public BaseException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
    // ---------------------------------------------------------- Public Methods

    /**
     * @return Returns the errorCode.
     */
    public String getErrorCode() {
        return errorCode;
    }
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
