package com.jjmsoftsolutions.jtracking.ws.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jjmsoftsolutions.jtracking"})
@EnableAutoConfiguration

//@EnableJpaRepositories("com.softstew.schoolLink.ws.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "com.jjmsoftsolutions.jtracking.jpa")
public class Init {
	public static void main(String[] args) {
		SpringApplication.run(Init.class, args);
	}
}