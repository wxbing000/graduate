/**
 * 
 */
package com.artpri.artist.service;

import java.io.File;
import java.util.List;

import com.artpri.artist.model.ArtistAuction;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2017年2月21日
 */
public interface AuctionService {
	public String addAuction(ArtistAuction art, File tp, String book_tpFileName, String book_tpContentType);
	public List getAuction(int pageNow, int pageSize);
	public int totalpage(int pageSize);
	public void delAuction(int id);
	public String updateAuction(int id, ArtistAuction a, File tp, String tpFileName, String tpContentType);
	/**
	 * @param i
	 * @return
	 */
	
}
