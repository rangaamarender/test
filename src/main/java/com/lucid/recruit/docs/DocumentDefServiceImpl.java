/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs;

import java.time.LocalDate;
import java.util.Calendar;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import com.lucid.core.base.BaseServiceImpl;
import com.lucid.core.base.SContext;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.docs.entity.DocumentDef;
import com.lucid.recruit.docs.mapper.DocumentDefMapper;
import com.lucid.recruit.docs.repo.DocumentDefRepo;
import com.lucid.recruit.docs.vo.DocumentDefVO;
import jakarta.persistence.PersistenceException;

/**
 * @author sgutti
 * @date 22-Apr-2023 2:50:03 pm
 *
 */
@Component(value = DocumentDefServiceImpl.SERVICE_NAME)
public class DocumentDefServiceImpl extends BaseServiceImpl implements DocumentDefService {
  // --------------------------------------------------------------- Constants
  public static final String SERVICE_NAME = "documentDefService";
  public static final String ERROR_DDEF_0001 = "ERROR_DDEF_0001";
  public static final String ERROR_DDEF_0002 = "ERROR_DDEF_0002";
  public static final String ERROR_DDEF_0003 = "ERROR_DDEF_0003";
  public static final String ERROR_DDEF_0004 = "ERROR_DDEF_0004";
  public static final String ERROR_DDEF_0005 = "ERROR_DDEF_0005";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private DocumentDefRepo documentDefRepo;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>DocumentDefServiceImpl</code>
   */
  public DocumentDefServiceImpl() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @see com.lucid.recruit.docs.DocumentDefService# createDocumentDef(com.lucid.core.base.SContext,
   *      com.lucid.recruit.docs.DocumentDefVO)
   */
  @Override
  public DocumentDefVO createDocumentDef(SContext sContext, DocumentDefVO documentDefVO)
      throws ApplicationException {
    DocumentDefVO result = null;
    validateContext(sContext);
    Assert.notNull(documentDefVO, "documentDefVO cannot be null");
    try {
      DocumentDefMapper mapper = Mappers.getMapper(DocumentDefMapper.class);
      DocumentDef documentDef = mapper.toEntity(documentDefVO);
      documentDef.setCreatedBy(sContext.getUserID());
      documentDef.setCreatedDt(LocalDate.now());
      documentDefRepo.save(documentDef);
      result = mapper.toVO(documentDef);
    } catch (DataAccessException | PersistenceException e) {
      throw new ApplicationException(ERROR_DDEF_0001, e.getLocalizedMessage(), e);
    }
    return result;
  }

  /**
   * @see com.lucid.recruit.docs.DocumentDefService#updateDocumentDef(com.lucid.core.base.SContext,
   *      com.lucid.recruit.docs.vo.DocumentDefVO)
   */
  @Override
  public DocumentDefVO updateDocumentDef(SContext sContext, DocumentDefVO documentDefVO)
      throws ApplicationException {
    DocumentDefVO result = null;
    validateContext(sContext);
    Assert.notNull(documentDefVO, "documentDefVO cannot be null");
    try {
      DocumentDefMapper mapper = Mappers.getMapper(DocumentDefMapper.class);
      DocumentDef existingDocumentDef =
          documentDefRepo.findByInternalCode(documentDefVO.getDocumentInternalCode());
      if (existingDocumentDef == null) {
        throw new ApplicationException(ERROR_DDEF_0002,
            "unable to find the document with internal code "
                + documentDefVO.getDocumentInternalCode());
      }
      DocumentDef documentDef = mapper.toEntity(documentDefVO);
      documentDef.setDocumentDefID(existingDocumentDef.getDocumentDefID());
      documentDef.setUpdatedBy(sContext.getUserID());
      documentDef.setUpdatedDt(LocalDate.now());
      documentDefRepo.save(documentDef);
      //
      result = mapper.toVO(documentDef);
    } catch (DataAccessException | PersistenceException e) {
      throw new ApplicationException(ERROR_DDEF_0002, e.getLocalizedMessage(), e);
    }
    return result;
  }

  /**
   * @see com.lucid.recruit.docs.DocumentDefService#deleteDocumentDef(com.lucid.core.base.SContext,
   *      java.lang.String)
   */
  /**
   * @see com.lucid.recruit.docs.DocumentDefService#deleteDocumentDef(com.lucid.core.base.SContext,
   *      java.lang.String)
   */
  @Override
  public void deleteDocumentDef(SContext sContext, String documentInternalCode)
      throws ApplicationException {
    validateContext(sContext);
    try {
      DocumentDef existingDocumentDef = documentDefRepo.findByInternalCode(documentInternalCode);
      if (existingDocumentDef == null) {
        throw new ApplicationException(ERROR_DDEF_0003,
            "unable to find the document with internal code " + documentInternalCode);
      }
      existingDocumentDef.setStatus(3);
      existingDocumentDef.setUpdatedBy(sContext.getUserID());
      existingDocumentDef.setUpdatedDt(LocalDate.now());
      documentDefRepo.save(existingDocumentDef);

    } catch (DataAccessException | PersistenceException e) {
      throw new ApplicationException(ERROR_DDEF_0002, e.getLocalizedMessage(), e);
    }
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
