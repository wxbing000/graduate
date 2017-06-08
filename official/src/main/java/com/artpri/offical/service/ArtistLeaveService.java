package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.model.ArtistLeave;

public interface ArtistLeaveService extends BaseService<ArtistLeave>{
	public List<ArtistLeave> getallLeavemessage(int userNum);
	public boolean saveLeave(ArtistLeave artistLeave);
}
