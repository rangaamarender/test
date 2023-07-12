/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.vo;

import java.util.Date;
import com.lucid.core.constants.EnumStatus;

/**
 * @author ecrv-scredit
 * @date Sep 13, 2020 8:11:16 PM
 */
public abstract class BaseSignatoryVO extends BaseVO {
    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = 5945616852595200216L;
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    private Long signatoryID;
    private String firstName;
    private String lastName;
    private Date signedDate;
    private byte[] signature;
    private String clientIPAddress = "NA";
    private String phoneNumber;
    private String email;
    private Integer status = EnumStatus.ACTIVE;
    private String inputSignature;
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>BaseSignatoryVO</code>
     */
    public BaseSignatoryVO() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    /**
     * @return Returns the signatoryID.
     */
    public Long getSignatoryID() {
        return signatoryID;
    }

    /**
     * @param signatoryID
     *            The signatoryID to set.
     */
    public void setSignatoryID(Long signatoryID) {
        this.signatoryID = signatoryID;
    }

    /**
     * @return Returns the firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            The firstName to set.
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
     * @param lastName
     *            The lastName to set.
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
     * @param signedDate
     *            The signedDate to set.
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
     * @param signature
     *            The signature to set.
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
     * @param clientIPAddress
     *            The clientIPAddress to set.
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
     * @param phoneNumber
     *            The phoneNumber to set.
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
     * @param email
     *            The email to set.
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
     * @param status
     *            The status to set.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return Returns the inputSignature.
     */
    public String getInputSignature() {
        return inputSignature;
    }

    /**
     * @param inputSignature
     *            The inputSignature to set.
     */
    public void setInputSignature(String inputSignature) {
        this.inputSignature = inputSignature;
    }
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
