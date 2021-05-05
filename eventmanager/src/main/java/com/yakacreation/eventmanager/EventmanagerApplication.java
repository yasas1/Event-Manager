package com.yakacreation.eventmanager;

import javafx.application.Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventmanagerApplication {

	private static final Logger logger = LogManager.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(EventmanagerApplication.class, args);

		logger.info("Info level log message");
		logger.debug("Debug level log message");
		logger.error("Error level log message");
	}

}
