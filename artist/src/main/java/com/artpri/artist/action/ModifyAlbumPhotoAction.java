/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 修改艺术家相册图片信息action
 * @author 王校兵
 * @version 1.0, 2016年4月6日
 */
public class ModifyAlbumPhotoAction extends BaseAction {
	
	//当前艺术家的所有的年代信息
	private List years; 
	
	//当前艺术家的所有的相册分类信息
	private List category;
	
	/**
	 * 取到数据库中所有的照片的信息包括：照片的相册分类，照片的拍摄年代
	 * */
	public String getALLPhotoInfo(){
		category = getAlbumCategoryMangeService().getCategory();
		years = getAlbumPhotoMangeService().getPhotoYears();
		return Action.SUCCESS;
	}

	public List getYears() {
		return years;
	}

	public void setYears(List years) {
		this.years = years;
	}

	public List getCategory() {
		return category;
	}

	public void setCategory(List category) {
		this.category = category;
	}
	
}
