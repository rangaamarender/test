/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.service;

import java.time.LocalDate;
import java.util.Calendar;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lucid.core.base.BaseServiceImpl;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.attr.entity.AttributeGroupDef;
import com.lucid.recruit.attr.mapper.AttributeGroupDefMapper;
import com.lucid.recruit.attr.repo.AttributeGroupDefRepo;
import com.lucid.recruit.attr.vo.AttributeGroupDefVO;


/**
 * 
 * @author chandu
 *
 */
@Component(AttributeServiceImpl.SERVICE_NAME)
public class AttributeServiceImpl extends BaseServiceImpl implements AttributeService {

  // --------------------------------------------------------------- Constants
  public static final String SERVICE_NAME = "attributeServiceImpl";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private AttributeGroupDefRepo attributeGroupRepo;

  
  // ------------------------------------------------------------ Constructors

  /**
   * Create a new <code>AttributeServiceImpl</code>
   */
  public AttributeServiceImpl() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  @Override
  @Transactional
public void createAttributeGroup(String userID, AttributeGroupDefVO attributeGroupDefVO) throws ApplicationException {
	 // Create the Employee
    AttributeGroupDefMapper mapper = Mappers.getMapper(AttributeGroupDefMapper.class);
    AttributeGroupDef attributeGroupDef = mapper.toEntity(attributeGroupDefVO);
    attributeGroupDef.setCreatedBy(userID);
    attributeGroupDef.setCreatedDt(LocalDate.now());
    System.out.println("Inside service ");
    attributeGroupRepo.save(attributeGroupDef);
}

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
