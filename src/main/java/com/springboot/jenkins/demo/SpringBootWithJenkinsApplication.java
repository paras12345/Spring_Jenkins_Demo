package com.springboot.jenkins.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootWithJenkinsApplication.class);	
	
	@PostConstruct // Execute only once after the bean initialized
	public void initMethod()
	{
		logger.info("Application begin work...");
	}
	
	
	@PreDestroy // Execute only once after the bean destroyed from Application context
	public void destrolMethod()
	{
		logger.info("Application Stoped...");
	}
	
	
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringBootWithJenkinsApplication.class, args);
	}

}
