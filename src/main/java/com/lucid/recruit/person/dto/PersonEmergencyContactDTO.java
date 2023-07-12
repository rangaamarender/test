package com.lucid.recruit.person.dto;

import java.util.Date;

import com.lucid.core.entity.BasePhoneNbr;
import com.lucid.recruit.person.entity.RelationshipCode;

import jakarta.persistence.Embedded;

public class PersonEmergencyContactDTO {
	private String id;
	private Date validFrom;
	private Date validTo;
	private String firstName;
	private String last_name;
	private RelationshipCode relation;
	private String emailType;
	private String emailId;
	private String phoneType;
	@Embedded
	private BasePhoneNbr phoneNumber;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
