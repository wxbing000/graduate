/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

/**
 * 艺术家个人信息管理数据库操作类
 * 个人信息管理包括：个人简介、参展经历、获奖经历
 * @author 王校兵
 * @version 1.0, 2016年3月18日
 */
public interface BaseInfoManageDao {
	
	/**
	 * 查询数据库中是否存在当前用户的个人简介信息
	 * @param userNum 用户的编号
	 * @return 有关用户的个人简介数据
	 * */
	public List isSubmitIntroduct(int userNum);
	
	/**
	 * 向数据库中插入艺术家个人简介
	 * @param userNum 艺术家编号
	 * @param info 个人简介
	 * @return 返回更新成功的行数
	 * */
	public int insertInfo(int userNum, String info);
	
}
