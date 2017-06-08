/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 获取到数据库中的艺术家的获奖经历跳转action
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月25日
 */
public class GetWinningExperienceAction extends BaseAction {

	
	private List award;// 艺术家获奖经历
	private int pageNow;// 前台显示的当前页数
	private int pageSize;//每页显示的数据条数
	private int totalPage;// 总页数

	public List getAward() {
		return award;
	}

	public int getPageNow() {
		return pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * 取到数据库中指定艺术家的获奖经历跳转方法
	 * */
	public String getWinningExperience() {

		award = getWiningExperienceService().getWinningExperience(pageNow,pageSize);
		
		totalPage = getWiningExperienceService().totalpage(pageSize);
		
		return Action.SUCCESS;
	}

	public void setAward(List award) {
		this.award = award;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
}
