/**
 * 
 */
package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.dao.BaseDao;
import com.artpri.offical.model.ArtistRecommend;
import com.artpri.offical.pojo.RecommendGoods;

/**
 * <p>Description:获取用户官网首页的轮播和推荐作品轮播</p>
 * @author 王校兵
 * @time 2016年9月10日下午1:35:50
 * @version 1.0
 */

public interface ArtistRecommendService extends BaseService<ArtistRecommend> {

	/**
	 * 根据用户编码查询首页轮播的作品<br/>
	 * 联合查询用户推荐表，商品表，和商品相册表，取用户推荐表的作品编号，商品表的商品名称，商品相册表的商品主图片的路径
	 * @param userNum 艺术家的编码
	 * @param recommendType 要获取的推荐的类型（作品图片为paint，新闻为news）
	 * @param recommendPosition 推荐作品的位置从上到下为1-5
	 * @return 查询出的 RecommendGoods 集合
	 * */
	public List<RecommendGoods> getUserRecommendGoods(int userNum, String recommendType, int recommendPosition);
	
}
