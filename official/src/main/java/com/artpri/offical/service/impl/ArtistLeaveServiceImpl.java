package com.artpri.offical.service.impl;

import com.artpri.offical.dao.ArtistLeaveDao;
import com.artpri.offical.model.ArtistLeave;
import com.artpri.offical.service.ArtistLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("artistLeaveService")
public class ArtistLeaveServiceImpl extends BaseServiceImpl<ArtistLeave>
        implements ArtistLeaveService {
    @Autowired
    private ArtistLeaveDao artistLeaveDao;

    @Override
    public List<ArtistLeave> getallLeavemessage(int userNum) {
        return artistLeaveDao.getall_leavemessage(userNum);
    }

    @Override
    public boolean saveLeave(ArtistLeave artistLeave) {
        return artistLeaveDao.saveLeave(artistLeave);
    }

}
