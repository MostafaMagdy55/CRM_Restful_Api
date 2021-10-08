package com.spring.rest;

public class CustomerErrorResponse {
	
	private int status;
	private String message;
	private long timestemp; 
	
	public CustomerErrorResponse()
	{
		
	}

	public CustomerErrorResponse(int status, String message, long timestemp) {
		super();
		this.status = status;
		this.message = message;
		this.timestemp = timestemp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestemp() {
		return timestemp;
	}

	public void setTimestemp(long timestemp) {
		this.timestemp = timestemp;
	}
	

}
