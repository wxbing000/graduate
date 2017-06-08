/**
 * 
 */
package com.artpri.offical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistNewsDao;
import com.artpri.offical.model.ArtistNews;
import com.artpri.offical.pojo.HomePageNews;
import com.artpri.offical.service.ArtistNewsService;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月10日下午5:44:57
 * @version 1.0
 */

@Service("artistNewsService")
public class ArtistNewsServiceImpl extends BaseServiceImpl<ArtistNews> implements
		ArtistNewsService {
	
	@Autowired
	private ArtistNewsDao artistNewsDao;

	@Override
	public List<HomePageNews> getHomePageNewsByUserNum(int userNum) {
		return artistNewsDao.getHomePageNewsByUserNum(userNum);
	}

	@Override
	public List<HomePageNews> getHomePageCommentByUserNum(int userNum) {
		return artistNewsDao.getHomePageCommentByUserNum(userNum);
	}
	@Override
	public List<ArtistNews> getNewsPageNewsByUserNum(int userNum){
		return artistNewsDao.getNewsPageNewsByUserNum(userNum);
	}
	@Override
	public List<ArtistNews> getNewsinfoById(int anId){
		return artistNewsDao.getNewsinfoById(anId);
	}

	

}
