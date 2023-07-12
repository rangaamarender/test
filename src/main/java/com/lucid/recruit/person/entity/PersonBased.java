/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.entity;

import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 12-Feb-2023 1:21:13 pm
 *
 */
@MappedSuperclass
public abstract class PersonBased extends BaseEntity {

	private static final long serialVersionUID = -4107116285213714328L;

	@Column(name = "person_legal_id", nullable = false, length = 75)
	private String personLegalID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_legal_id", nullable = false, insertable = false, updatable = false)
	private PersonLegal personLegal;

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>PersonBased</code>
	 */
	public PersonBased() {
		super();
	}

	public String getPersonLegalID() {
		return personLegalID;
	}

	public void setPersonLegalID(String personLegalID) {
		this.personLegalID = personLegalID;
	}

	public PersonLegal getPersonLegal() {
		return personLegal;
	}

	public void setPersonLegal(PersonLegal personLegal) {
		this.personLegal = personLegal;
	}

}
