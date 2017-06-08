/**
 * 
 */
package com.artpri.artist.dao.impl;

import com.artpri.artist.dao.PublicBookMangeDao;
import com.artpri.artist.model.ArtistBook;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2016年4月11日
 */
@Transactional
public class PublicBookMangeDaoImpl extends HibernateDaoImpl implements
		PublicBookMangeDao {

	@Override
	public int savePublicBook(ArtistBook ab) {
		return (Integer) save(ab);
	}

	@Override
	public int getPublicBookRowCount(int userNum) {
		return findRowCount(
				"select count(*) from ArtistBook where userNum = ?0",
				userNum);
	}

	@Override
	public List<ArtistBook> getPublicBookByPage(int userNum, int pageNow,
			int pageSize) {
		return findByPage(
				"from ArtistBook where userNum = ?0 ",
				pageNow, pageSize, userNum);
	}

	@Override
	public ArtistBook getArtistBook(int id) {
		return (ArtistBook) get(ArtistBook.class, id);
	}

	@Override
	public void delPublicBook(int delId) {
		delete(ArtistBook.class, delId);
	}

	@Override
	public void updatePublicBook(ArtistBook ab) {
		update(ab);
	}

}
