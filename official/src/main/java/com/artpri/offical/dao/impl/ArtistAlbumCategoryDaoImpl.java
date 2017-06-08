/**
 * 
 */
package com.artpri.offical.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistAlbumCategoryDao;
import com.artpri.offical.model.ArtistAlbumCategory;

/**
 * <p>Description: 根据艺术家的userNum获得艺术家的相册分类列表</p>
 * @author 王校兵
 * @time 2016年9月12日下午6:23:48
 * @version 1.0
 */

@Repository
public class ArtistAlbumCategoryDaoImpl extends
		BaseDaoImpl<ArtistAlbumCategory> implements ArtistAlbumCategoryDao {

	@Override
	public List<ArtistAlbumCategory> getUniqueCategoryNameByName(int userNum) {

		/*String sql = "select distinct ac.aac_id ac.aac_name "
				+ " from artist_album aa, artist_album_category ac "
				+ " where aa.user_num = ?0 and aa.aac_id = ac.aac_id ";
		
		
		
		return getSQLQuery(sql, userNum).list();*/
		String hql = "select distinct ac "
				+ " from ArtistAlbum aa, ArtistAlbumCategory ac "
				+ " where aa.userNum = ?0 and aa.aacId = ac.aacId ";
		
		
		
		return getEntitlList(hql, userNum);
	}

}
