/**
 * 
 */
package com.artpri.offical.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistInfoDao;
import com.artpri.offical.model.ArtistInfo;
import com.artpri.offical.service.ArtistInfoService;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月10日下午7:55:55
 * @version 1.0
 */

@Service("artistInfoService")
public class ArtistInfoServiceImpl extends BaseServiceImpl<ArtistInfo>
		implements ArtistInfoService {
	
	@Autowired
	private ArtistInfoDao artistInfoDao;

	@Override
	public ArtistInfo getHomepageInfoByUserNum(int userNum) {
		return artistInfoDao.getHomepageInfoByUserNum(userNum);
	}

	@Override
	public String getIntroductByUserNum(int userNum) {

		return artistInfoDao.getIntroductByUserNum(userNum);
	}

	
}
