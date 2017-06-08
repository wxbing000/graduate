/**
 * 
 */
package com.artpri.offical.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistChronologyDao;
import com.artpri.offical.model.ArtistChronology;

/**
 * <p>Description: 艺术家创作经历</p>
 * @author 王校兵
 * @time 2016年9月10日下午8:04:51
 * @version 1.0
 */

@Repository
public class ArtistChronologyDaoImpl extends BaseDaoImpl<ArtistChronology>
		implements ArtistChronologyDao {

	@Override
	public List<ArtistChronology> getHomePageInfoByUserNum(int userNum) {
		
		String hql = "from ArtistChronology where userNum = ?0";
		
		return (List<ArtistChronology>)getQuery(hql, userNum).setFirstResult(0).setMaxResults(1).list();
	}

	@Override
	public List<ArtistChronology> getAllChronologyByUserNum(int userNum) {
		
		String hql = " from ArtistChronology where userNum = ?0";
		
		return getEntitlList(hql, userNum);
	}

	

}
