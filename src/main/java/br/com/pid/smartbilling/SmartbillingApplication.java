package br.com.pid.smartbilling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("br.com.pid.smartbilling.model")
public class SmartbillingApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SmartbillingApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SmartbillingApplication.class, args);
	}
}

