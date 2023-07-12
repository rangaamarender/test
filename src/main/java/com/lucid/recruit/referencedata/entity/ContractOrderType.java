package com.lucid.recruit.referencedata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * Reference Data Entity to configure Work order Types, Work Order Types like
 * Regular Hours, Over time hours, Double Hours
 *
 */
@Entity
@Table(name = ContractOrderType.TABLE_NAME)
public class ContractOrderType {
	public static final String TABLE_NAME = "ref_order_type";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "wrkordr_type_id", nullable = false, updatable = false)
	private String workOrderTypeID;

	@Column(name = "wrkordr_type_name", nullable = false, updatable = false)
	private String workOrderTypeName;

	@Column(name = "wrkordr_type_desc", nullable = true)
	private String workOrderTypeDesc;

	public ContractOrderType() {
		super();
	}

	public String getWorkOrderTypeID() {
		return workOrderTypeID;
	}

	public void setWorkOrderTypeID(String workOrderTypeID) {
		this.workOrderTypeID = workOrderTypeID;
	}

	public String getWorkOrderTypeName() {
		return workOrderTypeName;
	}

	public void setWorkOrderTypeName(String workOrderTypeName) {
		this.workOrderTypeName = workOrderTypeName;
	}

	public String getWorkOrderTypeDesc() {
		return workOrderTypeDesc;
	}

	public void setWorkOrderTypeDesc(String workOrderTypeDesc) {
		this.workOrderTypeDesc = workOrderTypeDesc;
	}

}
