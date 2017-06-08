/**
 * 
 */
package com.artpri.offical.dao;

import java.util.List;

import com.artpri.offical.model.ArtistChronology;

/**
 * <p>Title: </p>
 * <p>Description: 艺术家年表Dao</p>
 * <p>Company: </p>
 * @author 王校兵
 * @time 2016年9月5日下午8:02:01
 * @version 1.0
 */

public interface ArtistChronologyDao extends BaseDao<ArtistChronology> {
	
	/**
	 * 根据用户名获取首页上的艺术家年表信息(只获取两条)
	 * @param userNum 用户名
	 * @return 查询出的艺术家年表信息
	 * */
	public List<ArtistChronology> getHomePageInfoByUserNum(int userNum);
	
	
	/**
	 * 根据用户编码获取用户所有的年表信息(获取所有的年表信息)
	 * @param userNum 用户名
	 * @return 返回所有的年表信息 
	 * */
	public List<ArtistChronology> getAllChronologyByUserNum(int userNum);

}
