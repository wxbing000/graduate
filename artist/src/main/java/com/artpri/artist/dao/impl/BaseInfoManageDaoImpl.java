/**
 * 
 */
package com.artpri.artist.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.dao.BaseInfoManageDao;
import com.artpri.artist.model.ArtistAward;
import com.artpri.artist.model.ArtistChronology;

/**
 * BaseInfoManageDao实现类
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月18日
 */
@Transactional
public class BaseInfoManageDaoImpl extends HibernateDaoImpl implements
		BaseInfoManageDao {

	@Override
	public List isSubmitIntroduct(int userNum) {

		return find(
				"select artistIntroduct from ArtistInfo where userNum = ?0",
				userNum);
	}

	@Override
	public int insertInfo(int userNum, String info) {

		return getSessionFactory()
				.getCurrentSession()
				.createSQLQuery(
						"update artist_info set artist_introduct = ? where user_num=? ")
				.setParameter(0, info).setParameter(1, userNum).executeUpdate();
	}

}
