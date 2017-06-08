package com.artpri.artist.service.impl;

import com.artpri.artist.model.ArtistExhibition;
import com.artpri.artist.service.ExhibitionMangeService;
import com.artpri.artist.util.DeleteFileUtil;
import com.artpri.artist.util.GetPagingInfoUtil;
import com.artpri.artist.util.RandomFileNameUtil;
import com.artpri.artist.util.UploadPic;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Calendar;
import java.util.List;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/20  19:17
 */
@Service(value = "ExhibitionMangeService")
@Transactional
public class ExhibitionMangeServiceImpl extends BaseService implements ExhibitionMangeService {

    /**
     * 添加艺术家展览信息
     *
     * @param artistExhibition
     * @param picture
     * @param pictureFileName
     * @param pictureContentType
     */
    @Override
    public void insertExhibtin(ArtistExhibition artistExhibition, File picture, String pictureFileName, String pictureContentType) {
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");

        Calendar ca = Calendar.getInstance();
        int nowYear = ca.get(Calendar.YEAR); // 取得系统当前的年
        int nowMenth = ca.get(Calendar.MONTH) + 1;
        int nowDay = ca.get(Calendar.DATE);

        // 要保存的路径
        String path = getImagePath() + "\\" + nowYear + nowMenth + nowDay;

        pictureContentType = UploadPic.getSuffixName(pictureContentType);

        String filename = RandomFileNameUtil.getRandomFileName() + "." + pictureContentType;

        UploadPic.uploadOnePic(path, filename, picture);

        String url = getWebUrl() + "/image/" + nowYear + nowMenth + nowDay + "/" + filename;

        artistExhibition.setExhibitionPicture(url);
        artistExhibition.setUserNum(userNum);
        getExhibitionMangeDao().saveExhibition(artistExhibition);

    }

    /**
     * 修改艺术家展览信息但不修改展览图片
     *
     * @param artistExhibition 展览信息
     */
    @Override
    public void updateExhibition(ArtistExhibition artistExhibition) {
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        ArtistExhibition oldArtistExhibition = getExhibitionMangeDao().getExhibitionById(artistExhibition.getExhibitId());
        String url = oldArtistExhibition.getExhibitionPicture();
        artistExhibition.setExhibitionPicture(url);
        artistExhibition.setUserNum(userNum);
        getExhibitionMangeDao().updateExhibition(artistExhibition);
    }

    /**
     * 删除艺术家展览信息
     *
     * @param id 展览的id
     */
    @Override
    public void deleteExhibition(int id) {
        ArtistExhibition artistExhibition = getExhibitionMangeDao().getExhibitionById(id);
        String url = artistExhibition.getExhibitionPicture();
        getExhibitionMangeDao().deleteExhibition(id);
        DeleteFileUtil.delPhoto(url, getPictureRootPath());
    }

    /**
     * 获取首页上的展览信息
     *
     * @return 查询出的展览的信息
     */
    @Override
    public List<ArtistExhibition> getAllExhibitionByUserNum(int pageNow, int pageSize) {

        // 从session中取到登录的用户的用户编码
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");

        // 取到当前的page数
        int curpage = GetPagingInfoUtil.countCurrentPage(pageNow);

        // 返回查询结果
        return getExhibitionMangeDao().getHomePageExhibitionByUserNum(curpage, pageSize, userNum);
    }

    @Override
    public int totalpage(int pageSize) {
        // 从session中取到登录的用户的用户编码
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");

        // 数据库中当前艺术家年表信息总行数
        int rowCount = (int) getExhibitionMangeDao().getExhibitionNumByUserNum(userNum);

        return GetPagingInfoUtil.countTatalPage(pageSize, rowCount);
    }
}
