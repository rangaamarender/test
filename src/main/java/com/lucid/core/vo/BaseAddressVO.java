/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.vo;

import com.lucid.core.embeddable.DateTimePeriod;
import com.lucid.core.embeddable.GeoCode;

/**
 * @author sgutti
 * @date 16-Mar-2023 5:39:08 am
 *
 */
public class BaseAddressVO extends BaseVO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 2849538703493281144L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String name;

  // Code identifying the usage of the contact point e.g. business, private, etc.
  private String useCode;

  // Provide priority for given communication item
  private Integer preference;

  private String address1;

  private String address2;

  private String address3;

  private String address4;

  private String address5;

  private String city;

  private String postalCode;

  private String postOfficeBox;

  private String countryCode;

  private DateTimePeriod availablePeriod;

  private GeoCode geoCode;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseAddressVO</code>
   */
  public BaseAddressVO() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

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
   * @return Returns the useCode.
   */
  public String getUseCode() {
    return useCode;
  }


  /**
   * @param useCode The useCode to set.
   */
  public void setUseCode(String useCode) {
    this.useCode = useCode;
  }


  /**
   * @return Returns the preference.
   */
  public Integer getPreference() {
    return preference;
  }


  /**
   * @param preference The preference to set.
   */
  public void setPreference(Integer preference) {
    this.preference = preference;
  }


  /**
   * @return Returns the address1.
   */
  public String getAddress1() {
    return address1;
  }


  /**
   * @param address1 The address1 to set.
   */
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  /**
   * @return Returns the address2.
   */
  public String getAddress2() {
    return address2;
  }


  /**
   * @param address2 The address2 to set.
   */
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  /**
   * @return Returns the address3.
   */
  public String getAddress3() {
    return address3;
  }


  /**
   * @param address3 The address3 to set.
   */
  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  /**
   * @return Returns the address4.
   */
  public String getAddress4() {
    return address4;
  }


  /**
   * @param address4 The address4 to set.
   */
  public void setAddress4(String address4) {
    this.address4 = address4;
  }


  /**
   * @return Returns the address5.
   */
  public String getAddress5() {
    return address5;
  }


  /**
   * @param address5 The address5 to set.
   */
  public void setAddress5(String address5) {
    this.address5 = address5;
  }


  /**
   * @return Returns the city.
   */
  public String getCity() {
    return city;
  }


  /**
   * @param city The city to set.
   */
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * @return Returns the postalCode.
   */
  public String getPostalCode() {
    return postalCode;
  }


  /**
   * @param postalCode The postalCode to set.
   */
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * @return Returns the postOfficeBox.
   */
  public String getPostOfficeBox() {
    return postOfficeBox;
  }


  /**
   * @param postOfficeBox The postOfficeBox to set.
   */
  public void setPostOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }


  /**
   * @return Returns the countryCode.
   */
  public String getCountryCode() {
    return countryCode;
  }


  /**
   * @param countryCode The countryCode to set.
   */
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * @return Returns the availablePeriod.
   */
  public DateTimePeriod getAvailablePeriod() {
    return availablePeriod;
  }


  /**
   * @param availablePeriod The availablePeriod to set.
   */
  public void setAvailablePeriod(DateTimePeriod availablePeriod) {
    this.availablePeriod = availablePeriod;
  }


  /**
   * @return Returns the geoCode.
   */
  public GeoCode getGeoCode() {
    return geoCode;
  }


  /**
   * @param geoCode The geoCode to set.
   */
  public void setGeoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
