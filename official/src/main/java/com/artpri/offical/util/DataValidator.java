package com.artpri.offical.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 数据验证
 * @author ZhangSi
 */
public class DataValidator {

	/**
	 *	是否为手机号码 
	 */
	public static boolean isMobileNo(String no) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$"); 
		Matcher m = p.matcher(no);
		return m.matches();
	}
	
	/**
	 *	是否为e-mail地址 
	 */
	public static boolean isEmail(String email) {
		Pattern p = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-])+)+$");
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
}
