/**
 * 
 */
package com.artpri.offical.dao;

import com.artpri.offical.model.ArtistExhibition;
import com.artpri.offical.pojo.HomePageExhibition;

import java.util.List;

/**
 * <p>Title: </p>
 * <p>Description: 展览对应的dao</p>
 * <p>Company: </p>
 * @author 王校兵
 * @time 2016年9月5日下午7:57:42
 * @version 1.0
 */

public interface ArtistExhibitionDao extends BaseDao<ArtistExhibition> {

	/**
	 * 获取首页上的展览信息
	 * @param userNum 用户名
	 * @return 查询出的展览的信息
	 * */
	public List<HomePageExhibition> getHomePageExhibitionByUserNum(int userNum);
	/**
	 * 获取单条展览信息
	 * @param exhibitId 展览id
	 * @return 查询出的展览的详细信息
	 * */
	public List<ArtistExhibition> getExhibitionByID(int exhibitId);

    /**
     * 根据展览的id查询展览的图片
     * */
    String getExhibitionPictureById(int exhibitId);
}
