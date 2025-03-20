package com.exception.common.exception;

import java.time.LocalDateTime;

public class ServerException extends RuntimeException{

	private LocalDateTime triggerDate;
	
	public ServerException(String msg) {
		super(msg);
		triggerDate = LocalDateTime.now();
	}
	
	public LocalDateTime getTriggerDate() {
		return triggerDate;
	}
}
