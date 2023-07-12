/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.entity;

import java.util.Date;
import com.lucid.core.constants.EnumStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;

/**
 * @author ecrv-scredit
 * @date Sep 13, 2020 8:08:54 PM
 */
@MappedSuperclass
public abstract class BaseSignatory extends AuditableEntity {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -134423836094536066L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "first_name", nullable = false, length = 100)
  private String firstName;

  @Column(name = "last_name", nullable = false, length = 100)
  private String lastName;

  @Column(name = "signed_dt", nullable = false)
  private Date signedDate;

  @Lob
  @Column(name = "signature", nullable = false)
  private byte[] signature;

  @Column(name = "client_ipaddress", nullable = false, length = 20)
  private String clientIPAddress;

  @Column(name = "phone_number", nullable = false, length = 20)
  private String phoneNumber;

  @Column(name = "email", nullable = true, length = 200)
  private String email;

  @Column(name = "status", nullable = false)
  private Integer status = EnumStatus.ACTIVE;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseSignatory</code>
   */
  public BaseSignatory() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

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
   * @return Returns the signedDate.
   */
  public Date getSignedDate() {
    return signedDate;
  }

  /**
   * @param signedDate The signedDate to set.
   */
  public void setSignedDate(Date signedDate) {
    this.signedDate = signedDate;
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
   * @return Returns the clientIPAddress.
   */
  public String getClientIPAddress() {
    return clientIPAddress;
  }

  /**
   * @param clientIPAddress The clientIPAddress to set.
   */
  public void setClientIPAddress(String clientIPAddress) {
    this.clientIPAddress = clientIPAddress;
  }

  /**
   * @return Returns the phoneNumber.
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @param phoneNumber The phoneNumber to set.
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * @return Returns the email.
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email The email to set.
   */
  public void setEmail(String email) {
    this.email = email;
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
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
