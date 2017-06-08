package com.artpri.offical.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * 生成随机文件名，年月日时分秒+五位随机数 
 * @author 4
 *
 */
public class RandomUtil {

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
  
    /**
     * [x,x)
     * @param start
     * @param end
     * @param sum
     * @param repeat
     * @return
     */
    public static int[] getRangeRandom(int start, int end, int sum, boolean repeat) {
    	Random random = new Random();
    	int[] num = new int[sum];
    	if(repeat) {
    		for (int i = 0; i < num.length; i++) {
				num[i] = random.nextInt(end) + start;
			}
    	} else {
    		int length = end-start;
    		Set<Integer> set = new LinkedHashSet<Integer>();
    		if (sum <= length) {
    			while(set.size()!=sum) {
    				set.add(random.nextInt(end) + start);
    			}
    			int i = 0;
    			for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
					num[i] = (Integer) it.next();
					i++;
				}
    		} else if (sum > length) {
    			for (int i = 0; i < num.length; i++) {
    				num[i] = random.nextInt(end) + start;
    			}
    		}
    	}
    	return num;
    }
    
    
    public static void main(String[] args) {  
  
        /*String fileName = RandomUtil.getRandomFileName();  
  
        System.out.println(fileName);//8835920140307  */
    	
    	/*int[] a = getRangeRandom(0, 99999, 3000, false);
    	for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
    	
    	/*Set<Integer> set = new LinkedHashSet<Integer>();
    	set.add(2);
    	set.add(4);
    	set.add(4);
    	set.add(3);
    	set.add(1);
    	for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}*/
    } 
}
