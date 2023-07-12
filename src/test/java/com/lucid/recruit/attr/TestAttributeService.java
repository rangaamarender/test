/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.lucid.base.test.BaseTransactionTest;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.attr.service.AttributeService;
import com.lucid.recruit.attr.vo.AttributeGroupDefVO;


/**
 * 
 * @author chand
 *
 */
public class TestAttributeService extends BaseTransactionTest {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private AttributeService attributeService;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>TestAttributeService</code>
   */
  public TestAttributeService() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  @Test
  public void testCreateAttributeGroup() throws ApplicationException {
    AttributeGroupDefVO bean = new AttributeGroupDefVO();
    bean.setDescription("Group for address");
    bean.setDisplayOrder(Integer.valueOf(1));
    bean.setInternalCode("USHomeADDR01");
    bean.setName("Home Address");
    bean.setDisplayOrder(1);
    bean.setScope(0);
    bean.setStatus(1);
    attributeService.createAttributeGroup("system", bean);
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
