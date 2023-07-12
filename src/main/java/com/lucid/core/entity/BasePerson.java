/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date Dec 22, 2014 11:48:54 PM
 */
@MappedSuperclass
public class BasePerson extends AuditableEntity {
    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = -6364327686551244813L;
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
     * Create a new <code>Person</code>
     */
    public BasePerson() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    /**
     * @return Returns the salutation.
     */
    @Column(name = "SALUTATION", nullable = true, length = 15)
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
    @Column(name = "FIRST_NAME", nullable = false, length = 200)
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            The firstName to set.
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Returns the lastName.
     */
    @Column(name = "LAST_NAME", nullable = false, length = 200)
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            The lastName to set.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Returns the middleName.
     */
    @Column(name = "MIDDLE_NAME", nullable = true, length = 200)
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName
     *            The middleName to set.
     */
    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return Returns the email.
     */
    @Column(name = "EMAIL", nullable = true, length = 200)
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
     * @return Returns the phoneNumber.
     */
    @Column(name = "PHONE_NUM", nullable = true, length = 20)
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
    @Column(name = "MOBILE_NUM", nullable = true, length = 20)
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
    @Column(name = "FAX_NUM", nullable = true, length = 20)
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
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
