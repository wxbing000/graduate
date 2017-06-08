/**
 * 
 */
package com.artpri.artist.action;

import com.opensymphony.xwork2.Action;

/**
 * 向数据库中插入艺术家提交的个人简介逻辑跳转类
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月24日
 */
public class InsertBriefIntroductAction extends BaseAction {

	// 前台传过来的艺术家个人简介
	private String info;

	// 返回的提示信息
	private String message;

	public String getInfo() {
		return info;
	}

	public String getMessage() {
		return message;
	}

	/**
	 * 向数据库中插入艺术家提交的简介信息
	 * 
	 * @return 页面跳转代码
	 * */
	public String insertIntroduct() {

		if (getBaseInfoManageService().insertIntroduct(info).equals("success")) {
			message = "个人简介更新成功";
			return Action.SUCCESS;
		} else {
			message = "个人简介未更新成功，请重新提交";
			return Action.INPUT;
		}
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
