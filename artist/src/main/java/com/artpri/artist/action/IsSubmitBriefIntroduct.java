/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 查询艺术家是否曾经提交过个人简介，如提交过则返回简介反之则显示为空
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月24日
 */
public class IsSubmitBriefIntroduct extends BaseAction{

	// 艺术家的个人信息查询结果
	private List introduct;

	public List getIntroduct() {
		return introduct;
	}

	/**
	 * 艺术家是否曾经提交过个人简介
	 * 
	 * @return 页面跳转代码
	 * */
	public String isSubmitIntroduct() {
		introduct = getBaseInfoManageService().isSubmitIntroduct();
		return Action.SUCCESS;
	}

	public void setIntroduct(List introduct) {
		this.introduct = introduct;
	}

}
