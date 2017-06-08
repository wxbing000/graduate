/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

import com.artpri.artist.model.ArtistBook;

/**
 * 艺术家著作管理数据库操作类包括著作的增删改查
 * @author 王校兵
 * @version 1.0, 2016年4月11日
 */
public interface PublicBookMangeDao {

	/**
	 * 保存艺术家上传的著作信息
	 * @param ab 艺术家著作对象
	 * @return 序列化信息
	 * */
	public int savePublicBook(ArtistBook ab);
	
	/**
	 * 取到当前艺术家上传的著作的总行数
	 * @param userNum 用户编码
	 * */
	public int getPublicBookRowCount(int userNum);
	
	/**
	 * 根据页码和页面大小获取著作数据
	 * @param userNum 艺术家编码
	 * @param pageNow 当前的页面数
	 * @param pageSize 当前的页面的数据大小
	 * */
	public List<ArtistBook> getPublicBookByPage(int userNum, int pageNow, int pageSize);
	
	/**
	 * 根据id获取艺术家的著作的所有的信息
	 * @param id 要查询的著作的主键
	 * @return ArtistBook著作的对象
	 * */
	public ArtistBook getArtistBook(int id);
	
	/**
	 * 删除数据库中的艺术家著作信息
	 * */
	public void delPublicBook(int delId);
	
	/**
	 * 更新艺术家著作信息方法
	 * @param ab 艺术家著作对象
	 * */
	public void updatePublicBook(ArtistBook ab);
}
