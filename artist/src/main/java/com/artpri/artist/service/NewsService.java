/**
 *
 */
package com.artpri.artist.service;

import java.util.List;

import com.artpri.artist.model.ArtistNews;

/**
 * @author 王校兵
 * @version 1.0, 2017年2月17日
 */
public interface NewsService {

    public void addNews(String newsTitle, String newsContent, String newsDigest, String newsResource);

    public List allNews();

    public ArtistNews findNew(int anId);

    public void delNew(int newsId);
}
