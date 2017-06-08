/**
 * 
 */
package com.artpri.offical.service;

import com.artpri.offical.model.ArtistInfo;

/**
 * <p>Description: 用户个人信息逻辑操作类</p>
 * @author 王校兵
 * @time 2016年9月10日下午7:55:19
 * @version 1.0
 */

public interface ArtistInfoService extends BaseService<ArtistInfo> {
	
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
