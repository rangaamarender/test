package com.lucid.recruit.timecard.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class TimeCardItemDTO {

	private String timecardItemID;

	@NotNull
	private LocalDate itemDate;
	@NotNull
	private LocalTime regularTime;
	@Nullable
	private LocalTime overTime;
	@Nullable
	private LocalTime doubleTime;
	@Nullable
	private LocalTime paidVacationTime;
	@Nullable
	private LocalTime unpaidVacationTime;

	private String comment;

	public String getTimecardItemID() {
		return timecardItemID;
	}

	public void setTimecardItemID(String timecardItemID) {
		this.timecardItemID = timecardItemID;
	}

	public LocalDate getItemDate() {
		return itemDate;
	}

	public void setItemDate(LocalDate itemDate) {
		this.itemDate = itemDate;
	}

	public LocalTime getRegularTime() {
		return regularTime;
	}

	public void setRegularTime(LocalTime regularTime) {
		this.regularTime = regularTime;
	}

	public LocalTime getOverTime() {
		return overTime;
	}

	public void setOverTime(LocalTime overTime) {
		this.overTime = overTime;
	}

	public LocalTime getDoubleTime() {
		return doubleTime;
	}

	public void setDoubleTime(LocalTime doubleTime) {
		this.doubleTime = doubleTime;
	}

	public LocalTime getPaidVacationTime() {
		return paidVacationTime;
	}

	public void setPaidVacationTime(LocalTime paidVacationTime) {
		this.paidVacationTime = paidVacationTime;
	}

	public LocalTime getUnpaidVacationTime() {
		return unpaidVacationTime;
	}

	public void setUnpaidVacationTime(LocalTime unpaidVacationTime) {
		this.unpaidVacationTime = unpaidVacationTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
