package com.example.projects.countrycode.countrycode.modals.DTO;

import com.example.projects.countrycode.countrycode.modals.CountryDetail;

public class ResponseDto {

	private String message;
	private String HttpStatus;
	private CountryDetail data;
	
	public ResponseDto(){
		this.message="default message";
		this.HttpStatus="XXX";
		this.data=null;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getHttpStatus() {
		return HttpStatus;
	}
	public void setHttpStatus(String httpStatus) {
		HttpStatus = httpStatus;
	}
	public CountryDetail getData() {
		return data;
	}
	public void setData(CountryDetail data) {
		this.data = data;
	}
	
}
