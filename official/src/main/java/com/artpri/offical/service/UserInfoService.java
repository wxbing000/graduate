/**
 * 
 */
package com.artpri.offical.service;

import com.artpri.offical.model.UserInfo;

/**
 * <p>Description: 用户个人信息service类</p>
 * @author 王校兵
 * @time 2016年9月11日下午1:33:23
 * @version 1.0
 */

public interface UserInfoService extends BaseService<UserInfo> {

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
