package com.lucid.core.constants;

public enum EnumTimeCardStatus {
	open, // created the time card but haven’t submitted it yet.
	SUBMITTED, // Submitted the time card, but it has yet to receive all required approvals.
	WAITING_FOR_APPROVAL, // Waiting for approval
	APPROVED, // Approved
	REJECTED, // An approver rejected this time card
	REOPENED, // Reopened the time sheet after approval
	AMENDED, // updated the time card and made changes after approval
	ARCHIVED,// Archived the time sheet

}
