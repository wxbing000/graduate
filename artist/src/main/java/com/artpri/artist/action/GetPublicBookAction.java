/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 获取艺术家的所有著作信息跳转action
 * @author 王校兵
 * @version 1.0, 2016年4月12日
 */
public class GetPublicBookAction extends BaseAction {
	
	private int pageNow;//当前的页码数
	private int totalPage;//总页面数
	private int pageSize;//每个页面显示的数据条数
	private List publicBook;//查询出的数据的集合

	public int getPageNow() {
		return pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public List getPublicBook() {
		return publicBook;
	}

	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * 获取艺术家著作信息action
	 * */
	public String PubicBook(){
		publicBook = getPublicBookMangeService().getPublicBook(pageNow,pageSize);
		totalPage = getPublicBookMangeService().totalpage(pageSize);
		return Action.SUCCESS;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setPublicBook(List publicBook) {
		this.publicBook = publicBook;
	}
	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
}
