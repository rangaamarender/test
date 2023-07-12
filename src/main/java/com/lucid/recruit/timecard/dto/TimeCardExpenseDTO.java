package com.lucid.recruit.timecard.dto;

import com.lucid.core.embeddable.Amount;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class TimeCardExpenseDTO {

	private String expenseID;

	@NotNull
	private String name;

	@Nullable
	private String code;
	@Nullable
	private boolean billable;
	@Nullable
	private boolean payable;
	@NotNull
	private Amount amount;
	@Nullable
	private String comment;

	public String getExpenseID() {
		return expenseID;
	}

	public void setExpenseID(String expenseID) {
		this.expenseID = expenseID;
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
