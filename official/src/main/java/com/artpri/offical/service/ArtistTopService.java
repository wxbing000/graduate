/**
 * 
 */
package com.artpri.offical.service;

import com.artpri.offical.model.ArtistTop;

/**
 * <p>Description:获取用户官网首页的顶部的图片的信息  </p>
 * @author 王校兵
 * @time 2016年9月10日下午1:36:30
 * @version 1.0
 */

public interface ArtistTopService extends BaseService<ArtistTop> {

	/**
	 * 根据艺术家用户编码获取艺术家官网最上方图片
	 * @param userNum 用户编码
	 * @return 返回查询出的图片信息
	 * */
	public ArtistTop getArtistTopByUserNum(int userNum);
	
}
