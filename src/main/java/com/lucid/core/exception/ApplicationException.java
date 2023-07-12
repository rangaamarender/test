/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.exception;

/**
 * @author sgutti
 * @date Oct 26, 2019 11:33:49 PM
 */
public class ApplicationException extends BaseException {
    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = 9166074186538470013L;
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>ApplicationException</code>
     * 
     * @param errorCode
     * @param message
     * @param cause
     */
    public ApplicationException(String errorCode, String message,
            Throwable cause) {
        super(errorCode, message, cause);
    }

    /**
     * Create a new <code>ApplicationException</code>
     * 
     * @param errorCode
     * @param message
     */
    public ApplicationException(String errorCode, String message) {
        super(errorCode, message);
    }
    // ---------------------------------------------------------- Public Methods
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
