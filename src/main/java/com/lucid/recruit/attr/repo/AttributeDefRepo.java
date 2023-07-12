/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucid.recruit.attr.entity.AttributeDef;

/**
 * @author sgutti
 * @date 04-Feb-2023 5:21:15 pm
 */
public interface AttributeDefRepo extends JpaRepository<AttributeDef, String> {
  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
