/**
 * 
 */
package com.artpri.offical.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistAlbumDao;
import com.artpri.offical.model.ArtistAlbum;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月12日下午6:29:58
 * @version 1.0
 */

@Repository
public class ArtistAlbumDaoImpl extends BaseDaoImpl<ArtistAlbum> implements
		ArtistAlbumDao {

	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:userNum
	*@return:userNum艺术家相册所有的年份列表
	*@date： 日期：2017年2月1日 时间：上午10:31:11
	*@Description:
	 */
	@Override
	public List<String> getUniqueYearByUserNum(int userNum) {

		String sql = "select distinct aa.aa_year from artist_album aa where aa.user_num = ?0";
		
		return getSQLQuery(sql, userNum).list();
	}
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:userNum, type:相册类型,  parameter:
	*@return:userNum艺术家所有的照片总数
	*@date： 日期：2017年2月1日 时间：上午10:31:11
	*@Description: 1.查询所有的相册 2.根据相册类型查询 3.根据年份查询
	 */
	@Override
	public int getTotalPhotosNumByUserNum(int userNum, String type,
			String parameter) {
		
		//声明hql语句的String对象
		String hql = null;
		
		//查询所有分类的所有的图片的总数
		if(type.equals("all"))
		{
			//hql语句
			hql = "select count(*) from ArtistAlbum aa where aa.userNum = ?0 ";
			
			return getTotalRecordNo(hql, userNum);
		}
		
		//根据用户的相册类别查询总数
		else if(type.equals("category"))
		{
			
			hql = "select count(*) "
				+ " from ArtistAlbum aa, ArtistAlbumCategory aac  "
				+ " where aa.aacId = aac.aacId and aac.aacName = ?0 and aa.userNum = ?1 ";
		}
		
		//根据用户拍摄的时间查询图片总数
		else if(type.equals("year"))
		{
			hql = "select count(*) "
				+ "from ArtistAlbum aa	"
				+ "where  aa.aaYear = ?0 and aa.userNum = ?1";
		}
		
		return getTotalRecordNo(hql, parameter, userNum);
	}

	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:userNum,type:相册类型,parameter:？,pageNo:当前页,pageSize:总页数 
	*@return:userNum艺术家根据条件查询出相册
	*@date： 日期：2017年2月1日 时间：上午10:31:11
	*@Description:1.查询所有的相册 2.根据相册类型查询 3.根据年份查询
	 */
	@Override
	public List<ArtistAlbum> getPhotosByUserNumAndType(int userNum,
			String type, String parameter, int pageNo, int pageSize) {
		System.out.println("type:"+type);
		//声明hql语句的String对象
		String hql = null;
		
		//查询所有分类的所有的图片的总数
		if(type.equals("all"))
		{
			//hql语句
			hql = " from ArtistAlbum aa where aa.userNum = ?0 ";
			
		}
		
		//根据用户的相册类别查询总数
		else if(type.equals("category"))
		{
			
			hql = "select aa.* from ArtistAlbum aa, ArtistAlbumCategory aac "
				+ " where aa.aacId = aac.aacId and aac.aacName = ?0 and aa.userNum = ?1 ";
		}
		
		//根据用户拍摄的时间查询图片总数
		else if(type.equals("year"))
		{
			hql = "from ArtistAlbum aa where  aa.aaYear = ?0 and aa.userNum = ?1";
		}
		
		
		return getLimitedEntityList(hql, pageNo, pageSize, parameter, userNum);
	}
	@Override
	public List<ArtistAlbum> getAlbumByYear(int userNum,String year){
		String hql = "from ArtistAlbum aa where  aa.aaYear = ?0 and aa.userNum = ?1";
		return getEntitlList(hql, year,userNum);
	}
	@Override
	public List<ArtistAlbum> getAlbumByCategory(int userNum,int aacId){
		String hql = "from ArtistAlbum aa where  aa.aacId = ?0 and aa.userNum = ?1";
		return getEntitlList(hql, aacId,userNum);
	}
	@Override
	public List<ArtistAlbum> getallAlbum(int userNum){
		String hql="from ArtistAlbum where userNum=?0";
		return getEntitlList(hql, userNum);
	}

}
