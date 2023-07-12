
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = PersonContactDetails.TABLE_NAME, uniqueConstraints = @UniqueConstraint(name = "UQPRSNContact", columnNames = {
		"person_legal_id", "contact_type", "start_dat" }))
public class PersonContactDetails extends AuditableEntity {

	private static final long serialVersionUID = 1511878007648695013L;
	public static final String TABLE_NAME = "p_prsn_contact_details";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "prsn_legal_contact_id", nullable = false, length = 75)
	private String personLegalContactID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_legal_id", nullable = false, updatable = false)
	private PersonLegal personLegal;

	@Enumerated(EnumType.STRING)
	@Column(name = "contact_type", nullable = false, length = 25)
	private ContactType contactType;

	@Embedded
	private BasePhoneNbr phoneNumber;

	@Column(name = "email_id", nullable = false, length = 75)
	private String emailId;

	@OneToOne
	@JoinColumn(name = "prsn_address_id", nullable = true, updatable = false)
	private PersonAddress personAddress;

	@Column(name = "start_dat", nullable = false)
	private Date startDate;

	@Column(name = "end_dat", nullable = true)
	private Date endDate;

	public String getPersonLegalContactID() {
		return personLegalContactID;
	}

	public void setPersonLegalContactID(String personLegalContactID) {
		this.personLegalContactID = personLegalContactID;
	}

	public PersonLegal getPersonLegal() {
		return personLegal;
	}

	public void setPersonLegal(PersonLegal personLegal) {
		this.personLegal = personLegal;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public BasePhoneNbr getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(BasePhoneNbr phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public PersonAddress getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(PersonAddress personAddress) {
		this.personAddress = personAddress;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
