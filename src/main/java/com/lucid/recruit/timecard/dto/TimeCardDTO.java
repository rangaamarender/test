package com.lucid.recruit.timecard.dto;

import java.time.LocalDate;
import java.util.List;

import com.lucid.core.constants.EnumTimeCardStatus;
import com.lucid.recruit.contract.dto.RelatedWorkOrderDTO;
import com.lucid.recruit.worker.dto.RelatedWorkerDTO;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class TimeCardDTO {

	@Nullable
	private String timecardID;

	@NotNull
	private RelatedWorkerDTO worker;

	@NotNull
	private RelatedWorkOrderDTO workOrder;

	@NotNull(message = "Start date cannot be null")
	private LocalDate startDate;
	
	@NotNull(message = "End date cannot be null")
	private LocalDate endDate;

	@Nullable
	private double totalRegularTime;
	@Nullable
	private double totalOverTime;
	@Nullable
	private double totaldoubleTime;

	@NotNull
	@NotEmpty
	private List<TimeCardItemDTO> timeCardItems;

	@Nullable
	private List<TimeCardExpenseDTO> timeCardExpenses;

	@Nullable
	private List<TimeCardDocumentDTO> timeCardDocuments;

	@Nullable
	private List<TimeCardExpenseDocumentDTO> timeCardExpenseDocuments;

	private EnumTimeCardStatus timeCardStatus;

	public double getTotalRegularTime() {
		return totalRegularTime;
	}

	public void setTotalRegularTime(double totalRegularTime) {
		this.totalRegularTime = totalRegularTime;
	}

	public double getTotalOverTime() {
		return totalOverTime;
	}

	public void setTotalOverTime(double totalOverTime) {
		this.totalOverTime = totalOverTime;
	}

	public double getTotaldoubleTime() {
		return totaldoubleTime;
	}

	public void setTotaldoubleTime(double totaldoubleTime) {
		this.totaldoubleTime = totaldoubleTime;
	}

	public String getTimecardID() {
		return timecardID;
	}

	public void setTimecardID(String timecardID) {
		this.timecardID = timecardID;
	}

	public RelatedWorkerDTO getWorker() {
		return worker;
	}

	public void setWorker(RelatedWorkerDTO worker) {
		this.worker = worker;
	}

	public RelatedWorkOrderDTO getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(RelatedWorkOrderDTO workOrder) {
		this.workOrder = workOrder;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<TimeCardItemDTO> getTimeCardItems() {
		return timeCardItems;
	}

	public void setTimeCardItems(List<TimeCardItemDTO> timeCardItems) {
		this.timeCardItems = timeCardItems;
	}

	public List<TimeCardExpenseDTO> getTimeCardExpenses() {
		return timeCardExpenses;
	}

	public void setTimeCardExpenses(List<TimeCardExpenseDTO> timeCardExpenses) {
		this.timeCardExpenses = timeCardExpenses;
	}

	public List<TimeCardDocumentDTO> getTimeCardDocuments() {
		return timeCardDocuments;
	}

	public void setTimeCardDocuments(List<TimeCardDocumentDTO> timeCardDocuments) {
		this.timeCardDocuments = timeCardDocuments;
	}

	public List<TimeCardExpenseDocumentDTO> getTimeCardExpenseDocuments() {
		return timeCardExpenseDocuments;
	}

	public void setTimeCardExpenseDocuments(List<TimeCardExpenseDocumentDTO> timeCardExpenseDocuments) {
		this.timeCardExpenseDocuments = timeCardExpenseDocuments;
	}

	public EnumTimeCardStatus getTimeCardStatus() {
		return timeCardStatus;
	}

	public void setTimeCardStatus(EnumTimeCardStatus timeCardStatus) {
		this.timeCardStatus = timeCardStatus;
	}

}
