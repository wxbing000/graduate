package com.artpri.artist.util;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 分割字符串
 * @author 4
 *
 */
public class SegmentString {

	/**
	 * tokenizerString
	 * @param string 待分割的字符串
	 * @param separator 分割符
	 * @return ArrayList
	 */
	public static ArrayList<String> tokenizerString(String string, String separator) {

		ArrayList<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(string, separator, false);

		while (st.hasMoreElements()) {
			list.add(st.nextToken());
		}

		return list;
	}
	
	/**
	 * splitString
	 * @param string 带分割字符串
	 * @param separator 分隔符
	 * @return String[]
	 */
	public static String[] splitString(String string, String separator){
		String[] strings = string.split(separator);
		return null;
	}
}
