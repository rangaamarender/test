/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.lucid.recruit.docs.entity.DocumentDef;

/**
 * @author sgutti
 * @date 22-Apr-2023 4:29:08 pm
 *
 */
public interface DocumentDefRepo extends JpaRepository<DocumentDef, String> {
  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @param documentInternalCode
   * @return
   */
  @Query(" from DocumentDef d where d.documentInternalCode=:documentInternalCode")
  DocumentDef findByInternalCode(@Param("documentInternalCode") String documentInternalCode);
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
