/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.common.entity;

import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.org.entity.Organization;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 04-Feb-2023 9:51:02 pm
 */
@Entity
@Table(name = EmailTemplate.TABLE_NAME)
public class EmailTemplate extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -6779218829188132502L;
  public static final String TABLE_NAME = "t_email_template";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "email_tempalte_code", nullable = false, length = 75)
  private String emailTemplateCode;

  @Column(name = "org_id", nullable = false, length = 50)
  private String organizationID;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "org_id", insertable = false, nullable = false, updatable = false)
  private Organization organization;


  @Column(name = "name", nullable = false, length = 50)
  private String name;

  @Column(name = "subject", nullable = false, length = 400)
  private String subject;

  @Lob
  @Column(name = "message", nullable = false)
  private String message;

  @Column(name = "status", nullable = false)
  private Integer status;

  // associated entity like EMPLOYEE,CONTRACT etc
  @Column(name = "related_type", nullable = true, length = 25)
  private String relatedType;

  // associated relatedSubType for an relatedType like W2C,C2C,1099
  @Column(name = "related_sub_type", nullable = true, length = 25)
  private String relatedSubType;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmailTemplate</code>
   */
  public EmailTemplate() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the emailTemplateCode.
   */
  public String getEmailTemplateCode() {
    return emailTemplateCode;
  }

  /**
   * @param emailTemplateCode The emailTemplateCode to set.
   */
  public void setEmailTemplateCode(String emailTemplateCode) {
    this.emailTemplateCode = emailTemplateCode;
  }

  /**
   * @return Returns the organizationID.
   */
  public String getOrganizationID() {
    return organizationID;
  }

  /**
   * @param organizationID The organizationID to set.
   */
  public void setOrganizationID(String organizationID) {
    this.organizationID = organizationID;
  }

  /**
   * @return Returns the organization.
   */
  public Organization getOrganization() {
    return organization;
  }

  /**
   * @param organization The organization to set.
   */
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  /**
   * @return Returns the name.
   */
  public String getName() {
    return name;
  }

  /**
   * @param name The name to set.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return Returns the subject.
   */
  public String getSubject() {
    return subject;
  }

  /**
   * @param subject The subject to set.
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * @return Returns the message.
   */
  public String getMessage() {
    return message;
  }

  /**
   * @param message The message to set.
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * @return Returns the status.
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * @param status The status to set.
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * @return Returns the relatedType.
   */
  public String getRelatedType() {
    return relatedType;
  }

  /**
   * @param relatedType The relatedType to set.
   */
  public void setRelatedType(String relatedType) {
    this.relatedType = relatedType;
  }

  /**
   * @return Returns the relatedSubType.
   */
  public String getRelatedSubType() {
    return relatedSubType;
  }

  /**
   * @param relatedSubType The relatedSubType to set.
   */
  public void setRelatedSubType(String relatedSubType) {
    this.relatedSubType = relatedSubType;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
