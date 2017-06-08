/**
 * 
 */
package com.artpri.artist.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.dao.AlbumCategoryMangeDao;
import com.artpri.artist.model.ArtistAlbumCategory;

/**
 * 艺术家相册分类管理数据库操作类AlbumCategoryMangeDao类实现类
 * 
 * @author 王校兵
 * @version 1.0, 2016年4月1日
 */
@Transactional
public class AlbumCategoryMangeDaoImpl extends HibernateDaoImpl implements
		AlbumCategoryMangeDao {

	@Override
	public int getExistscategory(int userNum, String category) {

		return getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"from ArtistAlbumCategory where userNum=? and aacName=? ")
				.setParameter(0, userNum).setParameter(1, category).list()
				.size();
	}

	@Override
	public int saveCategory(ArtistAlbumCategory aac) {

		return (Integer) save(aac);
	}

	@Override
	public List getCategory(int userNum) {

		/*
		 * return getSessionFactory() .getCurrentSession() .createSQLQuery(
		 * "select aac.aac_id, aac.aac_name,count(*) " +
		 * " from artist_album as aa, artist_album_category as aac " +
		 * " where aac.aac_id=aa.aac_id and aac.user_num='100001' " +
		 * " group by aac.aac_name,aac.aac_id") .setParameter(0,
		 * userNum).list();
		 */

		return getSessionFactory()
				.getCurrentSession()
				.createSQLQuery(
						"select aac.aac_id,aac.aac_name, COUNT(aa.aac_id) "
						+ " from artist_album_category as aac left join artist_album as aa on aa.aac_id = aac.aac_id "
						+ " where  aac.user_num = ? GROUP BY (aac.aac_name) ")
				.setParameter(0, userNum).list();
	}

	@Override
	public void delCategory(int delId) {
		delete(ArtistAlbumCategory.class, delId);
	}

	@Override
	public void updateCategory(int id, String category) {
		getSessionFactory().getCurrentSession().createSQLQuery("update artist_album_category set aac_name=? where aac_id=? ")
		.setParameter(0, category).setParameter(1, id).executeUpdate();
	}

}
