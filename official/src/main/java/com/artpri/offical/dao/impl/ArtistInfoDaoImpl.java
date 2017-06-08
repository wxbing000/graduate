/**
 * 
 */
package com.artpri.offical.dao.impl;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistInfoDao;
import com.artpri.offical.model.ArtistInfo;

/**
 * <p>Description: 艺术家信息</p>
 * @author 王校兵
 * @time 2016年9月5日下午8:45:10
 * @version 1.0
 */

@Repository
public class ArtistInfoDaoImpl extends BaseDaoImpl<ArtistInfo> implements ArtistInfoDao {

	@Override
	public ArtistInfo getHomepageInfoByUserNum(int userNum) {
		//所用的SQL语句
		//select ai.user_num,ai.artist_introduct,ai.artist_historyvis, 
		//ai.artist_todayvis,ai.artist_picture from artist_info ai 
		//where ai.user_num = '100001'
		
		String hql = " from ArtistInfo ai where ai.userNum = ?0 ";
		
		return getSingleEntity(hql, userNum);
	}

	@Override
	public String getIntroductByUserNum(int userNum) {
		
		String hql = "select ai.artistIntroduct from ArtistInfo ai where ai.userNum = ?0 ";
		
		return (String) getQuery(hql, userNum).uniqueResult();
	}

}
