package com.baban.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {
	private String message;
	private String statusCode;
	private String url;
	private LocalDateTime timeStamp;

	public ExceptionResponse() {
		super();
	}

	public ExceptionResponse(String message, String statusCode, String url, LocalDateTime timeStamp) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.url = url;
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
}
