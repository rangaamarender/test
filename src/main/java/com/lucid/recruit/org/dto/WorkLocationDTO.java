/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.dto;

import com.lucid.core.dto.BaseDTO;
import com.lucid.core.vo.BaseVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


/**
 * @author sgutti
 * @date 16-Mar-2023 5:36:59 am
 *
 */
public class WorkLocationDTO extends BaseDTO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 7429605904345277898L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String workLocationID;
  private String name;

  private String code;

  // A code classifying the work location type e.g., Distribution center,
  // Headquarters, Plant, etc.
  private String typeCode;

  private Boolean virtualWorkerIndicator;

  private Boolean fieldRemoteWorkerIndicator;

  private String description;

  @NotNull
  @Valid
  private WorkLocationAddressDTO workLocationAddress;
  // ------------------------------------------------------------ Constructors

  /**
   * Create a new <code>WorkLocationVO</code>
   */
  public WorkLocationDTO() {
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
  public WorkLocationAddressDTO getWorkLocationAddress() {
    return workLocationAddress;
  }


  /**
   * @param workLocationAddress The workLocationAddress to set.
   */
  public void setWorkLocationAddress(WorkLocationAddressDTO workLocationAddress) {
    this.workLocationAddress = workLocationAddress;
  }


  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
