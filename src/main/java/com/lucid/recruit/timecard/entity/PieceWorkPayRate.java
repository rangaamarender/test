/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/**
 * @author sgutti
 * @date 25-Feb-2023 2:10:05 pm
 *
 */
//@Entity
@Table(name = PieceWorkPayRate.TABLE_NAME)
public class PieceWorkPayRate extends BasePayRate {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -5328443573597271732L;
  public static final String TABLE_NAME = "tci_piece_wrk_payrate";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "piece_wrk_payrate_id", nullable = false, length = 75)
  private String pieceWorkPayRateID;


  @Column(name = "piece_wrk_id", nullable = false, length = 75)
  private String pieceWorkID;


  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "piece_wrk_id", nullable = false, insertable = false, updatable = false)
  private PieceWork pieceWork;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>PieceWorkPayRate</code>
   */
  public PieceWorkPayRate() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
