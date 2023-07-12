package com.lucid.core.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class GeoCodeDTO {

    private String name;

    // The latitude of the geographical location.

    @NotNull
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal latitude;

    // The longitude of the geographical location.
    @NotNull
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal longitude;


    // The altitude of the geographical location. Defaults to meters above sea level in case no
    // unitCode provided.
    private BigDecimal altitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getAltitude() {
        return altitude;
    }

    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
    }
}
