/**
 * 
 */
package com.artpri.artist.service;

import java.util.List;

import com.artpri.artist.model.ArtistAlbumCategory;

/**
 * 艺术家相册分类管理逻辑处理类
 * @author 王校兵
 * @version 1.0, 2016年4月1日
 */
public interface AlbumCategoryMangeService {
	
	/**
	 * 添加相册分类逻辑处理方法
	 * @param category 相册分类名称
	 * @return 返回对应的逻辑跳转代码
	 * */
	public String addCategory(String category);
	
	/**
	 * 获取艺术家相册分类信息方法相册分类信息包括：类别和该类别下的图片的数量
	 * @return 查询出的艺术家相册分类集合
	 * */
	public List getCategory();
	
	/**
	 * 删除艺术家相册分类逻辑处理方法
	 * @param delId 要删除艺术家相册分类的id
	 * @return 返回视图对应的逻辑代码
	 * */
	public String delCategory(int delId);
	
	/**
	 * 更新艺术家相册分类信息
	 * @param id 艺术家分类信息id
	 * @param category 艺术家相册分类名称
	 * */
	public String updateCategory(int id, String category);

}
