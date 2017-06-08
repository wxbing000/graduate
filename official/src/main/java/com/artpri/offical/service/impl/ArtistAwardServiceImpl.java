/**
 * 
 */
package com.artpri.offical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistAwardDao;
import com.artpri.offical.model.ArtistAward;
import com.artpri.offical.service.ArtistAwardService;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月10日下午8:33:18
 * @version 1.0
 */

@Service("artistAwardService")
public class ArtistAwardServiceImpl extends BaseServiceImpl<ArtistAward>
		implements ArtistAwardService {

	@Autowired
	private ArtistAwardDao artistAwardDao;

	@Override
	public List<ArtistAward> getHomePageInfoByUserNum(int userNum) {
	
		return artistAwardDao.getHomePageInfoByUserNum(userNum);
	}

	@Override
	public List<ArtistAward> getAllAwardByUserNum(int userNum) {

		return artistAwardDao.getAllAwardByUserNum(userNum);
	}

}
