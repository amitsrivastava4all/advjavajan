package com.brainmentors.exam.utils;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	private DateUtil() {}
	public static String getFormattedDate(String country, String lang) {
		Date date  = new Date(); 
		Locale locale = new Locale(lang, country);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale );
		return df.format(date);
	}

}
