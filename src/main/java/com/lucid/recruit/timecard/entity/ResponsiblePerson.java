/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import java.util.Date;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * A collection of information about the person who is the submitter/approver of the associated
 * document.
 * 
 * @author sgutti
 * @date 18-Feb-2023 10:04:48 pm
 *
 */
@Entity
@Table(name = ResponsiblePerson.TABLE_NAME)
public class ResponsiblePerson extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -7741329262340856608L;
  public static final String TABLE_NAME = "tc_responsible_prsn";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "responsible_prsn_id", nullable = false, length = 75)
  private String responsiblePersonID;

  @Column(name = "code", nullable = true, length = 25)
  private String code;

  // Contains information identifying the person who has the role of submitter/approver.
  @Column(name = "specified_person_id", nullable = false)
  private Long specifiedPersonID;

  // The date the related document, report, or related entity was communicated to a receiving or
  // approving entity.
  @Column(name = "associated_dtm", nullable = true)
  private Date associatedDtm;

  @Column(name = "comment", nullable = true, length = 400)
  private String comment;

  @Column(name = "associated_id", nullable = false)
  private Long associatedID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ResponsiblePerson</code>
   */
  public ResponsiblePerson() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
