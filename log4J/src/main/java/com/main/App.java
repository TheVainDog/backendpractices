package com.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;

public class App {
	
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		Logger dailyLogger = LogManager.getLogger("DAILY_ROLLING_FILE_LOGGER");
		LoggerContext LoggerContext	= (LoggerContext) LogManager.getContext(false);
		//Configuration config = LoggerContext.getConfiguration();
		System.setProperty("logFilename", "NEW_LOG");
		
		
		
		LoggerContext.updateLoggers();
		
		
		
		
		final int count = 100;
		
		for (int i = 1; i <= count; i++) {
			dailyLogger.info("This is Daily Rolling file INFO level. " + i);
		}
		
		LOGGER.info("This in an INFO level log message");
		LOGGER.error("This in an ERROR level log message");
	}

}
