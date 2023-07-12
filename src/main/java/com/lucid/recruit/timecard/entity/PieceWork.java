/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import java.util.List;
import com.lucid.core.embeddable.Quantity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 * Contains information relating to renumeration based on count of items produced or serviced.
 * 
 * @author sgutti
 * @date 25-Feb-2023 10:12:23 am
 *
 */
//@Entity
@Table(name = PieceWork.TABLE_NAME)
public class PieceWork extends BaseExpAllw {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 4094170079168917324L;
  public static final String TABLE_NAME = "tci_piece_wrk";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "piece_wrk_id", nullable = false, length = 75)
  private String pieceWorkID;

  @Embedded
  private Quantity quantity;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "pieceWork")
  private List<PieceWorkPayRate> payRates;



  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>PieceWork</code>
   */
  public PieceWork() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
