/**
 * 
 */
package com.artpri.offical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistChronologyDao;
import com.artpri.offical.model.ArtistChronology;
import com.artpri.offical.service.ArtistChronologyService;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月10日下午8:07:26
 * @version 1.0
 */

@Service("artistChronologyService")
public class ArtistChronologyServiceImpl extends
		BaseServiceImpl<ArtistChronology> implements ArtistChronologyService {

	@Autowired
	private ArtistChronologyDao artistChronologyDao;
	
	@Override
	public List<ArtistChronology> getHomePageInfoByUserNum(int userNum) {
	
		return artistChronologyDao.getHomePageInfoByUserNum(userNum);
	}

	@Override
	public List<ArtistChronology> getAllChronologyByUserNum(int userNum) {

		return artistChronologyDao.getAllChronologyByUserNum(userNum);
	}
	
}
