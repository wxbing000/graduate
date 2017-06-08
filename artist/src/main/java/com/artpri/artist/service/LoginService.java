/**
 * 
 */
package com.artpri.artist.service;

/**
 * 验证当前用户身份逻辑处理类
 * @author 王校兵
 * @version 1.0, 2016年3月19日
 */
public interface LoginService {

	/**
	 * 检查用户的账号和密码是否和数据库对应逻辑处理方法
	 * @param userName 用户输入的账号
	 * @param pass 用户输入的密码
	 * @return 返回登录信息
	 * */
	public int loginValidate(String userName, String pass);
	
}
