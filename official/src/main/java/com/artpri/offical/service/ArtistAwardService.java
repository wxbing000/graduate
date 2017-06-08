/**
 * 
 */
package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.model.ArtistAward;

/**
 * <p>Description:获奖信息 </p>
 * @author 王校兵
 * @time 2016年9月10日下午8:32:43
 * @version 1.0
 */

public interface ArtistAwardService extends BaseService<ArtistAward> {

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
