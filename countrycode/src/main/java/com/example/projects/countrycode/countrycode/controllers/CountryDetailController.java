package com.example.projects.countrycode.countrycode.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projects.countrycode.countrycode.modals.DTO.ResponseDto;
import com.example.projects.countrycode.countrycode.services.CountryDetailService;
import com.example.projects.countrycode.countrycode.utils.CountryUtil;

@RestController
@RequestMapping("/api.countrydetail")
public class CountryDetailController {
	
	@Autowired
	CountryDetailService countryDetailService;

	@GetMapping(value="/")
	public String getDefault()
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailController class and the getDefault function    ---");
		return "This is Country Code Controller";
	}
	

	@GetMapping(value="/docs")
	public String getDocs()
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailController class and the getDocs function    ---");
		return "\r\n" + 
				"base url : /api.countrydetail\r\n" + 
				"<br/>\r\n" + 
				"Default url                          <br/>\r\n" + 
				"<a href=\"/api.countrydetail/\">/</a>\r\n" + 
				"\r\n" + 
				"<br/>\r\n" + 
				"Docs                                 <br/>\r\n" + 
				"<a href=\"/api.countrydetail/docs\">/</a>\r\n" + 
				"\r\n" + 
				"<br/>\r\n" + 
				"Get data from the country name       <br/>\r\n" + 
				"<a href=\"/api.countrydetail/name/{countryName}\">/dialcode/{countryName}</a>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<br/>\r\n" + 
				"Get data from the country code       <br/>\r\n" + 
				"<a href=\"/api.countrydetail/code/{countryCode}\" >/dialcode/{countryCode}</a>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<br/>\r\n" + 
				"Get data from the country dial code  <br/>\r\n" + 
				"<a href=\"/api.countrydetail/dialcode/{countryDialCode}\" >/dialcode/{countryDialCode}</a>\r\n" + 
				"";
	}
	
	@GetMapping(value="/init")
	public String getInitialized()
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailController class and the getInitialized function    ---");
		return "initialize";
	}

	@GetMapping(value="/name/{countryName}")
	public ResponseDto getCountryDetailByName(@PathVariable String countryName)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailController class and the getCountryDetailbyName function    ---");
		System.out.println("--------------------------------- > "+countryName+" -----------------");
		return countryDetailService.getCountryDetailByName(countryName);
	}

	@GetMapping(value="/code/{countryCode}")
	public ResponseDto getCountryDetailByCode(@PathVariable String countryCode)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailController class and the getCountryDetailByCode function    ---");
		System.out.println("--------------------------------- > "+countryCode+" -----------------");
		return countryDetailService.getCountryDetailByCode(countryCode);
	}

	@GetMapping(value="/dialcode/{countryDialCode}")
	public ResponseDto getCountryDetailByDialCode(@PathVariable String countryDialCode)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailController class and the getCountryDetailByDialCode function    ---");
		System.out.println("--------------------------------- > "+countryDialCode+" -----------------");
		return countryDetailService.getCountryDetailByDialCode(countryDialCode);
	}

}
