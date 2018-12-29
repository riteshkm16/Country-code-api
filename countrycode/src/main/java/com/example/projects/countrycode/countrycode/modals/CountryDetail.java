/*@author : Ritesh Kishore Mishra
 *email : riteshkm16@gmail.com
 */
package com.example.projects.countrycode.countrycode.modals;

public class CountryDetail {
	
	private String name;
	private String dialCode;
	private String code;

	public CountryDetail(String name, String dialCode, String code) {
		super();
		this.name = name;
		this.dialCode = dialCode;
		this.code = code;
	}

	public CountryDetail()
	{
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDialCode() {
		return dialCode;
	}
	public void setDialCode(String dialCode) {
		this.dialCode = dialCode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return " CountryDetail [name=" + name + ", dialCode=" + dialCode + ", code=" + code + "]";
	}

}
