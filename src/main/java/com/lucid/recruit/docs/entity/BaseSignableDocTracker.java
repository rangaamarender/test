/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs.entity;

import java.util.Date;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 01-May-2023 9:05:04 pm
 *
 */
@MappedSuperclass
public abstract class BaseSignableDocTracker extends BaseEntity {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -5111097976153223116L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "signed_dt", nullable = false)
  private Date signedDt;

  @Column(name = "first_name", nullable = false, length = 100)
  private String firstName;

  @Column(name = "list_name", nullable = false, length = 100)
  private String lastName;

  @Column(name = "initials_name", nullable = false, length = 25)
  private String intials;

  @Column(name = "signature", nullable = false)
  private byte[] signature;

  @Column(name = "status", nullable = false)
  private Integer status;

  @Column(name = "tracker_key", nullable = false, length = 100)
  private String trackerKey;

  @Column(name = "last_sent_dt", nullable = false, length = 100)
  private Date lastSentDt;

  @Column(name = "client_ipaddress", nullable = false, length = 100)
  private Date clientIpAddress;

  @Column(name = "count", nullable = false)
  private Integer count;

  @Column(name = "email", nullable = false, length = 200)
  private String emailID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseSignableDocTracker</code>
   */
  public BaseSignableDocTracker() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the signedDt.
   */
  public Date getSignedDt() {
    return signedDt;
  }

  /**
   * @param signedDt The signedDt to set.
   */
  public void setSignedDt(Date signedDt) {
    this.signedDt = signedDt;
  }

  /**
   * @return Returns the firstName.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName The firstName to set.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return Returns the lastName.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName The lastName to set.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return Returns the intials.
   */
  public String getIntials() {
    return intials;
  }

  /**
   * @param intials The intials to set.
   */
  public void setIntials(String intials) {
    this.intials = intials;
  }

  /**
   * @return Returns the signature.
   */
  public byte[] getSignature() {
    return signature;
  }

  /**
   * @param signature The signature to set.
   */
  public void setSignature(byte[] signature) {
    this.signature = signature;
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
   * @return Returns the trackerKey.
   */
  public String getTrackerKey() {
    return trackerKey;
  }

  /**
   * @param trackerKey The trackerKey to set.
   */
  public void setTrackerKey(String trackerKey) {
    this.trackerKey = trackerKey;
  }

  /**
   * @return Returns the lastSentDt.
   */
  public Date getLastSentDt() {
    return lastSentDt;
  }

  /**
   * @param lastSentDt The lastSentDt to set.
   */
  public void setLastSentDt(Date lastSentDt) {
    this.lastSentDt = lastSentDt;
  }

  /**
   * @return Returns the clientIpAddress.
   */
  public Date getClientIpAddress() {
    return clientIpAddress;
  }

  /**
   * @param clientIpAddress The clientIpAddress to set.
   */
  public void setClientIpAddress(Date clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  /**
   * @return Returns the count.
   */
  public Integer getCount() {
    return count;
  }

  /**
   * @param count The count to set.
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * @return Returns the emailID.
   */
  public String getEmailID() {
    return emailID;
  }

  /**
   * @param emailID The emailID to set.
   */
  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
