/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

import com.artpri.artist.model.ArtistAlbumCategory;

/**
 * 艺术家相册分类管理数据库操作类
 * @author 王校兵
 * @version 1.0, 2016年4月1日
 */
public interface AlbumCategoryMangeDao {
	
	/**
	 * 判断当前保存的艺术家相册分类在数据库中是否存在
	 * @param userNum 艺术家编码
	 * @param category 分类名称
	 * @return 查询出的数据的行数
	 * */
	public int getExistscategory(int userNum, String category);
	
	/**
	 * 向数据库中保存艺术家相册分类方法
	 * @param aac 艺术家相册分对象
	 * @return 保存成功后的序列化信息
	 * */
	public int saveCategory(ArtistAlbumCategory aac);
	
	/**
	 * 获取数据库中指定的艺术家的所有的相册分类信息
	 * @param userNum 艺术家编码
	 * @return 查询出的List集合
	 * */
	public List getCategory(int userNum);
	
	/**
	 * 删除数据库中艺术家相册分类信息的数据库操作方法
	 * @param delId 要删除的艺术家相册的id
	 * */
	public void delCategory(int delId);
	
	/**
	 * 更新艺术家相册分类方法
	 * @param id 主键
	 * @param category 分类名称
	 * */
	public void updateCategory(int id, String category);
	
}
