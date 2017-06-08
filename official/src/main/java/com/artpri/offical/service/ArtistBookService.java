/**
 * 
 */
package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.model.ArtistBook;

/**
 * <p>Description: 图书信息的逻辑操作类</p>
 * @author 王校兵
 * @time 2016年9月10日下午5:58:51
 * @version 1.0
 */

public interface ArtistBookService extends BaseService<ArtistBook> {

	/**
	 * 根据用户的编号获取首页上的图书的信息
	 * @param userNum 用户编号
	 * @return 返回查询出的用户的著作的集合
	 * */
	public List<ArtistBook> getHomePageBookByUserNum(int userNum);
	/**
	 * 根据用户的编号获取图书页面上的图书的信息
	 * @param userNum 用户编号
	 * @return 返回查询出的用户的著作的集合
	 * */
	public List<ArtistBook> getallBookByUserNum(int userNum);
	/**
	 * 根据图书的编号获取图书的详细信息
	 * @param bookID 图书编号
	 * @return 返回查询出的图书的详细信息
	 * */
	public List<ArtistBook> getBookInfoById(int bookId);
	
}
