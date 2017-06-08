/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 根据查询条件获取照片集合
 * @author 王校兵
 * @version 1.0, 2016年4月6日
 */
public class GetQueryAlbumPhotoAction extends BaseAction {

	private List photoList;// 照片的查询结果集合
	private String queryTime;// 要查询照片的拍摄时间条件
	private int queryCategory;// 要查询的相册分类条件
	private String queryTitle;// 要查询的标题条件
	
	public List getPhotoList() {
		return photoList;
	}
	public int getQueryCategory() {
		return queryCategory;
	}

	public String getQueryTime() {
		return queryTime;
	}

	public String getQueryTitle() {
		return queryTitle;
	}
	
	/**
	 * 通过相册分类查询相册照片action方法
	 * @return 页面跳转对应的逻辑代码
	 * */
	public String photoByCategory() {
		photoList = getAlbumPhotoMangeService().getPhotoByCategory(queryCategory);
		return Action.SUCCESS;
	}

	/**
	 * 通过拍摄时间查询相册照片action方法
	 * @return 页面跳转对应的逻辑代码
	 * */
	public String photoByTime() {
		photoList = getAlbumPhotoMangeService().getPhotoByTime(queryTime);
		return Action.SUCCESS;
	}

	/**
	 * 通过照片标题查询相册照片action方法
	 * @return 页面跳转对应的逻辑代码
	 * */
	public String photoByTitle() {
		photoList = getAlbumPhotoMangeService().getPhotoByTitle(queryTitle);
		return Action.SUCCESS;
	}

	public void setPhotoList(List photoList) {
		this.photoList = photoList;
	}

	public void setQueryCategory(int queryCategory) {
		this.queryCategory = queryCategory;
	}

	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}

	public void setQueryTitle(String queryTitle) {
		this.queryTitle = queryTitle;
	}

}
