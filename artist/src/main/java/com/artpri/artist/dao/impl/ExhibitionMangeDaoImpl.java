package com.artpri.artist.dao.impl;

import com.artpri.artist.dao.ExhibitionMangeDao;
import com.artpri.artist.model.ArtistExhibition;

import java.util.List;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/20  19:21
 */
public class ExhibitionMangeDaoImpl extends HibernateDaoImpl implements
        ExhibitionMangeDao {

    /**
     * 保存艺术家展览信息
     *
     * @param artistExhibition 艺术家展览信息类
     */
    @Override
    public int saveExhibition(ArtistExhibition artistExhibition) {

        return (int) save(artistExhibition);
    }

    /**
     * 获取首页上的展览信息
     *
     * @param pageNow  当前页
     * @param pageSize 每页的页数
     * @param userNum  用户名
     * @return 查询出的展览的信息
     */
    @Override
    public List<ArtistExhibition> getHomePageExhibitionByUserNum(int pageNow, int pageSize, int userNum) {
        return findByPage("from ArtistExhibition where userNum = " + userNum, pageNow, pageSize);
    }

    /**
     * 删除展览信息
     *
     * @param id 主键
     */
    @Override
    public void deleteExhibition(int id) {
        delete(ArtistExhibition.class, id);
    }

    /**
     * 更新指定的展览
     *
     * @param artistExhibition 展览对象
     */
    @Override
    public void updateExhibition(ArtistExhibition artistExhibition) {
        getSessionFactory().getCurrentSession().merge(artistExhibition);
    }

    /**
     * 根据ID查询展览信息
     *
     * @param id id
     */
    @Override
    public ArtistExhibition getExhibitionById(int id) {
        return (ArtistExhibition) get(ArtistExhibition.class, id);
    }

    /**
     * 查询当前用户的展览总数
     *
     * @param userNum 用户编码
     */
    @Override
    public int getExhibitionNumByUserNum(int userNum) {
        return findRowCount("select count(*) from ArtistExhibition where userNum = ?0", userNum);
    }


}
