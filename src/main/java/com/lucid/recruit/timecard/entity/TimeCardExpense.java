/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import com.lucid.core.embeddable.Amount;
import com.lucid.core.entity.AuditableEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = TimeCardExpense.TABLE_NAME)
public class TimeCardExpense extends AuditableEntity {

	private static final long serialVersionUID = -2315752050897625175L;
	public static final String TABLE_NAME = "t_timecard_expense";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "expense_id", nullable = false, length = 75)
	private String expenseID;

	@Column(name = "name", nullable = true, length = 50)
	private String name;

	// time card for expenses
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "timecard_id", nullable = false, insertable = false, updatable = false)
	private TimeCard timeCard;

	@Column(name = "billable", nullable = true)
	private boolean billable;

	@Column(name = "payable", nullable = true)
	private boolean payable;

	@Column(name = "code", nullable = true, length = 25)
	private String code;

	@Embedded
	private Amount amount;

	// Comments
	@Column(name = "comment", nullable = true, length = 400)
	private String comment;

	public String getExpenseID() {
		return expenseID;
	}

	public void setExpenseID(String expenseID) {
		this.expenseID = expenseID;
	}

	public TimeCard getTimeCard() {
		return timeCard;
	}

	public void setTimeCard(TimeCard timeCard) {
		this.timeCard = timeCard;
	}

	public boolean isBillable() {
		return billable;
	}

	public void setBillable(boolean billable) {
		this.billable = billable;
	}

	public boolean isPayable() {
		return payable;
	}

	public void setPayable(boolean payable) {
		this.payable = payable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
