/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.entity;

import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * The location of the workers assignment.
 * 
 * @author sgutti
 * @date 11-Feb-2023 11:50:10 am
 */
@Entity
@Table(name = WorkLocation.TABLE_NAME)
public class WorkLocation extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 1123481088014750203L;
  public static final String TABLE_NAME = "w_work_location";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "work_location_id", nullable = false, length = 75)
  private String workLocationID;

  @Column(name = "name", nullable = true, length = 50)
  private String name;

  @Column(name = "code", nullable = true, length = 25)
  private String code;

  // A code classifying the work location type e.g., Distribution center,
  // Headquarters, Plant, etc.
  @Column(name = "type_code", nullable = true, length = 25)
  private String typeCode;

  @Column(name = "virtual_worker_ind", nullable = true)
  private Boolean virtualWorkerIndicator;

  @Column(name = "field_remote_worker_ind", nullable = true)
  private Boolean fieldRemoteWorkerIndicator;

  @Column(name = "description", nullable = true, length = 200)
  private String description;

  @OneToOne(fetch = FetchType.EAGER)
  private WorkLocationAddress workLocationAddress;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>WorkLocation</code>
   */
  public WorkLocation() {
    super();
  }
  // ---------------------------------------------------------- Public Methods


  /**
   * @return Returns the workLocationID.
   */
  public String getWorkLocationID() {
    return workLocationID;
  }


  /**
   * @param workLocationID The workLocationID to set.
   */
  public void setWorkLocationID(String workLocationID) {
    this.workLocationID = workLocationID;
  }


  /**
   * @return Returns the name.
   */
  public String getName() {
    return name;
  }


  /**
   * @param name The name to set.
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * @return Returns the code.
   */
  public String getCode() {
    return code;
  }


  /**
   * @param code The code to set.
   */
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * @return Returns the typeCode.
   */
  public String getTypeCode() {
    return typeCode;
  }


  /**
   * @param typeCode The typeCode to set.
   */
  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  /**
   * @return Returns the virtualWorkerIndicator.
   */
  public Boolean getVirtualWorkerIndicator() {
    return virtualWorkerIndicator;
  }


  /**
   * @param virtualWorkerIndicator The virtualWorkerIndicator to set.
   */
  public void setVirtualWorkerIndicator(Boolean virtualWorkerIndicator) {
    this.virtualWorkerIndicator = virtualWorkerIndicator;
  }


  /**
   * @return Returns the fieldRemoteWorkerIndicator.
   */
  public Boolean getFieldRemoteWorkerIndicator() {
    return fieldRemoteWorkerIndicator;
  }


  /**
   * @param fieldRemoteWorkerIndicator The fieldRemoteWorkerIndicator to set.
   */
  public void setFieldRemoteWorkerIndicator(Boolean fieldRemoteWorkerIndicator) {
    this.fieldRemoteWorkerIndicator = fieldRemoteWorkerIndicator;
  }


  /**
   * @return Returns the description.
   */
  public String getDescription() {
    return description;
  }


  /**
   * @param description The description to set.
   */
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * @return Returns the workLocationAddress.
   */
  public WorkLocationAddress getWorkLocationAddress() {
    return workLocationAddress;
  }


  /**
   * @param workLocationAddress The workLocationAddress to set.
   */
  public void setWorkLocationAddress(WorkLocationAddress workLocationAddress) {
    this.workLocationAddress = workLocationAddress;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
