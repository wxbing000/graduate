/**
 * 
 */
package com.artpri.offical.dao;

import java.util.List;

import com.artpri.offical.model.ArtistNews;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author 王校兵
 * @time 2016年9月5日下午7:58:37
 * @version 1.0
 */

public interface ArtistNewsDao extends BaseDao<ArtistNews> {

	/**
	 * 根据用户名获取首页上的新闻资讯
	 * @param userNum 用户名
	 * @return 查询出的首页上的新闻资讯
	 * */
	public List getHomePageNewsByUserNum(int userNum);
	
	/**
	 * 根据用户名获取首页上的评论
	 * @param userNum 用户名
	 * @return 查询出的首页上的评论
	 * */
	public List getHomePageCommentByUserNum(int userNum);
	/**
	 * 根据用户名获取新闻页面上的新闻资讯
	 * @param userNum 用户名
	 * @return 查询出的新闻页面上的新闻资讯
	 * */
	public List<ArtistNews> getNewsPageNewsByUserNum(int userNum);
	/**
	 * 根据资讯id查询单条资讯的详细信息
	 * @param anId 资讯id
	 * @return 查询单条资讯的详细信息
	 * */
	public List<ArtistNews> getNewsinfoById(int anId);
}
