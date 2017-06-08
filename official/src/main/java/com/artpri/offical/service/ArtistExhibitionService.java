/**
 * 
 */
package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.model.ArtistExhibition;
import com.artpri.offical.pojo.HomePageExhibition;

/**
 * <p>Description: 展览对应的逻辑操作类</p>
 * @author 王校兵
 * @time 2016年9月11日上午11:51:59
 * @version 1.0
 */

public interface ArtistExhibitionService extends BaseService<ArtistExhibition> {

	/**
	 * 获取首页上的展览信息
	 * @param userNum 用户名
	 * @return 查询出的展览的信息
	 * */
	List<HomePageExhibition> getHomePageExhibitionByUserNum(int userNum);
	/**
	 * 获取单条展览的详细信息
	 * @param exhibitId 展览id
	 * @return 查询出的展览的信息
	 * */
	List<ArtistExhibition> getExhibitionByID(int exhibitId);

    /**
     * 根据艺术家展览的id获得展览的图片
     * */
    String getExhibitionPictureById(int exhibitId);
}
