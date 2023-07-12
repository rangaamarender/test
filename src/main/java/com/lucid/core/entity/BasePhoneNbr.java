/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 11-Feb-2023 4:57:33 pm
 *
 */
@MappedSuperclass
@Embeddable
public class BasePhoneNbr extends BaseEntity {

	private static final long serialVersionUID = -6475608104948467200L;

	// The country dialing code for a communication number.
	@Column(name = "cntry_dialing_code", nullable = true, length = 5)
	private String countryDialingCode;

	// The area dialing code for a communication number.
	@Column(name = "area_dialing_code", nullable = true, length = 5)
	private String areaDialingCode;

	// The communication number, not including country dialing or area dialing
	// codes.
	@Column(name = "dial_number", nullable = false, length = 10)
	private String dialNumber;

	// The extension of the associated communication number.
	@Column(name = "phone_extn", nullable = true, length = 5)
	private String phoneExtension;

	// The text that permits access to the electronic network of the associated
	// communication number
	// such as telephone network, for example 9, *70.
	@Column(name = "access", nullable = true, length = 10)
	private String access;

	/**
	 * Create a new <code>BasePhoneNbr</code>
	 */
	public BasePhoneNbr() {
		super();
	}

	public BasePhoneNbr(String countryDialingCode, String areaDialingCode, String dialNumber, String phoneExtension,
			String access) {
		super();
		this.countryDialingCode = countryDialingCode;
		this.areaDialingCode = areaDialingCode;
		this.dialNumber = dialNumber;
		this.phoneExtension = phoneExtension;
		this.access = access;
	}

	public BasePhoneNbr(String dialNumber) {
		super();
		this.dialNumber = dialNumber;
	}

	public String getCountryDialingCode() {
		return countryDialingCode;
	}

	public void setCountryDialingCode(String countryDialingCode) {
		this.countryDialingCode = countryDialingCode;
	}

	public String getAreaDialingCode() {
		return areaDialingCode;
	}

	public void setAreaDialingCode(String areaDialingCode) {
		this.areaDialingCode = areaDialingCode;
	}

	public String getDialNumber() {
		return dialNumber;
	}

	public void setDialNumber(String dialNumber) {
		this.dialNumber = dialNumber;
	}

	public String getPhoneExtension() {
		return phoneExtension;
	}

	public void setPhoneExtension(String phoneExtension) {
		this.phoneExtension = phoneExtension;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

}
