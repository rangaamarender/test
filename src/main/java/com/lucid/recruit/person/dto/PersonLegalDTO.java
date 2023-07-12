package com.lucid.recruit.person.dto;

import java.util.Date;
import java.util.List;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author chandu
 *
 */
public class PersonLegalDTO {
	@Nullable
	private String personLegalID;
	@NotNull
	@Size(min = 2, message = "first name should have at least 2 characters")
	private String givenName;
	@Nullable
	private String middleName;
	@NotNull
	@Size(min = 2, message = "first name should have at least 2 characters")
	private String familyName;
	@Nullable
	private String preferredName;
	@Nullable
	private Date birthDate;
	@Nullable
	private String gender;
	@Nullable
	private String maritalStatus;
	@Nullable
	private List<PersonLegalDocumentDTO> personLegalDocuments;
	@NotNull
	@NotEmpty
	private List<PersonContactDetailsDTO> personContactDetails;
	@Nullable
	private List<PersonBankDetailsDTO> personBankDetails;
	@Nullable
	private List<PersonEmergencyContactDTO> personEmergencyContact;
	@Nullable
	private List<PersonDependentsDTO> personDependents;

	public PersonLegalDTO(String givenName, String middleName, String familyName,
			List<PersonContactDetailsDTO> personContactDetails) {
		super();
		this.givenName = givenName;
		this.middleName = middleName;
		this.familyName = familyName;
		this.personContactDetails = personContactDetails;
	}

	public PersonLegalDTO(String personLegalID,
			@NotNull @Size(min = 2, message = "first name should have at least 2 characters") String givenName,
			String middleName,
			@NotNull @Size(min = 2, message = "first name should have at least 2 characters") String familyName,
			String preferredName, Date birthDate, String gender, String maritalStatus,
			List<PersonLegalDocumentDTO> personLegalDocuments,
			@NotNull @NotEmpty List<PersonContactDetailsDTO> personContactDetails,
			List<PersonBankDetailsDTO> personBankDetails, List<PersonEmergencyContactDTO> personEmergencyContact,
			List<PersonDependentsDTO> personDependents) {
		super();
		this.personLegalID = personLegalID;
		this.givenName = givenName;
		this.middleName = middleName;
		this.familyName = familyName;
		this.preferredName = preferredName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.personLegalDocuments = personLegalDocuments;
		this.personContactDetails = personContactDetails;
		this.personBankDetails = personBankDetails;
		this.personEmergencyContact = personEmergencyContact;
		this.personDependents = personDependents;
	}

	public PersonLegalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPersonLegalID() {
		return personLegalID;
	}

	public void setPersonLegalID(String personLegalID) {
		this.personLegalID = personLegalID;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public List<PersonLegalDocumentDTO> getPersonLegalDocuments() {
		return personLegalDocuments;
	}

	public void setPersonLegalDocuments(List<PersonLegalDocumentDTO> personLegalDocuments) {
		this.personLegalDocuments = personLegalDocuments;
	}

	public List<PersonContactDetailsDTO> getPersonContactDetails() {
		return personContactDetails;
	}

	public void setPersonContactDetails(List<PersonContactDetailsDTO> personContactDetails) {
		this.personContactDetails = personContactDetails;
	}

	public List<PersonBankDetailsDTO> getPersonBankDetails() {
		return personBankDetails;
	}

	public void setPersonBankDetails(List<PersonBankDetailsDTO> personBankDetails) {
		this.personBankDetails = personBankDetails;
	}

	public List<PersonEmergencyContactDTO> getPersonEmergencyContact() {
		return personEmergencyContact;
	}

	public void setPersonEmergencyContact(List<PersonEmergencyContactDTO> personEmergencyContact) {
		this.personEmergencyContact = personEmergencyContact;
	}

	public List<PersonDependentsDTO> getPersonDependents() {
		return personDependents;
	}

	public void setPersonDependents(List<PersonDependentsDTO> personDependents) {
		this.personDependents = personDependents;
	}

}
