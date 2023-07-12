/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs;

import com.lucid.core.base.BaseService;
import com.lucid.core.base.SContext;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.docs.vo.DocumentDefVO;

/**
 * @author sgutti
 * @date 22-Apr-2023 2:49:14 pm
 *
 */
public interface DocumentDefService extends BaseService {
  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @param sContext
   * @param documentDefVO
   * @throws ApplicationException
   */
  public DocumentDefVO createDocumentDef(SContext sContext, DocumentDefVO documentDefVO)
      throws ApplicationException;

  /**
   * @param sContext
   * @param documentDefVO
   * @throws ApplicationException
   */
  public DocumentDefVO updateDocumentDef(SContext sContext, DocumentDefVO documentDefVO)
      throws ApplicationException;


  /**
   * @param sContext
   * @param documentInternalCode
   * @throws ApplicationException
   */
  public void deleteDocumentDef(SContext sContext, String documentInternalCode)
      throws ApplicationException;
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
