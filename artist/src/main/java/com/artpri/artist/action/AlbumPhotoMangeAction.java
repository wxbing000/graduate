/**
 * 
 */
package com.artpri.artist.action;

import java.io.File;
import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 艺术家相册图片上传跳转action类
 * 
 * @author 王校兵
 * @version 1.0, 2016年4月3日
 */
public class AlbumPhotoMangeAction extends BaseAction {

	private List category;// 艺术家相册分类list
	private int categoryId;// 相册分类主键id
	private String year;// 图片拍摄年代
	private String name;// 图片名称
	private File photo;// 图片文件对象
	private String photoFileName;// 图片文件名称
	private String photoContentType;// 图片文件类型
	private String explain;// 图片的拍摄说明
	private String message;//返回的友好的提示信息
	private int delInfoId;//要删除的艺术家的相册主键id
	private int delState;//返回的状态信息
	private int albumId;//照片表的id
	/**
	 * 获取当前艺术家的所有的分类名称和对应的id
	 * */
	public String albumCategory() {
		category = getAlbumPhotoMangeService().getAlbumCategory();
		return SUCCESS;
	}
	
	/**
	 * 删除艺术家相册中的照片
	 * */
	public String delPhotoInfo(){
		getAlbumPhotoMangeService().delPhotoInfo(delInfoId);
		delState = 1;
		return Action.SUCCESS;
	}
    /**
     * 编辑艺术家相册信息后保存艺术家更新的艺术家相册信息
     * */
    public String updateAlbumInfo(){
        getAlbumPhotoMangeService().updateAlbumInfo(albumId, categoryId, name, year, photo, photoContentType, explain);
        return Action.SUCCESS;
    }

    /**
     * 上传相册图片
     * */
    public String uploadAlbumPhoto() {
        String uploadState = getAlbumPhotoMangeService().uploadAlbumPhoto(categoryId, name, year, photo, photoContentType, explain);

        if(uploadState.equals("success")){
            message = "上传成功！";
        }else if (uploadState.equals("error")) {
            message = "上传失败请重新上传";
        }

        return Action.SUCCESS;
    }

    public List getCategory() {
        return category;
    }

    public void setCategory(List category) {
        this.category = category;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getDelInfoId() {
        return delInfoId;
    }

    public void setDelInfoId(int delInfoId) {
        this.delInfoId = delInfoId;
    }

    public int getDelState() {
        return delState;
    }

    public void setDelState(int delState) {
        this.delState = delState;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
}
