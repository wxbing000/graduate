/**
 * 
 */
package com.artpri.offical.dao;

import java.util.List;

import com.artpri.offical.model.ArtistAlbumCategory;

/**
 * <p>Description: ArtistAlbumCategory 艺术家相册分类</p>
 * @author 王校兵
 * @time 2016年9月12日下午6:22:43
 * @version 1.0
 */

public interface ArtistAlbumCategoryDao extends BaseDao<ArtistAlbumCategory> {

	/**
	 * 根据用户名获取用户相册的唯一分类
	 * @param userNum 用户名
	 * @return 返回查询出的指定用户的相册的唯一分类
	 * */
	public List<ArtistAlbumCategory> getUniqueCategoryNameByName(int userNum);
	
}
