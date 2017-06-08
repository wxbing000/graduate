/**
 *
 */
package com.artpri.artist.service.impl;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import com.artpri.artist.model.ArtistAlbum;
import com.artpri.artist.model.ArtistBook;
import com.artpri.artist.service.PublicBookMangeService;
import com.artpri.artist.util.DeleteFileUtil;
import com.artpri.artist.util.GetPagingInfoUtil;
import com.artpri.artist.util.RandomFileNameUtil;
import com.artpri.artist.util.UploadPic;
import com.opensymphony.xwork2.ActionContext;

/**
 * @author 王校兵
 * @version 1.0, 2016年4月11日
 */
public class PublicBookMangeServiceImpl extends BaseService implements
        PublicBookMangeService {

    @Override
    public String uploadPublicBook(String book_sm, File book_tp, String book_tpFileName, String book_tpContentType, String book_cbs,
                                   String book_zz, String book_bz, String book_date, String book_kb, String book_yc, String book_lb, String book_dj, String book_isbn,
                                   String book_zy, String book_mu) {

        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");

        // 取得系统当前的年
        Calendar ca = Calendar.getInstance();
        int nowYear = ca.get(Calendar.YEAR);
        int nowMenth = ca.get(Calendar.MONTH) + 1;
        int nowDay = ca.get(Calendar.DATE);

        // 要保存的路径
        String path = getImagePath() + "\\" + nowYear + nowMenth + nowDay;
        System.out.println(path);

        // 取到上传图片的后缀名
        book_tpContentType = UploadPic.getSuffixName(book_tpContentType);

        // 根据时间计算出上传图片的文件名
        String filename = RandomFileNameUtil.getRandomFileName() + "." + book_tpContentType;

        // 执行上传方法
        UploadPic.uploadOnePic(path, filename, book_tp);

        ArtistBook ab = new ArtistBook();
        ab.setUserNum(userNum);
        ab.setBookPress(book_cbs);
        ab.setBookName(book_sm);
        ab.setBookPublicatTime(book_date);
        ab.setBookPricing(book_dj);
        ab.setBookContent(book_zy);
        ab.setBookCatalogue(book_mu);
        ab.setBookCategory(book_lb);
        ab.setBookIsbn(book_isbn);
        ab.setBookImpression(book_yc);
        ab.setBookAuthor(book_zz);
        ab.setBookWriter(book_bz);
        ab.setBookSize(book_kb);
        ab.setBookPicturePath(getWebUrl() + "/image/" + nowYear + nowMenth + nowDay + "/" + filename);
        ab.setBookShowState(1);

        int state = getPublicBookMangeDao().savePublicBook(ab);

        if (state > 0) {
            return "success";
        }
        return "false";
    }

    @Override
    public List getPublicBook(int pageNow, int pageSize) {

        // 从session中取到登录的用户的用户编码
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");

        // 取到当前的page数，若为0或者请求的URL中没有“?page = ”则用1代替
        int curpage = GetPagingInfoUtil.countCurrentPage(pageNow);

        // 返回查询结果
        return getPublicBookMangeDao().getPublicBookByPage(userNum, curpage, pageSize);
    }

    public int totalpage(int pageSize) {

        // 从session中取到登录的用户的用户编码
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");

        // 数据库中当前艺术家年表信息总行数
        int rowCount = (int) getPublicBookMangeDao().getPublicBookRowCount(userNum);
        return GetPagingInfoUtil.countTatalPage(pageSize, rowCount);
    }

    @Override
    public void delPublicBook(int delId) {

        ArtistBook ab = getPublicBookMangeDao().getArtistBook(delId); // 获取到当前id的艺术家相册图片对象
        String path = ab.getBookPicturePath(); // 获取到当前图片的路径
        DeleteFileUtil.delPhoto(path, getPictureRootPath());// 通过删除方法删除服务器上的图片
        // 从数据库中删除指定id的照片行数
        getPublicBookMangeDao().delPublicBook(delId);
    }

    @Override
    public String updatePublicBook(int id, String book_sm, File book_tp,
                                   String book_tpFileName, String book_tpContentType, String book_cbs,
                                   String book_zz, String book_bz, String book_date, String book_kb,
                                   String book_yc, String book_lb, String book_dj, String book_isbn,
                                   String book_zy, String book_mu) {

        String filename = null; // 保存图片的名称
        Calendar ca = Calendar.getInstance();
        int nowYear = ca.get(Calendar.YEAR); // 取得系统当前的年
        int nowMenth = ca.get(Calendar.MONTH) + 1;
        int nowDay = ca.get(Calendar.DATE);
        System.out.println("id:" + id);
        ArtistBook ab = getPublicBookMangeDao().getArtistBook(id); // 获取到当前id的艺术家相册图片对象

        // 判断是否上传了图片，如果上传了图片则保存图片
        if (book_tp != null) {

            // 要保存的路径
            String path = getImagePath() + "\\" + nowYear + nowMenth + nowDay;
            book_tpContentType = UploadPic.getSuffixName(book_tpContentType);// 获取到文件的后缀名
            filename = RandomFileNameUtil.getRandomFileName() + "." + book_tpContentType;
            UploadPic.uploadOnePic(path, filename, book_tp);
            DeleteFileUtil.delPhoto(ab.getBookPicturePath(), getPictureRootPath());
            ab.setBookPicturePath(getWebUrl() + "/image/" + nowYear + nowMenth + nowDay + "/" + filename);
        }

        ab.setBookPress(book_cbs);
        ab.setBookName(book_sm);
        ab.setBookPublicatTime(book_date);
        ab.setBookPricing(book_dj);
        ab.setBookContent(book_zy);
        ab.setBookCatalogue(book_mu);
        ab.setBookCategory(book_lb);
        ab.setBookIsbn(book_isbn);
        ab.setBookImpression(book_yc);
        ab.setBookAuthor(book_zz);
        ab.setBookWriter(book_bz);
        ab.setBookSize(book_kb);

        getPublicBookMangeDao().updatePublicBook(ab);

        return "success";
    }

}
