package com.artpri.artist.service;

import com.artpri.artist.model.ArtistExhibition;

import java.io.File;
import java.util.List;

/**
 * describe: 艺术家展览信息管理service类
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/20  19:04
 */
public interface ExhibitionMangeService {

    /**
     * 添加艺术家展览信息
     *
     * @param artistExhibition 展览信息
     * @param picture          图片文件
     * @param pictureFileName  图片文件名
     * @param picteContentType 图片的文件类型
     */
    void insertExhibtin(ArtistExhibition artistExhibition, File picture, String pictureFileName, String picteContentType);

    /**
     * 修改艺术家展览信息但不修改展览图片
     *
     * @param artistExhibition 展览信息
     */
    void updateExhibition(ArtistExhibition artistExhibition);

    /**
     * 删除艺术家展览信息
     *
     * @param id 展览图片的id
     */
    void deleteExhibition(int id);

    /**
     * 获取首页上的展览信息
     *
     * @param
     * @return 查询出的展览的信息
     */
    List<ArtistExhibition> getAllExhibitionByUserNum(int pageNow, int pageSize);

    int totalpage(int pageSize);
}
