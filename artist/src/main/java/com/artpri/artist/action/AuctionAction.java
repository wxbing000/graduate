/**
 *
 */
package com.artpri.artist.action;

import java.io.File;
import java.util.List;

import com.artpri.artist.model.ArtistAuction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * @author 王校兵
 * @version 1.0, 2017年2月21日
 */
public class AuctionAction extends BaseAction {

    private ArtistAuction artAuction; //拍卖信息类
    private File tp;
    private String tpFileName;// 图片文件名称
    private String tpContentType;// 图片文件类型
    private List allAuction;// 向前台传递的艺术家的年表信息
    private int pageNow;// 前台显示的当前页数
    private int totalPage; // 总页数
    private int pageSize;// 每页显示的数据条数
    private String message;
    private int delState;
    private int id;

    public String addAuction() {
        String state = auctionService.addAuction(artAuction, tp, tpFileName, tpContentType);
        if (state.equals("success")) {
            message = "上传成功";
        } else {
            message = "上传失败，请重新尝试";
        }
        return SUCCESS;
    }

    public String allAuction() {
        allAuction = auctionService.getAuction(pageNow, 6);
        totalPage = auctionService.totalpage(6);
        return Action.SUCCESS;
    }

    public String delAuction() {
        getAuctionService().delAuction(id);
        delState = 1;
        return Action.SUCCESS;
    }

    public String updateAuction() {
        getAuctionService().updateAuction(id, artAuction, tp, tpFileName, tpContentType);
        return Action.SUCCESS;
    }

    public ArtistAuction getArtAuction() {
        return artAuction;
    }

    public void setArtAuction(ArtistAuction artAuction) {
        this.artAuction = artAuction;
    }

    public List getAllAuction() {
        return allAuction;
    }

    public void setAllAuction(List allAuction) {
        this.allAuction = allAuction;
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


    public File getTp() {
        return tp;
    }

    public void setTp(File tp) {
        this.tp = tp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public int getDelState() {
        return delState;
    }

    public void setDelState(int delState) {
        this.delState = delState;
    }

    public String getTpFileName() {
        return tpFileName;
    }

    public void setTpFileName(String tpFileName) {
        this.tpFileName = tpFileName;
    }

    public String getTpContentType() {
        return tpContentType;
    }

    public void setTpContentType(String tpContentType) {
        this.tpContentType = tpContentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
