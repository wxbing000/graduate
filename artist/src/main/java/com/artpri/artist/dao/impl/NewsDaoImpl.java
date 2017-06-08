/**
 * 
 */
package com.artpri.artist.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.dao.NewsDao;
import com.artpri.artist.model.ArtistNews;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2017年2月17日
 */
@Transactional
public class NewsDaoImpl extends HibernateDaoImpl<ArtistNews> implements NewsDao {

	@Override
	public void addNews(ArtistNews a) {
		save(a);
	}

	@Override
	public List allNews() {
		return find("from ArtistNews");
		
	}

	@Override
	public List findNew(int anId) {
		return find("from ArtistNews where anId ="+anId);
	}

	@Override
	public void delNew(int newsId) {
		delete(ArtistNews.class, newsId);
	}
	
	

}
