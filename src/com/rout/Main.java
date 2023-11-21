package com.rout;

public class Main {

	public static void main(String[] args) {
		LoggerService logger1 = LoggerServiceInitializer.getLogger();
		LoggerService logger2 = LoggerServiceInitializer.getLogger();

		// Both logger1 and logger2 will reference the same instance
		logger1.logMessage("Hello from logger1");
		logger2.logMessage("Hello from logger2");
		
		
		LoggerServiceEarlyInitialization logger = LoggerServiceEarlyInitialization.getLogger();
	        logger.logMessage("This is a log message.");
	}
}
