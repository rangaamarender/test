/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.email;

import java.util.Map;
import org.springframework.stereotype.Service;
import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;

/**
 * @author sgutti
 * @date Oct 26, 2018 10:28:02 PM
 */
@Service(MustacheTemplateEngine.SERVICE_NAME)
public class MustacheTemplateEngine implements TemplateEngine {
    // --------------------------------------------------------------- Constants
    public static final String SERVICE_NAME = "mustacheTemplateEngine";
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>MustacheTemplateEngine</code>
     */
    public MustacheTemplateEngine() {
        super();
    }

    /**
     * @see com.ecurve.core.email.sn.core.email.TemplateEngine#executeTemplateText(java.lang.String,
     *      java.util.Map)
     */
    @Override
    public String executeTemplateText(String templateText,
                                      Map<String, Object> data) {
        final Template template = Mustache.compiler().compile(templateText);
        return template.execute(data);
    }
    // ---------------------------------------------------------- Public Methods
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
