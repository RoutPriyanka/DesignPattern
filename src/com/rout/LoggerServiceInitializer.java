package com.rout;

public class LoggerServiceInitializer {

	private static LoggerService logger;

	public static LoggerService getLogger() {
		if (logger == null) {
			synchronized (LoggerServiceInitializer.class) {
				if (logger == null) {
					logger = LoggerService.getLogger();
				}
			}
		}
		return logger;
	}
}
