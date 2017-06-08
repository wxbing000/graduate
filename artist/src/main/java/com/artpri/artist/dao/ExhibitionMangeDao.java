package com.artpri.artist.dao;

import com.artpri.artist.model.ArtistExhibition;

import java.util.List;

/**
 * describe:艺术家展览dao类
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/20  19:18
 */
public interface ExhibitionMangeDao {

    /**
     * 保存艺术家展览信息
     *
     * @param artistExhibition 艺术家展览信息类
     */
    int saveExhibition(ArtistExhibition artistExhibition);


    /**
     * 获取首页上的展览信息
     *
     * @param pageNow  当前页
     * @param pageSize 每页的页数
     * @param userNum  用户名
     * @return 查询出的展览的信息
     */
    List<ArtistExhibition> getHomePageExhibitionByUserNum(int pageNow, int pageSize, int userNum);

    /**
     * 删除展览信息
     *
     * @param id 主键
     */
    void deleteExhibition(int id);

    /**
     * 更新指定的展览
     *
     * @param artistExhibition 展览对象
     */
    void updateExhibition(ArtistExhibition artistExhibition);

    /**
     * 根据ID查询展览信息
     *
     * @param id id
     */
    ArtistExhibition getExhibitionById(int id);

    /**
     * 查询当前用户的展览总数
     *
     * @param userNum 用户编码
     */
    int getExhibitionNumByUserNum(int userNum);
}
