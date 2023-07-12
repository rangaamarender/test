/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import com.lucid.core.entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = TimeCardItem.TABLE_NAME)
public class TimeCardItem extends BaseEntity {

	private static final long serialVersionUID = 1688975540910475920L;
	public static final String TABLE_NAME = "t_timecard_item";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "timecard_item_id", nullable = false, length = 75)
	private String timecardItemID;

	// time card for items
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "timecard_id", nullable = false, insertable = false, updatable = false)
	private TimeCard timeCard;

	// Category under the project link to pay rate
	@Column(name = "item_date", nullable = false)
	private LocalDate itemDate;

	// Number of regular hours
	@Column(name = "regular_time", nullable = false)
	private LocalTime regularTime;

	// Number of regular hours
	@Column(name = "over_time", nullable = false)
	private LocalTime overTime;

	@Column(name = "double_time", nullable = false)
	private LocalTime doubleTime;

	// Number of regular hours
	@Column(name = "pv_time", nullable = false)
	private double paidVacationTime;

	// Number of regular hours
	@Column(name = "uv_time", nullable = false)
	private double unpaidVacationTime;

	// Comments
	@Column(name = "comment", nullable = true, length = 400)
	private String comment;

	public TimeCardItem() {
		super();
	}

	public String getTimecardItemID() {
		return timecardItemID;
	}

	public void setTimecardItemID(String timecardItemID) {
		this.timecardItemID = timecardItemID;
	}

	public TimeCard getTimeCard() {
		return timeCard;
	}

	public void setTimeCard(TimeCard timeCard) {
		this.timeCard = timeCard;
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

	public double getPaidVacationTime() {
		return paidVacationTime;
	}

	public void setPaidVacationTime(double paidVacationTime) {
		this.paidVacationTime = paidVacationTime;
	}

	public double getUnpaidVacationTime() {
		return unpaidVacationTime;
	}

	public void setUnpaidVacationTime(double unpaidVacationTime) {
		this.unpaidVacationTime = unpaidVacationTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
