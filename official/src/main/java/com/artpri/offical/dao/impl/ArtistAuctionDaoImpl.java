package com.artpri.offical.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistAuctionDao;
import com.artpri.offical.model.ArtistAuction;


/**
 * 
*类描述：艺术家官网拍卖行情页面
*@author: tk
*@date： 日期：2017年2月1日 时间：上午10:52:00
*@version 1.0
 */

@Repository
public class ArtistAuctionDaoImpl extends BaseDaoImpl<ArtistAuction> implements
		ArtistAuctionDao {

	@Override
	public List<ArtistAuction> getArtistAuction(int userNum) {
		String hql = "from ArtistAuction where userNum = ?0";
		return getEntitlList(hql, userNum);
	}
}
