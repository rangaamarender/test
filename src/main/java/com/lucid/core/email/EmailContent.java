/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.email;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sgutti
 * @date Oct 29, 2018 9:50:34 PM *  * 
 */
public class EmailContent {
	// --------------------------------------------------------------- Constants
	// --------------------------------------------------------- Class Variables
	// ----------------------------------------------------- Static Initializers
	// ------------------------------------------------------ Instance Variables
	private String from;
	private String fromName;
	private String subject;
	private String body;
	private List<String> toList = new ArrayList<>();
	private List<String> ccList = new ArrayList<>();

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>EmailContent</code>
	 */
	public EmailContent() {
		super();
	}
	// ---------------------------------------------------------- Public Methods

	/**
	 * @return Returns the from.
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from The from to set.
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return Returns the subject.
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject The subject to set.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return Returns the body.
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body The body to set.
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return Returns the toList.
	 */
	public List<String> getToList() {
		return toList;
	}

	/**
	 * @param toList The toList to set.
	 */
	public void setToList(List<String> toList) {
		this.toList = toList;
	}

	/**
	 * @param to
	 */
	public void addToList(String to) {
		if (toList != null) {
			toList.add(to);
		}
	}

	/**
	 * @return Returns the ccList.
	 */
	public List<String> getCcList() {
		return ccList;
	}

	/**
	 * @param ccList The ccList to set.
	 */
	public void setCcList(List<String> ccList) {
		this.ccList = ccList;
	}

	/**
	 * @return Returns the fromName.
	 */
	public String getFromName() {
		return fromName;
	}

	/**
	 * @param fromName The fromName to set.
	 */
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	/**
	 * @return
	 */
	public String[] getCc() {
		return ccList.toArray(new String[ccList.size()]);
	}

	/**
	 * @return
	 */
	public String[] getTo() {
		return toList.toArray(new String[toList.size()]);
	}
	// ------------------------------------------------------- Protected Methods
	// --------------------------------------------------------- Default Methods
	// --------------------------------------------------------- Private Methods
	// ---------------------------------------------------------- Static Methods
	// ----------------------------------------------------------- Inner Classes
}
