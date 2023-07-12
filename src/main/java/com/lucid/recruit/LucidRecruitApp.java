/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.recruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.lucid" })
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = { "com.lucid" })
@EnableTransactionManagement
@EntityScan(basePackages = { "com.lucid" })
@SpringBootApplication
public class LucidRecruitApp extends SpringBootServletInitializer {

	/**
	 * Create a new <code>LucidSubMgtApp</code>
	 */
	public LucidRecruitApp() {
		super();
	}

	public static void main(String[] args) {
		SpringApplication.run(LucidRecruitApp.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LucidRecruitApp.class);
	}

}
