/**
 * 
 */
package com.artpri.offical.action;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <p>Description: 艺术家官网作品页面处理action</p>
 * @author 王校兵
 * @time 2016年9月12日下午4:10:54
 * @version 1.0
 */

@Controller("WorksPageAction")
public class WorksPageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * 获取作品界面上的所有的信息
	 * */
	public String worksInfo(){
		
		
		return SUCCESS;
	}
	
	
	
}
