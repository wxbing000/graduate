/**
 * 
 */
package com.artpri.offical.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistTopDao;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.service.ArtistTopService;

/**
 * <p>Description: 获取用户官网首页的顶部的图片的信息</p>
 * @author 王校兵
 * @time 2016年9月10日下午1:40:45
 * @version 1.0
 */
@Service("artistTopService")
public class ArtistTopServiceImpl extends BaseServiceImpl<ArtistTop> implements
		ArtistTopService {

	@Autowired
	private ArtistTopDao artistTopDao;
	
	@Override
	public ArtistTop getArtistTopByUserNum(int userNum) {
		return artistTopDao.getArtistTopByUserNum(userNum);
	}

}
