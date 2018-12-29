package com.example.projects.countrycode.countrycode.utils;

import java.sql.Timestamp;
import java.util.Date;


public class CountryUtil {
	public static String getTime()
	{
		Date date= new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		String ss=ts.toString();
		return ss;
	}
}
