package com.artpri.offical.dao;

import java.util.List;

import com.artpri.offical.model.ArtistAuction;

public interface ArtistAuctionDao extends BaseDao<ArtistAuction>{
	public List<ArtistAuction> getArtistAuction(int userNum);
	
}
