package com.artpri.offical.dao.impl;

import com.artpri.offical.dao.ArtistLeaveDao;
import com.artpri.offical.model.ArtistLeave;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ArtistLeaveDaoImpl extends BaseDaoImpl<ArtistLeave>
	implements ArtistLeaveDao{

	@Override
	public List<ArtistLeave> getall_leavemessage(int userNum) {
		String hql = "from ArtistLeave al where al.userNum = ?0 ";
		return getEntitlList(hql, userNum);
	}
	@Override
	public boolean saveLeave(ArtistLeave artistLeave){
		saveEntity(artistLeave);
		return true;
	}

}
