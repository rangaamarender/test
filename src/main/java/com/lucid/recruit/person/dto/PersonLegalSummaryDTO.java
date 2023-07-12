package com.lucid.recruit.person.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author chandu
 *
 */
public class PersonLegalSummaryDTO {
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

	public PersonLegalSummaryDTO(String personLegalID,
			@NotNull @Size(min = 2, message = "first name should have at least 2 characters") String givenName,
			String middleName,
			@NotNull @Size(min = 2, message = "first name should have at least 2 characters") String familyName,
			String preferredName) {
		super();
		this.personLegalID = personLegalID;
		this.givenName = givenName;
		this.middleName = middleName;
		this.familyName = familyName;
		this.preferredName = preferredName;
	}

	public PersonLegalSummaryDTO() {
		super();

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

}
