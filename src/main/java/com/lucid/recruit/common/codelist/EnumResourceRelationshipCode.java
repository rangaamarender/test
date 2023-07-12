/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.common.codelist;


/**
 * 
 * Resource relationship code list.
 * 
 * 
 * @author sgutti
 * @date 18-Mar-2023 10:48:19 am
 *
 */
public class EnumResourceRelationshipCode {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // A paid position with all related benefits.
  public static final String EMPLOYEE = "Employee";

  // A worker hired by a third party such as a consulting agency.
  public static final String VENDOR_EMPLOYEE = "VendorEmployee";

  // A worker with a contract signed directly by the employer.
  public static final String INDEPENDENT_CONTRACTOR = "IndependentContractor";

  // An unpaid position.
  public static final String VOLUNTEER = "Volunteer";

  // A paid or voluntary position with an organization for someone who is learning a profession and
  // industry.
  public static final String INTERNSHIP = "Internship";

  // An unpaid shadowing of a respected industry professional during which the extern will observe
  // daily duties.
  public static final String EXTERNSHIP = "Externship";

  // A kind of job training that involves following and studying a master of the trade on the job
  // instead of in school.
  public static final String APRENTICESHIP = "Apprenticeship";

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EnumResourceRelationshipCode</code>
   */
  public EnumResourceRelationshipCode() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
