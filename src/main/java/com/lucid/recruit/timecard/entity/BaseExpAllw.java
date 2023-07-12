/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import com.lucid.core.entity.BaseEntity;

import jakarta.persistence.Column;

/**
 * @author sgutti
 * @date 25-Feb-2023 8:10:30 am
 *
 */
//@MappedSuperclass
public abstract class BaseExpAllw extends BaseEntity {

	// --------------------------------------------------------------- Constants
	private static final long serialVersionUID = 7758706302996209410L;

	// --------------------------------------------------------- Class Variables
	// ----------------------------------------------------- Static Initializers
	// ------------------------------------------------------ Instance Variables
	@Column(name = "status_code", nullable = true, length = 25)
	private String statusCode;

	@Column(name = "billable", nullable = true)
	private Boolean billable;

	@Column(name = "payable", nullable = true)
	private Boolean payable;

	@Column(name = "comment", nullable = true, length = 400)
	private String comment;

	@Column(name = "name", nullable = true, length = 50)
	private String name;

	@Column(name = "code", nullable = true, length = 25)
	private String code;

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>BaseExpAllw</code>
	 */
	public BaseExpAllw() {
		super();
	}

	// ---------------------------------------------------------- Public Methods
	// ------------------------------------------------------- Protected Methods
	// --------------------------------------------------------- Default Methods
	// --------------------------------------------------------- Private Methods
	// ---------------------------------------------------------- Static Methods
	// ----------------------------------------------------------- Inner Classes
}
