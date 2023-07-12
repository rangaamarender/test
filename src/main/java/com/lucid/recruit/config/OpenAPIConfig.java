package com.lucid.recruit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI myOpenAPI() {

		Contact contact = new Contact();
		contact.setEmail("shashi.d@lucidtechinc.com");
		contact.setName("Lucid Recruit");
		contact.setUrl("https://www.lucidrecruit.com");
		License lrecuritLicense = new License().name("Lucid Recurit API License").url("https://lucidrecruit.com/licenses/");
		Info info = new Info().title("Lucid Recruit API").version("1.0").contact(contact)
				.description("This API exposes endpoints to manage tutorials.")
				.termsOfService("https://www.bezkoder.com/terms").license(lrecuritLicense);

		return new OpenAPI().info(info);
	}
}
