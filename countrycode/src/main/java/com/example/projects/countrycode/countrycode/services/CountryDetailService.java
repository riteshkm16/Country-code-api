package com.example.projects.countrycode.countrycode.services;

import org.springframework.stereotype.Service;

import com.example.projects.countrycode.countrycode.modals.DTO.ResponseDto;
import com.example.projects.countrycode.countrycode.utils.CountryUtil;
import com.example.projects.countrycode.repositories.CountryDetailDB;

@Service
public class CountryDetailService {

	public ResponseDto getCountryDetailByCode(String countryCode)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailService class and the getCountryDetailByCode function    ---");
		ResponseDto responseDto=new ResponseDto();
		responseDto.setData(CountryDetailDB.findByCode(countryCode));
		responseDto.setHttpStatus("200");
		responseDto.setMessage("success");
		if(responseDto.getData()==null)
		{
			responseDto.setHttpStatus("400");
			responseDto.setMessage("failure not found");	
		}
		return responseDto;
	}

	
	public ResponseDto getCountryDetailByName(String countryName)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailService class and the getCountryDetailByName function    ---");
		ResponseDto responseDto=new ResponseDto(); 
		responseDto.setData(CountryDetailDB.findByName(countryName));
		responseDto.setHttpStatus("200");
		responseDto.setMessage("success");
		if(responseDto.getData()==null)
		{
			responseDto.setHttpStatus("400");
			responseDto.setMessage("failure not found");	
		}
		return responseDto;
	}

	
	public ResponseDto getCountryDetailByDialCode(String countryDialCode)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailService class and the getCountryDetailByCode function    ---");
		ResponseDto responseDto=new ResponseDto();
		responseDto.setData(CountryDetailDB.findByDialCode(countryDialCode));
		responseDto.setHttpStatus("200");
		responseDto.setMessage("success");
		if(responseDto.getData()==null)
		{
			responseDto.setHttpStatus("400");
			responseDto.setMessage("failure not found");	
		}
		return responseDto;
	}
	
	
}
