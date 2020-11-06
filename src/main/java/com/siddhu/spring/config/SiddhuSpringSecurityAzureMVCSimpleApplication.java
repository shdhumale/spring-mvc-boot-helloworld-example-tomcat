package com.siddhu.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class SiddhuSpringSecurityAzureMVCSimpleApplication extends SpringBootServletInitializer{
public class SiddhuSpringSecurityAzureMVCSimpleApplication  extends SpringBootServletInitializer {

	 @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SiddhuSpringSecurityAzureMVCSimpleApplication.class);
	   }
	 
	public static void main(String[] args) {
		SpringApplication.run(SiddhuSpringSecurityAzureMVCSimpleApplication.class, args);		
		/*SpringApplication app = new SpringApplication(SiddhuSpringSecurityAzureSimpleApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
        app.run(args);*/
	}

}
