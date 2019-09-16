package com.dxc.dtc.dso.emp.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorDTO {

	@JsonProperty("errorCode")
	private String errorCode;
	
	@JsonProperty("errorMessage")
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
