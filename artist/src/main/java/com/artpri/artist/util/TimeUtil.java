package com.artpri.artist.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 4
 *
 */
public class TimeUtil {

	public static SimpleDateFormat getSimpleDateFormat(String format){
		return new SimpleDateFormat(format);
	}
	
	/**
	 * ForExample 2016-03-30 16:59:44
	 * @return Timestamp
	 */
	public static Timestamp getTimeStamp(){
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		ts = Timestamp.valueOf(getSimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		return ts;
	}
	
	/**
	 * 
	 * @param format 日期格式  yyyyMM等
	 * @return
	 */
	public static String getSystemTime(String format){
		return getSimpleDateFormat(format).format(new Date());
	}
	
	/**
	 * 
	 * @param datestring
	 * @param dateformat
	 * @return
	 */
	public static Date StringToDate(String datestring, String dateformat){
		Date date = null;
		try {
			date = getSimpleDateFormat(dateformat).parse(datestring);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
