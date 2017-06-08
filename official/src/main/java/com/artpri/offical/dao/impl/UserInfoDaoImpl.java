/**
 * 
 */
package com.artpri.offical.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.UserInfoDao;
import com.artpri.offical.model.UserInfo;

/**
 * <p>Description: 根据userNum查询用户姓名和用户头像</p>
 * @author 王校兵
 * @time 2016年9月11日下午1:32:32
 * @version 1.0
 */

@Repository
public class UserInfoDaoImpl extends BaseDaoImpl<UserInfo> implements
		UserInfoDao {

	@Override
	public String getUserNameByUserNum(int userNum) {
		
		String hql = "select userRealName from UserInfo where userNum = ?0";
		
		return (String) getQuery(hql, userNum).uniqueResult();
	}

	@Override
	public String getUserPictureByUserNum(int userNum) {
		
		String hql = "select userPicture from UserInfo where userNum = ?0";
		
		return (String) getQuery(hql, userNum).uniqueResult();
	}

}
