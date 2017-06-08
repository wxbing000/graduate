/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

import com.artpri.artist.model.ArtistAlbum;

/**
 * 艺术家相册图片管理数据库操作类
 * 
 * @author 王校兵
 * @version 1.0, 2016年4月3日
 */
public interface AlbumPhotoMangeDao {

	/**
	 * 获取当前艺术家所有的相册分类数据库操作方法
	 * @param userNum 用户编码
	 * @return 查询出的艺术家相册分类list集合
	 * */
	public List getAlbumCategory(int userNum);
	
	/**
	 * 保存艺术家提交的照片信息
	 * @param aa ArtistAlbum对象
	 * @return 序列化信息
	 * */
	public int saveAlbumPhoto(ArtistAlbum aa);
	
	/**
	 * 获取数据库中当前艺术家提交的所有的年代信息
	 * @param userNum 用户编码
	 * @return 查询出的当前艺术家所有的年代信息的集合
	 * */
	public List getPhotoYears(int userNum);
	
	/**
	 * 通过相册分类查询相册照片action方法
	 * @param userNum 艺术家编码
	 * @param queryCategory 相册分类名称
	 * @return 照片的查询结果集合
	 * */
	public List getPhotoByCategory(int userNum, int queryCategory);

	/**
	 * 通过拍摄时间查询相册照片action方法
	 * @param userNum 艺术家编码
	 * @param queryTime 拍摄时间
	 * @return 照片的查询结果集合
	 * */
	public List getPhotoByTime(int userNum, String queryTime);
	
	/**
	 * 通过照片标题查询相册照片action方法
	 * @param userNum 艺术家编码
	 * @param queryTitle 照片标题
	 * @return 照片的查询结果集合
	 * */
	public List getPhotoByTitle(int userNum, String queryTitle);
	
	/**
	 * 通过照片主键id查询相册照片action方法
	 * @param id 主键id
	 * @return 照片的查询结果集合
	 * */
	public ArtistAlbum getPhotoById(int id);

	/**
	 * 根据主键id删除艺术家相册信息
	 * @param delInfoId 要删除的相册图片的id
	 * */
	public void delPhotoInfo(int delInfoId);
	
	/**
	 * 更新艺术家个人相册信息
	 * @param aa ArtistAlbum对象
	 * */
	public void updateAlbumInfo(ArtistAlbum aa);
}
