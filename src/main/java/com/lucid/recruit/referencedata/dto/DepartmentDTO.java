package com.lucid.recruit.referencedata.dto;

import java.util.List;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class DepartmentDTO {
	@NotNull
	@NotEmpty
	private String deptID;
	@Nullable
	private String deptName;
	@Nullable
	private String deptDesc;
	@Nullable
	private List<JobDTO> job;

	public DepartmentDTO(@NotNull @NotEmpty String deptID, String deptName, String deptDesc, List<JobDTO> job) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		this.deptDesc = deptDesc;
		this.job = job;
	}

	public DepartmentDTO(@NotNull @NotEmpty String deptID) {
		super();
		this.deptID = deptID;
	}

	public DepartmentDTO() {
		super();
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

	public List<JobDTO> getJob() {
		return job;
	}

	public void setJob(List<JobDTO> job) {
		this.job = job;
	}

}
