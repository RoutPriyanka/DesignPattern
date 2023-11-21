package com.rout;
public class LoggerService {

	private static LoggerService logger;

	private LoggerService() {
		// private constructor to prevent instantiation
	}

	public static LoggerService getLogger() {
		if (logger == null) {
			synchronized (LoggerService.class) {
				if (logger == null) {
					logger = new LoggerService();
				}
			}
		}
		return logger;
	}

	public void logMessage(String message) {
		System.out.println("Logging: " + message);
	}
}

		

