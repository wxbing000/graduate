package com.artpri.artist.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 生成随机文件名，年月日时分秒+五位随机数 
 * @author 4
 *
 */
public class RandomFileNameUtil {

	 /** 
     * 生成随机文件名：当前年月日时分秒+五位随机数 
     */  
    public static String getRandomFileName() {  
  
        SimpleDateFormat simpleDateFormat;  
  
        simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");  
  
        Date date = new Date();  
  
        String str = simpleDateFormat.format(date);  
  
        Random random = new Random();  
  
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数  
  
        return  str + rannum ;// 当前时间  
    }  
  
    public static void main(String[] args) {  
  
        String fileName = RandomFileNameUtil.getRandomFileName();  
  
        System.out.println(fileName);//8835920140307  
    } 
}
