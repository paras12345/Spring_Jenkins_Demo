package com.springboot.jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWithJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootWithJenkinsApplication.class);	
	
	
	@Test
	void contextLoads() {
		logger.info("Test case is executing...");
		assertEquals(true,true);
	}

}
