/**
 * 
 */
package com.artpri.offical.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.UserInfoDao;
import com.artpri.offical.model.UserInfo;
import com.artpri.offical.service.UserInfoService;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月11日下午1:34:13
 * @version 1.0
 */

@Service("userInfoService")
public class UserInfoServiceImol extends BaseServiceImpl<UserInfo> implements UserInfoService{

	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public String getUserNameByUserNum(int userNum) {
		
		return userInfoDao.getUserNameByUserNum(userNum);
	}

	@Override
	public String getUserPictureByUserNum(int userNum) {

		return userInfoDao.getUserPictureByUserNum(userNum);
	}
	
	

}
