package com.rout;

public class LoggerServiceEarlyInitialization {
	private static final LoggerServiceEarlyInitialization logger = new LoggerServiceEarlyInitialization();

	private LoggerServiceEarlyInitialization() {
		// private constructor to prevent instantiation
	}

	public static LoggerServiceEarlyInitialization getLogger() {
		return logger;
	}
	  public void logMessage(String message) {
	        System.out.println(message);
	    }
}