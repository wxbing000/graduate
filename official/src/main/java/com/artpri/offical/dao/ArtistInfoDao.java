/**
 * 
 */
package com.artpri.offical.dao;

import com.artpri.offical.model.ArtistInfo;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author 王校兵
 * @time 2016年9月5日下午8:00:54
 * @version 1.0
 */

public interface ArtistInfoDao extends BaseDao<ArtistInfo> {

	/**
	 * 根据用户名查找首页上用户的基本信息
	 * @param userNum 用户名
	 * @return  返回查询出的数据
	 * */
	public ArtistInfo getHomepageInfoByUserNum(int userNum);
	
	/**
	 * 根据用户编号查找用户的简介
	 * @param userNum 用户编码
	 * @return 返回查询出的用户的个人简介
	 * */
	public String getIntroductByUserNum(int userNum);
	
}
