/**
 * 
 */
package com.artpri.artist.service;

import java.util.List;

/**
 * 艺术家个人主页个人基础信息管理类管理逻辑操作类
 * 个人信息管理包括：个人简介、参展经历、获奖经历
 * @author 王校兵
 * @version 1.0, 2016年3月18日
 */
public interface BaseInfoManageService {
	
	/**
	 * 判断该艺术家是否曾经上传过个人简介
	 * @return 返回查询出来的结果集
	 * */
	public List isSubmitIntroduct();
	
	/**
	 * 艺术家提交或者更新自己的个人简介
	 * @param info 艺术家的个人简介
	 * @return 返回更新成功 "success"或者失败 "failed"
	 * */
	public String insertIntroduct(String info);
	
}
