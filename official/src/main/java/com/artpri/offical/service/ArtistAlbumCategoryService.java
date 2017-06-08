/**
 * 
 */
package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.model.ArtistAlbumCategory;

/**
 * <p>Description: ArtistAlbumCategoryService 艺术家相册分类逻辑处理类</p>
 * @author 王校兵
 * @time 2016年9月12日下午6:24:24
 * @version 1.0
 */

public interface ArtistAlbumCategoryService extends
		BaseService<ArtistAlbumCategory> {

	/**
	 * 根据用户名获取用户相册的唯一分类
	 * @param userNum 用户名
	 * @return 返回查询出的指定用户的相册的唯一分类
	 * */
	public List<ArtistAlbumCategory> getUniqueCategoryNameByName(int userNum);
	
}
