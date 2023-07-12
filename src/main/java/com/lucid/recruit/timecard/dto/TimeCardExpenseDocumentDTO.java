package com.lucid.recruit.timecard.dto;

import com.lucid.recruit.docs.dto.BaseDocumentDTO;

public class TimeCardExpenseDocumentDTO extends BaseDocumentDTO {
	private static final long serialVersionUID = 5278959126284439438L;

	private String timecardexpensedocID;
	private String timecardID;

	public String getTimecardexpensedocID() {
		return timecardexpensedocID;
	}

	public void setTimecardexpensedocID(String timecardexpensedocID) {
		this.timecardexpensedocID = timecardexpensedocID;
	}

	public String getTimecardID() {
		return timecardID;
	}

	public void setTimecardID(String timecardID) {
		this.timecardID = timecardID;
	}

}
