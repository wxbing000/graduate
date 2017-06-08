/**
 *
 */
package com.artpri.offical.service.impl;

import com.artpri.offical.dao.ArtistExhibitionDao;
import com.artpri.offical.model.ArtistExhibition;
import com.artpri.offical.pojo.HomePageExhibition;
import com.artpri.offical.service.ArtistExhibitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author 王校兵
 * @version 1.0
 * @time 2016年9月11日上午11:54:06
 */

@Service("artistExhibitionService")
public class ArtistExhibitionServiceImpl extends
        BaseServiceImpl<ArtistExhibition> implements ArtistExhibitionService {

    @Autowired
    private ArtistExhibitionDao artistExhibitionDao;

    /**
     * 获取首页上的展览信息
     *
     * @param userNum 用户名
     * @return 查询出的展览的信息
     */
    @Override
    public List<HomePageExhibition> getHomePageExhibitionByUserNum(int userNum) {
        return artistExhibitionDao.getHomePageExhibitionByUserNum(userNum);
    }

    /**
     * 获取单条展览的详细信息
     *
     * @param exhibitId 展览的id
     * @return 查询出的展览的信息
     */
    @Override
    public List<ArtistExhibition> getExhibitionByID(int exhibitId) {
        return artistExhibitionDao.getExhibitionByID(exhibitId);
    }


    @Override
    public String getExhibitionPictureById(int exhibitId) {
        return artistExhibitionDao.getExhibitionPictureById(exhibitId);
    }


}
