package com.lucid.recruit.person.dto;

import java.util.Date;

import com.lucid.recruit.person.entity.RelationshipCode;

public class PersonDependentsDTO {
	private String id;
	private String firstName;
	private String lastName;
	private RelationshipCode relation;
	private Date brithDate;
	private Date validFrom;
	private Date validTo;

	public PersonDependentsDTO(String id, String firstName, String lastName, RelationshipCode relation, Date brithDate,
			Date validFrom, Date validTo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.relation = relation;
		this.brithDate = brithDate;
		this.validFrom = validFrom;
		this.validTo = validTo;
	}

	public PersonDependentsDTO() {
		super();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public RelationshipCode getRelation() {
		return relation;
	}

	public void setRelation(RelationshipCode relation) {
		this.relation = relation;
	}

	public Date getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
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

}
