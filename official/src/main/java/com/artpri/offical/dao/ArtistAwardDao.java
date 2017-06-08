/**
 * 
 */
package com.artpri.offical.dao;

import java.util.List;

import com.artpri.offical.model.ArtistAward;

/**
 * <p>Title: </p>
 * <p>Description: 艺术家获奖信息数据库操作类</p>
 * <p>Company: </p>
 * @author 王校兵
 * @time 2016年9月5日下午7:59:33
 * @version 1.0
 */

public interface ArtistAwardDao extends BaseDao<ArtistAward> {
	
	/**
	 * 根据用户名获取首页上的用户获奖信息(只获取两条)
	 * @param userNum 用户名
	 * @return 查询出的用户获奖信息
	 * */
	public List<ArtistAward> getHomePageInfoByUserNum(int userNum);
	
	
	/**
	 * 根据用户编码获取用户所有的获奖信息(获取所有的获奖信息)
	 * @param userNum 用户名
	 * @return 返回所有的获奖信息 
	 * */
	public List<ArtistAward> getAllAwardByUserNum(int userNum);

}
