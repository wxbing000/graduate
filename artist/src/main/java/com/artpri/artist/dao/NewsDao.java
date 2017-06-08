/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

import com.artpri.artist.model.ArtistNews;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2017年2月17日
 */
public interface NewsDao {
	public void addNews(ArtistNews a);
	public List allNews();
	public List findNew(int anId);
	public void delNew(int newsId);
}
