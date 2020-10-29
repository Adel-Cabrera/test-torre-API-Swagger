package com.darkonnen.technicaltest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket parkingLotApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("com.darkonnen.technicaltest").apiInfo(apiInfo()).select()
		.apis(RequestHandlerSelectors.basePackage(
				"com.darkonnen.technicaltest.controllers"))
		.build();
				
	}
	
	
		private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("xxxx")
				.description("xxxxx")
				.termsOfServiceUrl("xxxxx")
				.contact(new Contact("xxxxxx", "xxxxx", "xxxxx")).license("xxxxxx")
				.licenseUrl("xxxxx").version("1.0").build();
	}

}
