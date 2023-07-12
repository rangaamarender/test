/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import java.time.LocalDate;
import java.util.List;

import com.lucid.core.constants.EnumTimeCardStatus;
import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.contract.entity.Contract;
import com.lucid.recruit.contract.entity.ContractWorkOrder;
import com.lucid.recruit.worker.entity.Worker;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = TimeCard.TABLE_NAME)
public class TimeCard extends AuditableEntity {

	private static final long serialVersionUID = -619170040525323189L;
	public static final String TABLE_NAME = "t_timecard";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "timecard_id", nullable = false, length = 75)
	private String timecardID;

	// Worker whose time card is for
	@ManyToOne
	@JoinColumn(name = "worker_id", nullable = true, updatable = false)
	private Worker worker;

	@Column(name = "start_dat", nullable = false)
	private LocalDate startDate;

	@Column(name = "end_dat", nullable = false)
	private LocalDate endDate;

	// Project code the time recorder against
	@ManyToOne
	@JoinColumn(name = "wrkorder_id", nullable = true, updatable = false)
	private ContractWorkOrder workOrder;

	// Contract of the work order
	@ManyToOne
	@JoinColumn(name = "cntrct_id", nullable = true, updatable = false)
	private Contract contract;

	@Column(name = "total_regular_time", nullable = true)
	private double totalRegularTime;

	@Column(name = "total_over_time", nullable = true)
	private double totalOverTime;

	@Column(name = "total_double_time", nullable = true)
	private double totaldoubleTime;

	// List of Time Card Items
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "timeCard")
	private List<TimeCardItem> timeCardItems;

	// List of Time Card Expenses
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "timeCard")
	private List<TimeCardExpense> timeCardExpenses;

	// List of Time card documents
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "timeCard")
	private List<TimeCardDocument> timeCardDocuments;

	// List of Time card expenses documents
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "timeCard")
	private List<TimeCardExpenseDocument> timeCardExpenseDocuments;

	@Enumerated(EnumType.STRING)
	@Column(name = "timecard_status", nullable = false, length = 25)
	private EnumTimeCardStatus timeCardStatus;

	/**
	 * Create a new <code>TimeCard</code>
	 */
	public TimeCard() {
		super();
	}

	public String getTimecardID() {
		return timecardID;
	}

	public void setTimecardID(String timecardID) {
		this.timecardID = timecardID;
	}

	public ContractWorkOrder getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(ContractWorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
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

	public List<TimeCardItem> getTimeCardItems() {
		return timeCardItems;
	}

	public void setTimeCardItems(List<TimeCardItem> timeCardItems) {
		this.timeCardItems = timeCardItems;
	}

	public List<TimeCardExpense> getTimeCardExpenses() {
		return timeCardExpenses;
	}

	public void setTimeCardExpenses(List<TimeCardExpense> timeCardExpenses) {
		this.timeCardExpenses = timeCardExpenses;
	}

	public List<TimeCardDocument> getTimeCardDocuments() {
		return timeCardDocuments;
	}

	public void setTimeCardDocuments(List<TimeCardDocument> timeCardDocuments) {
		this.timeCardDocuments = timeCardDocuments;
	}

	public List<TimeCardExpenseDocument> getTimeCardExpenseDocuments() {
		return timeCardExpenseDocuments;
	}

	public void setTimeCardExpenseDocuments(List<TimeCardExpenseDocument> timeCardExpenseDocuments) {
		this.timeCardExpenseDocuments = timeCardExpenseDocuments;
	}

	public EnumTimeCardStatus getTimeCardStatus() {
		return timeCardStatus;
	}

	public void setTimeCardStatus(EnumTimeCardStatus timeCardStatus) {
		this.timeCardStatus = timeCardStatus;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}
