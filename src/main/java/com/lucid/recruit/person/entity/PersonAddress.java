package com.lucid.recruit.person.entity;

import com.lucid.core.entity.BaseAddress;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = PersonAddress.TABLE_NAME)
public class PersonAddress extends BaseAddress {

	private static final long serialVersionUID = -2004215414831042229L;
	public static final String TABLE_NAME = "p_prsn_addr";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "prsn_address_id", nullable = false, length = 75)
	private String personAddressID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_legal_id", nullable = false, insertable = false, updatable = false)
	private PersonLegal personLegal;

	/**
	 * Create a new <code>PersonAddress</code>
	 */
	public PersonAddress() {
		super();
	}

	public String getPersonAddressID() {
		return personAddressID;
	}

	public void setPersonAddressID(String personAddressID) {
		this.personAddressID = personAddressID;
	}

	public PersonLegal getPersonLegal() {
		return personLegal;
	}

	public void setPersonLegal(PersonLegal personLegal) {
		this.personLegal = personLegal;
	}

}
