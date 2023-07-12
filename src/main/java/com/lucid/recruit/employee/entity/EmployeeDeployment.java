/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.lucid.core.entity.BaseEntity;
import com.lucid.recruit.org.entity.WorkLocation;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Defines the source of the worker and related assignment. For example, the source might be
 * expatriate with the home country in Germany but the person is working in Belgium.
 * 
 * Contains a collection of information about the work of a human resource within an employment or
 * work context. Deployment details include information about a resource's job, position, work
 * schedule, assignment entry reason, as well as information identifying the organization and/or
 * organizational sub-units associated with the deployment.
 * 
 * @author sgutti
 * @date 09-Feb-2023 10:50:03 pm
 */
@Entity
@Table(name = EmployeeDeployment.TABLE_NAME)
public class EmployeeDeployment extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -7534904365181901394L;
  public static final String TABLE_NAME = "e_emp_deployment";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "emp_deployment_id", nullable = false, length = 75)
  private String employeeDeploymentID;

  @Embedded
  private WorkAssignmentSource workAssignmentSource;

  @Column(name = "work_location_id", nullable = false, length = 75)
  private String workLocationID;


  // Describes the relationship between the employer and worker, e.g.
  // Employee, Vendor Employee.
  @Column(name = "res_relationship_code", nullable = false)
  private String resourceRelationshipCode;

  // job
  @Column(name = "job_id", nullable = false, length = 75)
  private String jobID;

  @Column(name = "position_id", nullable = false, length = 75)
  private String positionID;

  // The hours a person is scheduled to work.
  @Column(name = "schedule_hours", nullable = true)
  private BigDecimal scheduleHours;

  // The schedule a person is planned to work.
  @Column(name = "work_schedule_id", nullable = true, length = 75)
  private String workScheduleID;

  @Column(name = "assignment_reason_code", nullable = true, length = 25)
  private String assignmentReasonCode;

  @Column(name = "effective_from_dt", nullable = true)
  private Date effectiveFromDt;

  @Column(name = "effective_to_dt", nullable = true)
  private Date effectiveToDt;

  @Column(name = "emp_reporting_code", nullable = true)
  private String employeeReportingCode;

  // The country the wage hour laws pertain to
  @Column(name = "wage_hour_law_coverage_cntrycode", nullable = true, length = 25)
  private String wageHourLawCoverageCountryCode;

  // This determines if a person is covered by wage hour laws. In the US, a
  // person would be considered non-exempt if the indicator is true (they are
  // covered under the law).
  @Column(name = "wage_hour_law_coverage_ind", nullable = true)
  private Boolean wageHourLawCoverageIndicator;

  // Indicates if the person is part of a labor bargaining unit, such as a union
  @Column(name = "labor_bargaining_unit_ind", nullable = true)
  private Boolean laborBargainingUnitIndicator;


  // Code of the labor bargaining unit; e.g. Unison.
  @Column(name = "labor_bargaining_unit_code", nullable = true, length = 25)
  private String laborBargainingUnitCode;


  // The person's id within the labor bargaining unit.
  @Column(name = "labor_bargaining_unit_memberId", nullable = true, length = 25)
  private String laborBargainingUnitMemberId;

  // Indicates if the person is a new hire.
  @Column(name = "new_hire_probationary_ind", nullable = true)
  private Boolean newHireProbationaryIndicator;

  // The length of the probation for the new hire; e.g. Hire is on probation for three months from
  // start date.
  @Column(name = "new_hire_probationary_duration", nullable = true)
  private BigDecimal newHireProbationaryDuration;


  // The organization the person is working for.
  @Column(name = "org_id", nullable = false, length = 75)
  private String organizationID;


  @Column(name = "status_code", nullable = false, length = 15)
  private String statusCode;

  // The status effective date of this deployment.
  @Column(name = "status_effective_dt", nullable = true)
  private Date statusEffectiveDate;


  // The frequency at which an earning is 'earned'. E.g. how often the worker is paid the associated
  // earning.
  @Column(name = "interval_code", nullable = false, length = 25)
  private String intervalCode;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "work_location_id", nullable = false, insertable = false, updatable = false)
  private WorkLocation workLocation;

  @Column(name = "employee_id", nullable = false, length = 75)
  private String employeeID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "employee_id", nullable = false, insertable = false, updatable = false)
  private Employee employee;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeDeployment</code>
   */
  public EmployeeDeployment() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
