/**
 *
 */
package com.artpri.artist.service.impl;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import com.artpri.artist.dao.impl.HibernateDaoImpl;
import com.artpri.artist.model.ArtistAlbum;
import com.artpri.artist.service.AlbumPhotoMangeService;
import com.artpri.artist.util.DeleteFileUtil;
import com.artpri.artist.util.RandomFileNameUtil;
import com.artpri.artist.util.UploadPic;
import com.opensymphony.xwork2.ActionContext;

/**
 * 艺术家相册图片管理逻辑处理类AlbumPhotoMangeService实现类
 *
 * @author 王校兵
 * @version 1.0, 2016年4月3日
 */
public class AlbumPhotoMangeServiceImpl extends BaseService implements
        AlbumPhotoMangeService {

    @Override
    public List getAlbumCategory() {
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        return getAlbumPhotoMangeDao().getAlbumCategory(userNum);
    }

    @Override
    public String uploadAlbumPhoto(int categoryId, String name, String year,
                                   File photo, String photoContentType, String explain) {
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        Calendar ca = Calendar.getInstance();
        int nowYear = ca.get(Calendar.YEAR); // 取得系统当前的年
        int nowMenth = ca.get(Calendar.MONTH) + 1;
        int nowDay = ca.get(Calendar.DATE);

        // 要保存的路径
        String path = getImagePath() + "\\" + nowYear + nowMenth + nowDay;
        photoContentType = UploadPic.getSuffixName(photoContentType);
        String filename = RandomFileNameUtil.getRandomFileName() + "." + photoContentType;
        UploadPic.uploadOnePic(path, filename, photo);
        ArtistAlbum aa = new ArtistAlbum();
        aa.setAacId(categoryId);
        aa.setAaName(name);
        aa.setAaPath(getWebUrl() + "/image/" + nowYear + nowMenth + nowDay + "/" + filename);
        aa.setAaYear(year);
        aa.setUserNum(userNum);
        aa.setAaExplain(explain);

        if (getAlbumPhotoMangeDao().saveAlbumPhoto(aa) >= 0) {
            return "success";
        }
        return "error";
    }

    @Override
    public List getPhotoYears() {
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        return getAlbumPhotoMangeDao().getPhotoYears(userNum);
    }

    @Override
    public List getPhotoByCategory(int queryCategory) {
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        return getAlbumPhotoMangeDao().getPhotoByCategory(userNum, queryCategory);
    }

    @Override
    public List getPhotoByTime(String queryTime) {
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        return getAlbumPhotoMangeDao().getPhotoByTime(userNum, queryTime);
    }

    @Override
    public List getPhotoByTitle(String queryTitle) {
        // 从session中获取当前艺术家的编号
        int userNum = (int) ActionContext.getContext().getSession().get("userNum");
        return getAlbumPhotoMangeDao().getPhotoByTitle(userNum, "%" + queryTitle + "%");
    }

    /**
     * 通过照片主键查询相册照片action方法
     *
     * @param id id
     */
    public void getPhotoById(int id) {
    }

    @Override
    public void delPhotoInfo(int delInfoId) {

        ArtistAlbum aa = getAlbumPhotoMangeDao().getPhotoById(delInfoId); // 获取到当前id的艺术家相册图片对象
        String path = aa.getAaPath(); // 获取到当前图片的路径
        DeleteFileUtil.delPhoto(path, getImagePath());//通过删除方法删除服务器上的图片
        // 从数据库中删除指定id的照片行数
        getAlbumPhotoMangeDao().delPhotoInfo(delInfoId);

    }

    @Override
    public String updateAlbumInfo(int albumId, int categoryId, String name,
                                  String year, File photo, String photoContentType, String explain) {

        String filename = null; //保存图片的名称
        Calendar ca = Calendar.getInstance();
        int nowYear = ca.get(Calendar.YEAR); // 取得系统当前的年
        int nowMenth = ca.get(Calendar.MONTH) + 1;
        int nowDay = ca.get(Calendar.DATE);

        ArtistAlbum aa = getAlbumPhotoMangeDao().getPhotoById(albumId);//获取 指定id的图片对象

        //判断是否上传了图片，如果上传了图片则保存图片
        if (photo != null) {
            // 要保存的路径
            String path = getImagePath() + "\\" + nowYear + nowMenth + nowDay;
            photoContentType = UploadPic.getSuffixName(photoContentType);
            filename = RandomFileNameUtil.getRandomFileName() + "." + photoContentType;     //随机文件名
            UploadPic.uploadOnePic(path, filename, photo);

            //修改数据库路径
            aa.setAaPath(getWebUrl() + "/image/" + nowYear + nowMenth + nowDay + "/" + filename);
            //删除旧图片
            DeleteFileUtil.delPhoto(aa.getAaPath(), getPictureRootPath());
        }
        aa.setAacId(categoryId);
        aa.setAaName(name);
        aa.setAaYear(year);
        aa.setAaExplain(explain);
        getAlbumPhotoMangeDao().updateAlbumInfo(aa);
        return "success";
    }

}
