/**
 * 
 */
package com.artpri.offical.dao;

import com.artpri.offical.model.ArtistTop;

/**
 * <p>Description: ArtistTopDao</p>
 * @author 王校兵
 * @time 2016年9月10日下午12:53:39
 * @version 1.0
 */

public interface ArtistTopDao extends BaseDao<ArtistTop> {

	/**
	 * 根据艺术家用户编码获取艺术家官网最上方图片
	 * @param userNum 用户编码
	 * @return 返回查询出的图片信息
	 * */
	public ArtistTop getArtistTopByUserNum(int userNum);
	
}
