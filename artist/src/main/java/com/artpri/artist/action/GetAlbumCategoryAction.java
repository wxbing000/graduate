/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 获取数据库中指定艺术家的相册分类信息action类
 * 
 * @author 王校兵
 * @version 1.0, 2016年4月1日
 */
public class GetAlbumCategoryAction extends BaseAction {

	private List categoryList;

	/**
	 * 获取艺术家分类信息处理方法
	 * */
	public String getAlbumCategory() {

		categoryList = getAlbumCategoryMangeService().getCategory();
		
		return Action.SUCCESS;
	}

	public List getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List categoryList) {
		this.categoryList = categoryList;
	}

}
