/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.vo;

/**
 * @author ecrv-scredit
 * @date Jan 23, 2020 7:07:27 PM
 */
public class RefDataVO extends BaseVO {
    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = -2156480481822037986L;
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    private String description;
    private String code;
    private Integer sortOrder;
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>RefDataVO</code>
     */
    public RefDataVO() {
        super();
    }
    // ---------------------------------------------------------- Public Methods

    /**
     * @return Returns the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     *            The code to set.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return Returns the sortOrder.
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * @param sortOrder
     *            The sortOrder to set.
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RefDataVO [description=");
        builder.append(description);
        builder.append(", code=");
        builder.append(code);
        builder.append(", sortOrder=");
        builder.append(sortOrder);
        builder.append("]");
        return builder.toString();
    }
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
