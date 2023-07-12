/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.vo;

import com.lucid.core.vo.BaseVO;

/**
 * 
 * @author chandu
 *
 */

public class AttributeGroupDefVO  extends BaseVO {

  

// --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 3743016163806117580L;
 
  
  private Long attrGroupDefID;

  
  private String name;

  
  private String description;

  
  private Integer displayOrder;

  
  private Integer scope;

  
  private String internalCode;

  private Integer status;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeGroupDefVO</code>
   */
  public AttributeGroupDefVO() {
    super();
  }
  
  
  public Long getAttrGroupDefID() {
		return attrGroupDefID;
	}

	public void setAttrGroupDefID(Long attrGroupDefID) {
		this.attrGroupDefID = attrGroupDefID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Integer getScope() {
		return scope;
	}

	public void setScope(Integer scope) {
		this.scope = scope;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
