/**
 * 
 */
package com.artpri.offical.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistBookDao;
import com.artpri.offical.model.ArtistBook;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月10日下午5:58:09
 * @version 1.0
 */
@Repository
public class ArtistBookDaoImpl extends BaseDaoImpl<ArtistBook> implements
		ArtistBookDao {

	/**
	 * 
	*方法描述：
	*@author: 田坤
	*@input: userNum 用户id
	*@return: 首页出版著作列表（著作id,著作名称,著作图片）
	*@date： 日期：2017年2月1日 时间：上午10:31:11
	*@Description:
	 */
	@Override
	public List<ArtistBook> getHomePageBookByUserNum(int userNum) {
		
		//对应的SQL语句
		//select ab.book_id, ab.book_name, ab.book_picture_path from artist_book ab 
		//where ab.user_num = '100001' and ab.book_show_state = '1'
		
		/*校兵哥的版本
		 * String hql = "select new com.artpri.offical.model.ArtistBook(ab.bookId, ab.bookName, ab.bookPicturePath) from  "
				+ " ArtistBook ab where ab.userNum = ?0 and ab.bookShowState = '1' ";*/
		//我的版本
		String hql = "from ArtistBook ab where ab.userNum = ?0 and ab.bookShowState = '1' ";
		
		//return getEntitlList(hql, userNum);
		return (List<ArtistBook>)getQuery(hql, userNum).setFirstResult(0).setMaxResults(4).list();
	}
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:userNum 用户id
	*@return:著作页面所有图书列表（著作id,著作名称,著作图片）
	*@date： 日期：2017年2月1日 时间：上午10:31:11
	*@Description:
	 */
	@Override
	public List<ArtistBook> getallBookByUserNum(int userNum){
		//我的版本
		String hql = "from ArtistBook ab where ab.userNum = ?0 and ab.bookShowState = '1' ";
				
		return getEntitlList(hql, userNum);
	}
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:bookId 图书id
	*@return:单个图书的详细信息
	*@date： 日期：2017年2月1日 时间：上午10:31:11
	*@Description:
	 */
	@Override
	public List<ArtistBook> getBookInfoById(int bookId){
		String hql="from ArtistBook ab where ab.bookId = ?0 ";
		return getEntitlList(hql, bookId);
	}
	
	
}
