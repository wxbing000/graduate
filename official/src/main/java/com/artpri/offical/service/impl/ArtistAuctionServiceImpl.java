package com.artpri.offical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artpri.offical.dao.ArtistAuctionDao;
import com.artpri.offical.model.ArtistAuction;
import com.artpri.offical.service.ArtistAuctionService;
//@Transactional
@Service("artistAuctionService")
public class ArtistAuctionServiceImpl extends BaseServiceImpl<ArtistAuction>
	implements ArtistAuctionService{

	@Autowired
	private ArtistAuctionDao artistAuctionDao;
	
	@Override
	public List<ArtistAuction> AuctionInfoByuserNum(int userNum) {
		// TODO Auto-generated method stub
		
		return artistAuctionDao.getArtistAuction(userNum);
	}

}
