/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * A component for capturing summary or fine-grain data comprising a person's
 * name.
 * 
 * @author sgutti
 * @date 21-Jan-2023 12:08:58 am
 */
@Embeddable
public class BasePersonName {

	@Column(name = "given_name", nullable = true, length = 100)
	private String givenName;

	@Column(name = "middle_name", nullable = true, length = 100)
	private String middleName;

	@Column(name = "family", nullable = true, length = 50)
	private String family;

	@Column(name = "preferred_name", nullable = true, length = 200)
	private String preferredName;

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>BasePersonName</code>
	 */
	public BasePersonName() {
		super();
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}

}
