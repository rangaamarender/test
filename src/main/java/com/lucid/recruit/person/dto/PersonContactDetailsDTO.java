package com.lucid.recruit.person.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lucid.core.entity.BasePhoneNbr;
import com.lucid.recruit.person.entity.ContactType;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class PersonContactDetailsDTO {
	@Nullable
	private String personLegalContactID;
	@NotNull
	private ContactType contactType;
	@Embedded
	private BasePhoneNbr phoneNumber;
	@NotNull
	@NotEmpty
	private String emailId;
	@Nullable
	private PersonAddressDTO personAddress;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@Nullable
	private Date endDate;

	public PersonContactDetailsDTO(String personLegalContactID, ContactType contactType, BasePhoneNbr phoneNumber,
			String emailId, PersonAddressDTO personAddress, Date startDate, Date endDate) {
		super();
		this.personLegalContactID = personLegalContactID;
		this.contactType = contactType;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.personAddress = personAddress;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public PersonContactDetailsDTO() {
		super();
	}

	public String getPersonLegalContactID() {
		return personLegalContactID;
	}

	public void setPersonLegalContactID(String personLegalContactID) {
		this.personLegalContactID = personLegalContactID;
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

	public PersonAddressDTO getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(PersonAddressDTO personAddress) {
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
