/**
 * 
 */
package com.artpri.offical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistRecommendDao;
import com.artpri.offical.model.ArtistRecommend;
import com.artpri.offical.pojo.RecommendGoods;
import com.artpri.offical.service.ArtistRecommendService;

/**
 * <p>Description: 获取用户官网首页的轮播和推荐作品轮播</p>
 * @author 王校兵
 * @time 2016年9月10日下午1:39:35
 * @version 1.0
 */
@Service("artistRecommendService")
public class ArtistRecommendServiceImpl extends BaseServiceImpl<ArtistRecommend>
		implements ArtistRecommendService {
	
	@Autowired
	private ArtistRecommendDao artistRecommendDao;

	@Override
	public List<RecommendGoods> getUserRecommendGoods(int userNum,
			String recommendType, int recommendPosition) {
		return artistRecommendDao.getUserRecommendGoods(userNum, recommendType, recommendPosition);
	}

}
