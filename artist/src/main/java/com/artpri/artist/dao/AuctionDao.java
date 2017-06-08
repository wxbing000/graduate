/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

import com.artpri.artist.model.ArtistAuction;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2017年2月21日
 */
public interface AuctionDao {
	public int addAuction(ArtistAuction art);
	public List getAuction(int pageNow, int pageSize); 
	public void delAuction(int id);
	public ArtistAuction getAuction(int id);
	public void updateAuction(ArtistAuction a);
}
