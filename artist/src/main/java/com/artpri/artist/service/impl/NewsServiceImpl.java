/**
 * 
 */
package com.artpri.artist.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.model.ArtistNews;
import com.artpri.artist.service.NewsService;
import com.artpri.artist.util.TimeUtil;
import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2017年2月17日
 */

public class NewsServiceImpl extends BaseService implements NewsService {

	@Override
	public void addNews(String newsTitle, String newsContent,String newsDigest, String newsResource) {
		ArtistNews an = new ArtistNews();
		String realNum = (String)ActionContext.getContext().getSession().get("userRealNum");
        int userNum = (int)ActionContext.getContext().getSession().get("userNum");
        System.out.println("asdf sad==========" + newsResource);
        an.setNewsResource(newsResource);
        an.setUserNum(userNum);
		an.setNewsName(newsTitle);
		an.setNewsContent(newsContent);
		an.setNewsAuthor(realNum);
		an.setNewsDigest(newsDigest);
		an.setNewsTime(TimeUtil.getTimeStamp());
		an.setNewsState(1);
		getNewsDao().addNews(an);
	}

	@Override
	public List allNews() {
		return getNewsDao().allNews();
	}

	@Override
	public ArtistNews findNew(int anId) {
		List list = getNewsDao().findNew(anId);
		Iterator it = list.iterator();
		if(it.hasNext()){
			ArtistNews info = (ArtistNews) it.next();
			return info;
		}
		return null;
	}

	@Override
	public void delNew(int newsId) {
		getNewsDao().delNew(newsId);
		
	}

}
