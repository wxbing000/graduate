/**
 *
 */
package com.artpri.artist.service.impl;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import com.artpri.artist.model.ArtistAuction;
import com.artpri.artist.model.ArtistBook;
import com.artpri.artist.service.AuctionService;
import com.artpri.artist.util.DeleteFileUtil;
import com.artpri.artist.util.GetPagingInfoUtil;
import com.artpri.artist.util.RandomFileNameUtil;
import com.artpri.artist.util.UploadPic;
import com.opensymphony.xwork2.ActionContext;

/**
 * @author 王校兵
 * @version 1.0, 2017年2月21日
 */
public class AuctionServiceImpl extends BaseService implements AuctionService {

    @Override
    public String addAuction(ArtistAuction art, File tp, String book_tpFileName,
                             String book_tpContentType) { // 主要写上传图片
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        art.setUserNum(userNum);

        // 取得系统当前的年
        Calendar ca = Calendar.getInstance();
        int nowYear = ca.get(Calendar.YEAR);
        int nowMenth = ca.get(Calendar.MONTH) + 1;
        int nowDay = ca.get(Calendar.DATE);

        // 要保存的路径
        String path = getImagePath() + "\\" + nowYear + nowMenth + nowDay;

        // 取到上传图片的后缀名
        book_tpContentType = UploadPic.getSuffixName(book_tpContentType);
        System.out.println("book_tpContentType" + book_tpContentType);

        // 根据时间计算出上传图片的文件名
        String filename = RandomFileNameUtil.getRandomFileName() + "." + book_tpContentType;

        // 执行上传方法
        UploadPic.uploadOnePic(path, filename, tp);

        art.setProductImg(getWebUrl() + "/image/" + nowYear + nowMenth + nowDay + "/" + filename);

        int state = getAuctionDao().addAuction(art);
        if (state > 0) {
            return "success";
        }
        return "false";
    }

    @Override
    public List getAuction(int pageNow, int pageSize) {
        // 从session中取到登录的用户的用户编码
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");

        // 取到当前的page数
        int curpage = GetPagingInfoUtil.countCurrentPage(pageNow);

        // 返回查询结果
        return getAuctionDao().getAuction(curpage, pageSize);
    }

    public int totalpage(int pageSize) {

        // 从session中取到登录的用户的用户编码
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");

        // 数据库中当前艺术家年表信息总行数
        int rowCount = (int) getChronologyManageDao().getChronologyRowCount(userNum);

        return GetPagingInfoUtil.countTatalPage(pageSize, rowCount);
    }

    @Override
    public void delAuction(int id) {
        ArtistAuction ab = getAuctionDao().getAuction(id); // 获取到当前id的艺术家相册图片对象
        String path = ab.getProductImg(); // 获取到当前图片的路径
        DeleteFileUtil.delPhoto(path, getImagePath());// 通过删除方法删除服务器上的图片
        // 从数据库中删除指定id的照片行数
        getAuctionDao().delAuction(id);
    }

    /* (non-Javadoc)
     * @see com.artpri.artist.service.AuctionService#updateAuction(com.artpri.artist.model.ArtistAuction)
     */
    @Override
    public String updateAuction(int id, ArtistAuction artistAuction, File tp, String tpFileName, String tpContentType) {
        String filename = null; // 保存图片的名称
        Calendar ca = Calendar.getInstance();
        int nowYear = ca.get(Calendar.YEAR); // 取得系统当前的年
        int nowMenth = ca.get(Calendar.MONTH) + 1;
        int nowDay = ca.get(Calendar.DATE);

        ArtistAuction ab = getAuctionDao().getAuction(id); // 获取到当前id的艺术家相册图片对象

        // 判断是否上传了图片，如果上传了图片则保存图片
        if (tp != null) {
            // 要保存的路径
            String path = getImagePath() + "\\" + nowYear + nowMenth + nowDay;

            tpContentType = UploadPic.getSuffixName(tpContentType);// 获取到文件的后缀名

            filename = RandomFileNameUtil.getRandomFileName() + "." + tpContentType;
            UploadPic.uploadOnePic(path, filename, tp);

            DeleteFileUtil.delPhoto(ab.getProductImg(), getPictureRootPath());
            artistAuction.setProductImg(getWebUrl() + "/image/" + nowYear + nowMenth + nowDay + "/" + filename);
        }else {
            artistAuction.setProductImg(ab.getProductImg());
        }

//        artistAuction.setUserNum(userNum);


        getAuctionDao().updateAuction(artistAuction);

        return "success";

    }
}
