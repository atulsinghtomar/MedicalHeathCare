package com.healthcare.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Config {
	@Bean
	public Docket userApi()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.healthcare.controller"))
				.build()
				.apiInfo(metadata());
	}
	

	private ApiInfo metadata() {
		ApiInfo apiInfo = new ApiInfo("Spring Boot Rest Api", 
				"Spring Boot Rest Api for crud opertation", "1.0",
				"Term of service", "pooja sharma", "Apache License of version 2.0",
				"http://www.apache.org/licenses/LICENSE-2.0");
		return apiInfo;
	}
	

}
