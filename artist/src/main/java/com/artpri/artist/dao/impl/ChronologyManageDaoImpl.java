/**
 * 
 */
package com.artpri.artist.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.dao.ChronologyManageDao;
import com.artpri.artist.model.ArtistChronology;

/**
 * ChronologyManageDao实现类
 * @author 王校兵
 * @version 1.0, 2016年3月30日
 */
@Transactional
public class ChronologyManageDaoImpl extends HibernateDaoImpl implements
		ChronologyManageDao {

	@Override
	public void deleteChronology(int artistId) {
		delete(ArtistChronology.class, artistId);
	}

	@Override
	public int getChronologyRowCount(int userNum) {
		return findRowCount(
				"select count(*) from ArtistChronology where userNum = ?0",
				userNum);
	}

	@Override
	public List getChronology(int userNum, int pageNow, int pageSize) {
		return findByPage(
				"select acId,acYear,acEvent from ArtistChronology where userNum = ?0 ",
				pageNow, pageSize, userNum);
	}

	@Override
	public int updateChronology(int artistId, String year, String info) {
		return getSessionFactory()
				.getCurrentSession()
				.createSQLQuery(
						"update artist_chronology set ac_year=?, ac_event=? where ac_id=? ")
				.setParameter(0, year).setParameter(1, info).setParameter(2, artistId).executeUpdate();
	}

	@Override
	public void saveChronology(ArtistChronology ac) {
		update(ac);
	}

	@Override
	public List<ArtistChronology> getExitsChonology(int userNum, String year) {
		return find("from ArtistChronology where userNum = ?0 and acYear = ?1", userNum, year);
	}

}
