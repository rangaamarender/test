package com.lucid.recruit.timecard.dto;

import com.lucid.recruit.docs.dto.BaseDocumentDTO;

public class TimeCardDocumentDTO  extends BaseDocumentDTO {
    private static final long serialVersionUID = 1L;

	private String timeCardDocID;

    private String documentDefID;

    private  String timecardID;

    public String getTimeCardDocID() {
        return timeCardDocID;
    }

    public void setTimeCardDocID(String timeCardDocID) {
        this.timeCardDocID = timeCardDocID;
    }

    public String getDocumentDefID() {
        return documentDefID;
    }

    public void setDocumentDefID(String documentDefID) {
        this.documentDefID = documentDefID;
    }

    public String getTimecardID() {
        return timecardID;
    }

    public void setTimecardID(String timecardID) {
        this.timecardID = timecardID;
    }
}
