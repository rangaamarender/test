package com.lucid.recruit.person.entity;

import java.util.Date;

import com.lucid.core.entity.AuditableEntity;
import com.lucid.core.entity.BasePhoneNbr;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = PersonEmergencyContact.TABLE_NAME)
public class PersonEmergencyContact extends AuditableEntity {

	private static final long serialVersionUID = 7609349402750903434L;
	public static final String TABLE_NAME = "p_prsn_emerg_contacts";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "prsn_emerg_contact_id", nullable = false, updatable = false, length = 75)
	private String personEmergContactId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_legal_id", nullable = false, insertable = false, updatable = false)
	private PersonLegal personLegal;

	@Column(name = "valid_from", nullable = false, updatable = false)
	private Date validFrom;

	@Column(name = "valid_to", nullable = false, updatable = false)
	private Date validTo;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String last_name;

	@Enumerated(EnumType.STRING)
	@Column(name = "relation", nullable = false)
	private RelationshipCode relation;

	@Column(name = "email_type", nullable = false)
	private String emailType;

	@Column(name = "email_id", nullable = false)
	private String emailId;

	@Column(name = "phone_type", nullable = false)
	private String phoneType;

	@Embedded
	private BasePhoneNbr phoneNumber;

	public String getPersonEmergContactId() {
		return personEmergContactId;
	}

	public void setPersonEmergContactId(String personEmergContactId) {
		this.personEmergContactId = personEmergContactId;
	}

	public PersonLegal getPersonLegal() {
		return personLegal;
	}

	public void setPersonLegal(PersonLegal personLegal) {
		this.personLegal = personLegal;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public RelationshipCode getRelation() {
		return relation;
	}

	public void setRelation(RelationshipCode relation) {
		this.relation = relation;
	}

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public BasePhoneNbr getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(BasePhoneNbr phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
