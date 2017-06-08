/**
 * 
 */
package com.artpri.offical.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistAwardDao;
import com.artpri.offical.model.ArtistAward;

/**
 * <p>Description: 艺术家获奖信息数据库操作类 </p>
 * @author 王校兵
 * @time 2016年9月10日下午8:31:59
 * @version 1.0
 */

@Repository
public class ArtistAwardDaoImpl extends BaseDaoImpl<ArtistAward> implements
		ArtistAwardDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<ArtistAward> getHomePageInfoByUserNum(int userNum) {
		
		String hql = "from ArtistAward where userNum = ?0";
		
		return (List<ArtistAward>)getQuery(hql, userNum).setFirstResult(0).setMaxResults(2).list();
	}

	@Override
	public List<ArtistAward> getAllAwardByUserNum(int userNum) {

		String hql = "from ArtistAward where userNum = ?0";
		
		return getEntitlList(hql, userNum);
	}


}
