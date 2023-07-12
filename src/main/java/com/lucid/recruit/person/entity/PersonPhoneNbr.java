/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.entity;

import com.lucid.core.entity.BasePhoneNbr;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 12-Feb-2023 1:33:26 pm
 *
 */
//@Entity
@Table(name = PersonPhoneNbr.TABLE_NAME)
public class PersonPhoneNbr extends BasePhoneNbr {

	private static final long serialVersionUID = -2681231602205723334L;
	public static final String TABLE_NAME = "p_prsn_phonenbr";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "prsn_phonenbr_id", nullable = false, length = 75)
	private String personPhoneNbrID;

	@Column(name = "phone_type", nullable = false, length = 75)
	private String phoneType;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prsn_legal_d", nullable = false, insertable = false, updatable = false)
	private PersonLegal personLegal;

	/**
	 * Create a new <code>PersonPhoneNbr</code>
	 */
	public PersonPhoneNbr() {
		super();
	}

	public String getPersonPhoneNbrID() {
		return personPhoneNbrID;
	}

	public void setPersonPhoneNbrID(String personPhoneNbrID) {
		this.personPhoneNbrID = personPhoneNbrID;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public PersonLegal getPersonLegal() {
		return personLegal;
	}

	public void setPersonLegal(PersonLegal personLegal) {
		this.personLegal = personLegal;
	}

}
