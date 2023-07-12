/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * @author sgutti
 * @date 11-Feb-2023 11:44:29 am
 */
@Embeddable
public class WorkAssignmentSource {
  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "was_source_code", nullable = true, length = 25)
  private String sourceCode;
  @Column(name = "was_home_country", nullable = true, length = 50)
  private String homeCountry;
  @Column(name = "was_host_country", nullable = true, length = 50)
  private String hostCountry;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>WorkAssignmentSource</code>
   */
  public WorkAssignmentSource() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
