/**
 * 
 */
package com.artpri.artist.service.impl;

import java.util.List;

import com.artpri.artist.service.BaseInfoManageService;
import com.artpri.artist.util.GetPagingInfoUtil;
import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月18日
 */
public class BaseInfoManageServiceImpl extends BaseService implements
		BaseInfoManageService {

	@Override
	public List isSubmitIntroduct() {

		// 从session中取到的登录用户的用户编码
		Integer userNumber = (Integer) ActionContext.getContext().getSession()
				.get("userNum");

		return getBaseInfoManageDao().isSubmitIntroduct(userNumber);
	}

	@Override
	public String insertIntroduct(String info) {

		// 如果用户提交的艺术家的简介长度大于2000则返回提交界面
		if (info.length() >= 4000) {
			System.out.println("个人简介长度超出限制，字数请不超过1000");
			return "failed";
		}

		// 从session中取到当前登录用户的用户编码
		int userNumber = (int) ActionContext.getContext().getSession()
				.get("userNum");

		if (getBaseInfoManageDao().insertInfo(userNumber, info) == 1) {
			return "success";
		}
		return "failed";
	}
	
}
