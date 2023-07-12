package com.lucid.recruit.referencedata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Department Reference data
 * 
 * @author chandu
 *
 */
@Entity
@Table(name = Department.TABLE_NAME)
public class Department {
	public static final String TABLE_NAME = "ref_department";
	// Class Variables
	// Department Unique Integration ID UUID value, will be used for any
	// integrations
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "dept_id", nullable = false)
	private String deptID;

	@Column(name = "dept_name", nullable = false)
	private String deptName;

	@Column(name = "dept_desc", nullable = true)
	private String deptDesc;

	public Department() {
		super();
	}

	public Department(String deptID, String deptName, String deptDesc) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		this.deptDesc = deptDesc;
	}

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
}
