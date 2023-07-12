/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.dto;

import com.lucid.core.vo.BaseVO;

/**
 * @author ecrv-scredit
 * @date Sep 26, 2020 5:57:36 PM
 */
public class BasePersonDTO extends BaseVO {
    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = -696124082061760134L;
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    private String salutation;
    private String firstName;
    private String lastName;
    private String middleName;
    // contact details
    private String phoneNumber;
    private String mobileNumber;
    private String faxNumber;
    private String email;
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>BasePersonVO</code>
     */
    public BasePersonDTO() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    /**
     * @return Returns the salutation.
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * @param salutation
     *            The salutation to set.
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
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
     * @return Returns the middleName.
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName
     *            The middleName to set.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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
     * @return Returns the mobileNumber.
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @param mobileNumber
     *            The mobileNumber to set.
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * @return Returns the faxNumber.
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * @param faxNumber
     *            The faxNumber to set.
     */
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
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
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
