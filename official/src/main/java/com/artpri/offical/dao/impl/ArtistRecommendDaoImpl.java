/**
 * 
 */
package com.artpri.offical.dao.impl;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistRecommendDao;
import com.artpri.offical.model.ArtistRecommend;
import com.artpri.offical.pojo.RecommendGoods;
import com.artpri.offical.pojo.RecommendNews;
/**
 * <p>
 * Description: 获取用户官网首页的轮播和推荐作品轮播
 * </p>
 * 
 * @author 王校兵
 * @time 2016年9月10日下午1:37:14
 * @version 1.0
 */

@Repository
public class ArtistRecommendDaoImpl extends BaseDaoImpl<ArtistRecommend>
		implements ArtistRecommendDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<RecommendGoods> getUserRecommendGoods(int userNum,
			String recommendType, int recommendPosition) {
		// 查询使用的sql语句，需翻译成hql语句
		String sql = "select ar.recommend_num goodNum,ga.ga_path url,g.goods_name name from artist_recommend ar, goods_album ga,goods g"
				+ " where ar.user_num = ?0 and ar.recommend_type = ?1 "
				+ " and ar.recommend_num = ga.goods_num and ga.ga_main='1'"
				+ " and g.goods_num=ar.recommend_num and ar.recommend_position = ?2 order by ar.recommend_order";

//		String hql = " select new com.artpri.offical.pojo.RecommendGoods( ar.recommendNum , ga.gaPath, g.goodsName ) "
//				+ " from ArtistRecommend ar, GoodsAlbum ga, Goods g "
//				+ " where ar.userNum = ?0, and ar.recommendType = ?1 "
//				+ " and ar.recommendNum = ga.goodsNum and ga.gaMain = '1' "
//				+ " and g.goodsNum = ar.recommendNum and ar.recommendPosition = ?2 order by ar.recommendOrder";

		return (List<RecommendGoods>) getSQLQuery(sql, userNum, recommendType, recommendPosition).setResultTransformer(
				Transformers.aliasToBean(RecommendGoods.class)).list();
		
		
		 //return (List<RecommendGoods>)getQuery(hql, userNum, recommendType, recommendPosition).list();
	}

	@Override
	public List<RecommendNews> getUserRecommendNews() {
		// TODO Auto-generated method stub
		return null;
	}

}
