/**
 * 
 */
package com.artpri.offical.dao.impl;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistTopDao;
import com.artpri.offical.model.ArtistTop;

/**
 * <p>Description:艺术家官网首页顶部图片 </p>
 * @author 王校兵
 * @time 2016年9月10日下午1:38:07
 * @version 1.0
 */

@Repository
public class ArtistTopDaoImpl extends BaseDaoImpl<ArtistTop> implements
		ArtistTopDao {

	@Override
	public ArtistTop getArtistTopByUserNum(int userNum) {
		String hql = " from ArtistTop where userNum = ?0 ";
		return  getSingleEntity(hql, userNum);
	}
	
	

}
