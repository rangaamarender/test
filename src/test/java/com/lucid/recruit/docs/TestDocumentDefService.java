/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.lucid.base.test.BaseTransactionTest;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.docs.constants.EnumDocumentType;
import com.lucid.recruit.docs.vo.DocumentDefVO;

/**
 * @author sgutti
 * @date 22-Apr-2023 4:51:15 pm
 *
 */
public class TestDocumentDefService extends BaseTransactionTest {
  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private DocumentDefService documentDefService;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>TestDocumentDefService</code>
   */
  public TestDocumentDefService() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @throws ApplicationException
   */
  @Test
  public void testCreateDocumentDef() throws ApplicationException {
    DocumentDefVO documentDefVO = new DocumentDefVO();
    documentDefVO.setDocumentInternalCode(FAKER.letterify("12????33", true));
    documentDefVO.setDocumentName(FAKER.funnyName().name());
    documentDefVO.setDocumentAccessability(1);
    documentDefVO.setDocumentType(EnumDocumentType.SIGNABLE);
    documentDefVO.setDocumentScope(1);
    documentDefVO.setStatus(1);
    documentDefVO.setRelatedType("EMPLOYEE");
    DocumentDefVO result = documentDefService.createDocumentDef(getContext(), documentDefVO);
    Assertions.assertNotNull(result, "unable to create the document def");
  }

  /**
   * @throws ApplicationException
   */
  @Test
  public void testCreateDocumentDefForW2CEmployee() throws ApplicationException {
    DocumentDefVO documentDefVO = new DocumentDefVO();
    documentDefVO.setDocumentInternalCode(FAKER.letterify("22????33", true));
    documentDefVO.setDocumentName(FAKER.funnyName().name());
    documentDefVO.setDocumentAccessability(1);
    documentDefVO.setDocumentType(EnumDocumentType.MONITORABLE);
    documentDefVO.setDocumentScope(1);
    documentDefVO.setStatus(1);
    documentDefVO.setRelatedType("EMPLOYEE");
    documentDefVO.setRelatedSubType("W2C");
    DocumentDefVO result = documentDefService.createDocumentDef(getContext(), documentDefVO);
    Assertions.assertNotNull(result, "unable to create the document def");
  }


  /**
   * @throws ApplicationException
   */
  @Test
  public void testDeleteDocumentDef() throws ApplicationException {
    String documentInternalCode = "12FPFY33";
    documentDefService.deleteDocumentDef(getContext(), documentInternalCode);
    Assertions.assertTrue(true);
  }

  /**
   * test if the internal code is NOT existing in the system
   */
  @Test
  public void testDeleteDocumentDefFailed() {
    String documentInternalCode = "12FPFY13";
    try {
      documentDefService.deleteDocumentDef(getContext(), documentInternalCode);
      Assertions.assertTrue(false);
    } catch (ApplicationException e) {
      Assertions.assertTrue(true);
    }
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
