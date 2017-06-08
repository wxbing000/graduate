/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 取到艺术家的年表信息跳转处理类
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月25日
 */
public class GetChronologyAction extends BaseAction {
	
	private List chronologyList;// 向前台传递的艺术家的年表信息
	private int pageNow;// 前台显示的当前页数
	private int totalPage; // 总页数
	private int pageSize;//每页显示的数据条数

	/**
	 * 取到数据库中的当前艺术家的年表信息跳转方法
	 * */
	public String getChronology() {
		
		chronologyList = getChronologyManageService().getChronology(pageNow,10);
		
		totalPage = getChronologyManageService().totalpage(10);
		
		return Action.SUCCESS;
	}
	
	public List getChronologyList() {
		return chronologyList;
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
	public void setChronologyList(List chronologyList) {
		this.chronologyList = chronologyList;
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
