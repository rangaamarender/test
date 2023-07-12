/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.base.test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import com.github.javafaker.Faker;
import com.lucid.core.base.SContext;
import com.lucid.recruit.LucidRecruitApp;

/**
 * @author sgutti
 * @date 04-Jan-2023 7:07:41 pm
 */
@SpringBootTest(classes = LucidRecruitApp.class)
public abstract class BaseTest extends AbstractJUnit4SpringContextTests {
	// --------------------------------------------------------------- Constants
	public static Faker FAKER = new Faker();

	// --------------------------------------------------------- Class Variables
	// ----------------------------------------------------- Static Initializers
	// ------------------------------------------------------ Instance Variables
	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>BaseTest</code>
	 */
	public BaseTest() {
		super();
	}

	// ---------------------------------------------------------- Public Methods
	// ------------------------------------------------------- Protected Methods
	/**
	 * @return
	 */
	protected SContext getContext() {
		SContext context = new SContext();
		context.setUserID("UT-USER");
		context.setCallerID("JUNIT");
		return context;
	}
	// --------------------------------------------------------- Default Methods
	// --------------------------------------------------------- Private Methods
	// ---------------------------------------------------------- Static Methods
	// ----------------------------------------------------------- Inner Classes
}
