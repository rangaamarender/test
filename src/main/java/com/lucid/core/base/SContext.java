/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.base;

import java.io.Serializable;

/**
 * @author sgutti
 * @date 22-Apr-2023 2:50:48 pm
 *
 */
public class SContext implements Serializable {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 9177024158404249705L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String userID;
  private String apiKey;
  private String accessToken;
  private String callerID;
  private String organizationID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>SContext</code>
   */
  public SContext() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the userID.
   */
  public String getUserID() {
    return userID;
  }

  /**
   * @param userID The userID to set.
   */
  public void setUserID(String userID) {
    this.userID = userID;
  }

  /**
   * @return Returns the apiKey.
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * @param apiKey The apiKey to set.
   */
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * @return Returns the accessToken.
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * @param accessToken The accessToken to set.
   */
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * @return Returns the callerID.
   */
  public String getCallerID() {
    return callerID;
  }

  /**
   * @param callerID The callerID to set.
   */
  public void setCallerID(String callerID) {
    this.callerID = callerID;
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
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
