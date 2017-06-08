/**
 * 
 */
package com.artpri.artist.dao.impl;

import java.util.List;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.dao.WiningExperienceDao;
import com.artpri.artist.model.ArtistAward;

/**
 * WiningExperienceDao类实现类
 * @author 王校兵
 * @version 1.0, 2016年3月30日
 */
@Transactional
public class WiningExperienceDaoImpl extends HibernateDaoImpl implements
		WiningExperienceDao {
	@Override
	public List getWinningExperience(int userNum, int curpage, int pageSize) {
		
		return findByPage(
				"select aaId,aaYear,aaEvent,aaUrl from ArtistAward where userNum = ?0 order by aaYear",
				curpage, pageSize, userNum);
	}

	@Override
	public int updateWinningExperience(int zhujian, String years,
			String experiense) {

		return getSessionFactory()
				.getCurrentSession()
				.createSQLQuery(
						"update artist_award set aa_year=?, aa_event=? where aa_id=? ")
				.setParameter(0, years).setParameter(1, experiense)
				.setParameter(2, zhujian).executeUpdate();
	}

	@Override
	public void deleteWinningExperience(int shanchu) {

		delete(ArtistAward.class, shanchu);
	}

	@Override
	public int getWinningExperienceRowCount(int userNum) {
		
		return findRowCount("select count(*) from ArtistAward where userNum = ?0", userNum);
	}

	@Override
	public List<ArtistAward> getExistExperience(int userNum, String year) {
		return find("from ArtistAward where userNum= ?0 and aaYear= ?1", userNum, year);
	}

	@Override
	public void saveExperience(ArtistAward aa) {
		
		update(aa);
	}
	
}
