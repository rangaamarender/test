/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.embeddable;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * 
 * A geographical coordinate.
 * 
 * @author sgutti
 * @date 11-Feb-2023 4:48:36 pm
 *
 */
@Embeddable
public class GeoCode {
  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables

  // The label of the geo coordinates.
  @Column(name = "geo_name", nullable = true, length = 50)
  private String name;

  // The latitude of the geographical location.
  @Column(name = "geo_latitude", nullable = true)
  private BigDecimal latitude;

  // he longitude of the geographical location.
  @Column(name = "geo_longitude", nullable = true)
  private BigDecimal longitude;


  // The altitude of the geographical location. Defaults to meters above sea level in case no
  // unitCode provided.
  @Column(name = "geo_altitude", nullable = true)
  private BigDecimal altitude;
  // ------------------------------------------------------------ Constructors

  /**
   * Create a new <code>GeoCode</code>
   */
  public GeoCode() {
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
   * @return Returns the latitude.
   */
  public BigDecimal getLatitude() {
    return latitude;
  }


  /**
   * @param latitude The latitude to set.
   */
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  /**
   * @return Returns the longitude.
   */
  public BigDecimal getLongitude() {
    return longitude;
  }


  /**
   * @param longitude The longitude to set.
   */
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  /**
   * @return Returns the altitude.
   */
  public BigDecimal getAltitude() {
    return altitude;
  }


  /**
   * @param altitude The altitude to set.
   */
  public void setAltitude(BigDecimal altitude) {
    this.altitude = altitude;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
