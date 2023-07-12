/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.service;

import com.lucid.core.base.BaseService;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.attr.vo.AttributeGroupDefVO;


/**
 * 
 * @author chandu
 *
 */
public interface AttributeService extends BaseService {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * 
   * @param userID
   * @param attributeGroupDefVO
   * @throws ApplicationException
   */
  void createAttributeGroup(String userID, AttributeGroupDefVO attributeGroupDefVO) throws ApplicationException;
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
