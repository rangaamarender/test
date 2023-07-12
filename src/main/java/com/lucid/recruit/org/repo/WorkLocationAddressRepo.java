/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucid.recruit.org.entity.WorkLocationAddress;


/**
 * @author sgutti
 * @date 16-Mar-2023 6:16:41 am
 *
 */
public interface WorkLocationAddressRepo extends JpaRepository<WorkLocationAddress, String> {
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
