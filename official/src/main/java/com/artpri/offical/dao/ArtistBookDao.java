/**
 * 
 */
package com.artpri.offical.dao;

import java.util.List;

import com.artpri.offical.model.ArtistBook;

/**
 * <p>Title: </p>
 * <p>Description: ArtistBookDao艺术家著作数据操作类</p>
 * <p>Company: </p>
 * @author 王校兵
 * @time 2016年9月5日下午7:54:58
 * @version 1.0
 */

public interface ArtistBookDao extends BaseDao<ArtistBook>{

	/**
	 * 根据用户的编号获取首页上的图书的信息
	 * @param userNum 用户编号
	 * @return 返回查询出的用户的著作的集合
	 * */
	public List<ArtistBook> getHomePageBookByUserNum(int userNum);
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:userNum 用户id
	*@return:著作页面所有图书列表（著作id,著作名称,著作图片）
	*@date： 日期：2017年2月1日 时间：上午10:31:11
	*@Description:
	 */
	public List<ArtistBook> getallBookByUserNum(int userNum);
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:bookId 图书id
	*@return:单个图书的详细信息
	*@date： 日期：2017年2月1日 时间：上午10:31:11
	*@Description:
	 */
	public List<ArtistBook> getBookInfoById(int bookId);
	
}
