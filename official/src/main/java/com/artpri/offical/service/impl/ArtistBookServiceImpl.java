/**
 * 
 */
package com.artpri.offical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistBookDao;
import com.artpri.offical.model.ArtistBook;
import com.artpri.offical.service.ArtistBookService;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月10日下午5:59:17
 * @version 1.0
 */

@Service("artistBookService")
public class ArtistBookServiceImpl extends BaseServiceImpl<ArtistBook>
		implements ArtistBookService {
	
	@Autowired
	private ArtistBookDao artistBookDao;

	@Override
	public List<ArtistBook> getHomePageBookByUserNum(int userNum) {
		return artistBookDao.getHomePageBookByUserNum(userNum);
	}
	@Override
	public List<ArtistBook> getallBookByUserNum(int userNum){
		return artistBookDao.getallBookByUserNum(userNum);
	}
	@Override
	public List<ArtistBook> getBookInfoById(int bookId){
		return artistBookDao.getBookInfoById(bookId);
	}
	

	
}
