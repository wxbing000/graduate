package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.model.ArtistAuction;
/**
 * 
*类描述：
*@author: tk
*@date： 日期：2017年2月1日 时间：上午11:23:08
*@version 1.0
 */
public interface ArtistAuctionService extends BaseService<ArtistAuction>{
	public List<ArtistAuction> AuctionInfoByuserNum(int userNum);
}
