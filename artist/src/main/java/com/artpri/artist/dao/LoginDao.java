/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

/**
 * 验证当前用户身份dao
 * @author 王校兵
 * @version 1.0, 2016年3月19日
 */
public interface LoginDao {
	
	/**
	 * 根据用户的账号查找当前用户的密码
	 * @param userName 用户输入的账号
	 * @return 用户的密码和角色代码的集合
	 * */
	public List getLoginPassAndRole(String userName);
}
