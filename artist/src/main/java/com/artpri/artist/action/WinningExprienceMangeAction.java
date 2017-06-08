/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 艺术家个人信息管理跳转action 个人信息管理包括：个人简介、获奖经历
 * @author 王校兵
 * @version 1.0, 2016年3月18日
 */
public class WinningExprienceMangeAction extends BaseAction {


	//要修改艺术家获奖经历的主键
	private int zhu;

	//要修改的获奖年份
	private String years;

	//要修改的艺术家获奖经历
	private String experience;
	
	//返回信息
	private String message;

	/**
	 * 删除艺术家获奖信息
	 * @return 页面跳转代码
	 * */
	public String deleteWinningExperience(){
		
		return getWiningExperienceService().deleteWinningExperience(zhu);
	}


	/**
	 * 更新数据库中艺术家获奖经历跳转方法
	 * @return 页面跳转代码
	 * */
	public String updateWinningExperience(){
		
		return getWiningExperienceService().updateWinningExperience(zhu, years, experience);
	}
	
	/**
	 * 向数据库中插入艺术家获奖经历跳转方法
	 * @return 页面跳转代码
	 * */
	public String saveWinningExperience(){
		
		int state = getWiningExperienceService().saveWinningExperience(years, experience);
		if( state > 0){
			message = "更新成功！";
		}else{
			message = "数据更新失败，请重新提交";
		}
		
		return Action.SUCCESS;
	}


	public int getZhu() {
		return zhu;
	}

	public void setZhu(int zhu) {
		this.zhu = zhu;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}
