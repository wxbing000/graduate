package com.artpri.artist.action;

import com.artpri.artist.model.ArtistExhibition;

import java.io.File;
import java.util.List;

/**
 * describe:艺术家展览信息管理action
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/20  18:45
 */
public class ExhibitionManageAction extends BaseAction {


    private ArtistExhibition artistExhibition; //展览信息对象
    private File picture; //展览时间
    private String pictureFileName; //展览时间
    private String pictureContentType; //展览时间
    private int exhibitionId; //展览信息的主键
    private List<ArtistExhibition> exhibitions; //所有的展览信息
    private String message;
    private int pageNow;// 前台显示的当前页数
    private int totalPage; // 总页数
    private int pageSize;// 每页显示的数据条数


    /**
     * 上传艺术家展览信息
     */
    public String uploadExhibition() {
        getExhibitionMangeService().insertExhibtin(artistExhibition, picture, pictureFileName, pictureContentType);
        message = "上传成功！";
        return SUCCESS;
    }

    /**
     * 删除指定的数据库以及磁盘上相关的展览信息
     */
    public String deleteExhibitin() {
        getExhibitionMangeService().deleteExhibition(exhibitionId);
        return SUCCESS;
    }

    /**
     * 更新展览信息但不更新页面
     */
    public String updateExhibition() {
        getExhibitionMangeService().updateExhibition(artistExhibition);
        return SUCCESS;
    }

    /**
     * 获取所有的展览信息
     */
    public String getAllExhibition() {
        exhibitions = getExhibitionMangeService().getAllExhibitionByUserNum(pageNow, 6);
        totalPage = getExhibitionMangeService().totalpage(6);
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getExhibitionId() {
        return exhibitionId;
    }

    public void setExhibitionId(int exhibitionId) {
        this.exhibitionId = exhibitionId;
    }

    public List<ArtistExhibition> getExhibitions() {
        return exhibitions;
    }

    public void setExhibitions(List<ArtistExhibition> exhibitions) {
        this.exhibitions = exhibitions;
    }

    public ArtistExhibition getArtistExhibition() {
        return artistExhibition;
    }

    public void setArtistExhibition(ArtistExhibition artistExhibition) {
        this.artistExhibition = artistExhibition;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    public String getPictureFileName() {
        return pictureFileName;
    }

    public void setPictureFileName(String pictureFileName) {
        this.pictureFileName = pictureFileName;
    }

    public String getPictureContentType() {
        return pictureContentType;
    }

    public void setPictureContentType(String pictureContentType) {
        this.pictureContentType = pictureContentType;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
