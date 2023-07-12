/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.entity;

import com.lucid.core.embeddable.GeoCode;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 11-Feb-2023 4:36:17 pm
 *
 */
@MappedSuperclass
public abstract class BaseAddress extends BaseEntity {

	private static final long serialVersionUID = 8645126601118295467L;

	// Provide description for particular communication item
	@Column(name = "address_name", nullable = true, length = 50)
	private String addressName;

	@Column(name = "address1", nullable = true, length = 100)
	private String address1;

	@Column(name = "address2", nullable = true, length = 100)
	private String address2;

	@Column(name = "address3", nullable = true, length = 100)
	private String address3;

	@Column(name = "address4", nullable = true, length = 100)
	private String address4;

	@Column(name = "address5", nullable = true, length = 100)
	private String address5;

	@Column(name = "city", nullable = true, length = 100)
	private String city;

	@Column(name = "state", nullable = true, length = 100)
	private String state;

	@Column(name = "postal_code", nullable = true, length = 25)
	private String postalCode;

	@Column(name = "post_office_box", nullable = true, length = 15)
	private String postOfficeBox;

	@Column(name = "cntry_code", nullable = true, length = 15)
	private String countryCode;

	@Embedded
	private GeoCode geoCode;

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getAddress5() {
		return address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostOfficeBox() {
		return postOfficeBox;
	}

	public void setPostOfficeBox(String postOfficeBox) {
		this.postOfficeBox = postOfficeBox;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public GeoCode getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(GeoCode geoCode) {
		this.geoCode = geoCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
