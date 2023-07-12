/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.email;

import java.util.Map;

/**
 * @author sgutti
 * @date Oct 26, 2018 10:27:04 PM
 */
public interface TemplateEngine {
    // --------------------------------------------------------------- Constants
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    // ---------------------------------------------------------- Public Methods
    /**
     * @param templateText
     * @param data
     * @return
     */
    public String executeTemplateText(final String templateText,
                                      final Map<String, Object> data);
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
