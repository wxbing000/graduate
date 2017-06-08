/**
 * 
 */
package com.artpri.artist.service;

import java.io.File;
import java.util.List;

import com.artpri.artist.model.ArtistAlbum;

/**
 * 艺术家相册图片管理逻辑处理类
 * @author 王校兵
 * @version 1.0, 2016年4月3日
 */
public interface AlbumPhotoMangeService {

	/**
	 * 获取当前艺术家所有的相册分类逻辑处理方法
	 * @return 查询出的艺术家相册分类list集合
	 * */
	public List getAlbumCategory();
	
	/**
	 * 上传艺术家相册图片信息逻辑处理类
	 * @param categoryId 艺术家相册分类主键
	 * @param name 图片名称
	 * @param year 图片拍摄年代
	 * @param photo 图片文件对象
	 * @param photoContentType 图片文件类型
	 * @param explain 图片的拍摄说明
	 * @return 处理结果
	 * */
	public String uploadAlbumPhoto(int categoryId, String name, String year, File photo, String photoContentType, String explain);
	
	/**
	 * 获取当前艺术家所有的相册年代逻辑处理方法
	 * @return 查询出的艺术家相册时间的list集合
	 * */
	public List getPhotoYears();
	
	/**
	 * 通过相册分类查询相册照片action方法
	 * @param queryCategory 相册分类名称
	 * @return 照片的查询结果集合
	 * */
	public List getPhotoByCategory(int queryCategory);

	/**
	 * 通过拍摄时间查询相册照片action方法
	 * @param queryTime 拍摄时间
	 * @return 照片的查询结果集合
	 * */
	public List getPhotoByTime(String queryTime);
	
	/**
	 * 通过照片标题查询相册照片action方法
	 * @param queryTitle 照片标题
	 * @return 照片的查询结果集合
	 * */
	public List<ArtistAlbum> getPhotoByTitle(String queryTitle);
	
	/**
	 * 根据主键id删除艺术家相册信息和服务器上的图片
	 * @param delInfoId 要删除的相册图片的id
	 * */
	public void delPhotoInfo(int delInfoId);
	
	/**
	 * 更新艺术家相册图片信息逻辑处理方法
	 * @param albumId 艺术家相册图片主键id
	 * @param categoryId 艺术家相册分类主键
	 * @param name 图片名称
	 * @param year 图片拍摄年代
	 * @param photo 图片文件对象
	 * @param photoContentType 图片文件类型
	 * @param explain 图片的拍摄说明
	 * */
	public String updateAlbumInfo(int albumId, int categoryId, String name, String year, File photo, String photoContentType, String explain);
}
