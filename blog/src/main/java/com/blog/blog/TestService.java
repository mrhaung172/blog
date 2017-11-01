package com.blog.blog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	public static Logger logger = LogManager.getLogger(TestService.class);

	public TestService() {
		logger.info("sakfhsakfdhk");
		System.out.println();
	}
}
