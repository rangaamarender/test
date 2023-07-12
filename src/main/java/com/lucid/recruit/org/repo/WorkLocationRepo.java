/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucid.recruit.org.entity.WorkLocation;


/**
 * @author sgutti
 * @date 16-Mar-2023 6:15:16 am
 *
 */
public interface WorkLocationRepo extends JpaRepository<WorkLocation, String> {
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
