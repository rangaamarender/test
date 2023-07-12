/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.entity;

import com.lucid.recruit.docs.entity.BaseDocument;
import jakarta.persistence.*;

/**
 * @author sgutti
 * @date 26-Jan-2023 12:57:54 am
 */
@Entity
@Table(name = OrganizationDocument.TABLE_NAME)
public class OrganizationDocument extends BaseDocument {

    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = 8419402802337278054L;
    public static final String TABLE_NAME = "o_org_doc";
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Organization_doc_id", nullable = false, length = 75)
    private String organizationDocID;

    @Column(name = "Organization_id", nullable = false, length = 75)
    private String organizationID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id", nullable = false, updatable = false, insertable = false)
    private Organization organization;


    // ------------------------------------------------------------ Constructors

    /**
     * Create a new <code>ContractDocument</code>
     */
    public OrganizationDocument() {
        super();
    }

    public String getOrganizationDocID() {
        return organizationDocID;
    }

    public void setOrganizationDocID(String organizationDocID) {
        this.organizationDocID = organizationDocID;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

   /* @Override
    public String toString() {
        return "OrganizationDocument [organizationDocID=" + organizationDocID + ", organizationID=" + organizationID + ", organization=" + organization + "]";
    }*/

    // ---------------------------------------------------------- Public Methods
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes

}
