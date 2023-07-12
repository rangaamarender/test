/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.audit.entity;

import java.util.Date;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Audit logs are the centralized stream of all user activity within a team. Part of the security
 * and compliance program of any large enterprise is designed to control and monitor the access of
 * information within the organization. This drives the need for enterprise buyers to ask for a
 * detailed audit trail of all activity that happens within their account. An audit trail can be
 * used to prevent suspicious activity when it starts (if actively monitored), or to play back
 * account activity during an incident review.
 * 
 * @author sgutti
 * @date 04-Feb-2023 9:11:03 pm
 */
@Entity
@Table(name = AuditLog.TABLE_NAME)
public class AuditLog extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -634330865259823917L;
  public static final String TABLE_NAME = "a_audit_log";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "audit_log_id", nullable = false, length = 75)
  private String auditLogID;

  // Actor - The username, uuid, API token name of the account taking the
  // action.
  @Column(name = "actor", nullable = false, length = 200)
  private String actor;

  // Group - The group (aka organization, team, account) that the actor is a
  // member of (needed to show admins the full history of their group).
  @Column(name = "department", nullable = false, length = 200)
  private String department;

  // Where - IP address, device ID, country.
  @Column(name = "location", nullable = false, length = 200)
  private String location;

  // When - The NTP synced server time when the event happened.
  @Column(name = "occured_dt", nullable = false)
  private Date occuredDt;

  // Target - the object or underlying resource that is being changed (the
  // noun) as well as the fields that include a key value for the new state of
  // the target.
  @Column(name = "target", nullable = false, length = 200)
  private String target;

  // Action - the way in which the object was changed (the verb).
  @Column(name = "action", nullable = false, length = 200)
  private String action;

  // Action Type - the corresponding C``R``U``D category.
  @Column(name = "action_type", nullable = false, length = 200)
  private String actionType;

  // Event Name - Common name for the event that can be used to filter down to
  // similar events.
  @Column(name = "event_name", nullable = false, length = 200)
  private String eventName;

  // Description - A human readable description of the action taken, sometimes
  // includes links to other pages within the application.
  @Column(name = "description", nullable = false, length = 1000)
  private String description;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AuditLog</code>
   */
  public AuditLog() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the auditLogID.
   */
  public String getAuditLogID() {
    return auditLogID;
  }

  /**
   * @param auditLogID The auditLogID to set.
   */
  public void setAuditLogID(String auditLogID) {
    this.auditLogID = auditLogID;
  }

  /**
   * @return Returns the actor.
   */
  public String getActor() {
    return actor;
  }

  /**
   * @param actor The actor to set.
   */
  public void setActor(String actor) {
    this.actor = actor;
  }

  /**
   * @return Returns the department.
   */
  public String getDepartment() {
    return department;
  }

  /**
   * @param department The department to set.
   */
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   * @return Returns the location.
   */
  public String getLocation() {
    return location;
  }

  /**
   * @param location The location to set.
   */
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * @return Returns the occuredDt.
   */
  public Date getOccuredDt() {
    return occuredDt;
  }

  /**
   * @param occuredDt The occuredDt to set.
   */
  public void setOccuredDt(Date occuredDt) {
    this.occuredDt = occuredDt;
  }

  /**
   * @return Returns the target.
   */
  public String getTarget() {
    return target;
  }

  /**
   * @param target The target to set.
   */
  public void setTarget(String target) {
    this.target = target;
  }

  /**
   * @return Returns the action.
   */
  public String getAction() {
    return action;
  }

  /**
   * @param action The action to set.
   */
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * @return Returns the actionType.
   */
  public String getActionType() {
    return actionType;
  }

  /**
   * @param actionType The actionType to set.
   */
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  /**
   * @return Returns the eventName.
   */
  public String getEventName() {
    return eventName;
  }

  /**
   * @param eventName The eventName to set.
   */
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * @return Returns the description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description The description to set.
   */
  public void setDescription(String description) {
    this.description = description;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
