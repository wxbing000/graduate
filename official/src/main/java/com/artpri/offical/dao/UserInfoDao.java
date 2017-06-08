/**
 * 
 */
package com.artpri.offical.dao;

import com.artpri.offical.model.UserInfo;

/**
 * <p>Description: 用户信息Dao</p>
 * @author 王校兵
 * @time 2016年9月11日下午1:32:03
 * @version 1.0
 */

public interface UserInfoDao extends BaseDao<UserInfo> {

	/**
	 * 根据用户编码获取用户的用户名
	 * @param userNum 用户编码
	 * @return 返回用户名
	 * */
	public String getUserNameByUserNum(int userNum);
	
	/**
	 * 根据用户编码获取用户的头像
	 * @param userNum 用户编码
	 * @return 返回查询出的头像的url
	 * */
	public String getUserPictureByUserNum(int userNum);
	
}
