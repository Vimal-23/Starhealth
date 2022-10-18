package com.dell;

import com.sh.CSLSpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
//@EnableEurekaClient

public class ConsumersServiceApplication extends CSLSpringBootApplication {
	
	public static void main(String[] args) {
		configureApplication(new SpringApplicationBuilder()).run(args);
	}
	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
		builder.sources(ConsumersServiceApplication.class);
		initBase(builder, "uwbancs-retail-api");
		return builder;
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return configureApplication(builder);
	}
}
