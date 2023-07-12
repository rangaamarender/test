/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author sgutti
 * @date Jul 24, 2022 5:30:50 PM
 */
@Component(value = RecruitEnvConfig.NAME)
public class RecruitEnvConfig implements EnvConfig {

  // --------------------------------------------------------------- Constants
  public static final String NAME = "envConfig";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private Environment env;

  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the noreplyEmailAddress.
   */
  public String getNoreplyEmailAddress() {
    return env.getProperty("recruit.noreplyEmailAddress");
  }

  /**
   * @return Returns the supportEmailAddress.
   */
  public String getSupportEmailAddress() {
    return env.getProperty("recruit.supportEmailAddress");
  }

  /**
   * @return
   */
  public String getDefaultPassword() {
    return env.getProperty("recruit.defaultUserPasswd");
  }

  /**
   * @return Returns the noreplyEmailAddress.
   */
  public String getSubscriptionInitURL(String code) {
    String value = env.getProperty("recruit.subscriptionInit");
    return value + code;
  }

  /**
   * @return
   */
  public String getLoginURL() {
    return env.getProperty("recruit.loginURL");
  }

  /**
   * @return
   */
  public boolean isProdMode() {
    String mode = env.getProperty("recruit.env.mode");
    return StringUtils.equals("PROD", mode);
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
