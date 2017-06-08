/**
 * 
 */
package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.model.ArtistNews;
import com.artpri.offical.pojo.HomePageNews;

/**
 * <p>Description: 获取用户在首页上的新闻资讯和新闻评论</p>
 * @author 王校兵
 * @time 2016年9月10日下午5:44:03
 * @version 1.0
 */


public interface ArtistNewsService extends BaseService<ArtistNews>{
	
	/**
	 * 根据用户名获取首页上的新闻资讯
	 * @param userNum 用户名
	 * @return 查询出的首页上的新闻资讯
	 * */
	public List<HomePageNews> getHomePageNewsByUserNum(int userNum);
	
	/**
	 * 根据用户名获取首页上的评论
	 * @param userNum 用户名
	 * @return 查询出的首页上的评论
	 * */
	public List<HomePageNews> getHomePageCommentByUserNum(int userNum);
	/**
	 * 根据用户名获取新闻页面上的新闻资讯
	 * @param userNum 用户名
	 * @return 查询出的新闻页面上的新闻资讯
	 * */
	public List<ArtistNews> getNewsPageNewsByUserNum(int userNum);
	/**
	 * 根据新闻id获取单条新闻的详细信息
	 * @param anId 新闻id
	 * @return 获取单条新闻的详细信息
	 * */
	public List<ArtistNews> getNewsinfoById(int anId);
}
