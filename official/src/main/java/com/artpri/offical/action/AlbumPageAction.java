/**
 * 
 */
package com.artpri.offical.action;


import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.artpri.offical.dao.ArtistAlbumCategoryDao;
import com.artpri.offical.model.ArtistAlbumCategory;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.service.ArtistAlbumCategoryService;
import com.artpri.offical.service.ArtistAlbumService;
import com.artpri.offical.service.ArtistTopService;
import com.artpri.offical.service.UserInfoService;
import com.artpri.offical.util.Page;
import com.artpri.offical.util.PageUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 * <p>Description: 相册页面获取信息的action</p>
 * @author 王校兵
 * @time 2016年9月12日下午6:10:07
 * @version 1.0
 */

@Controller("AlbumPageAction")
public class AlbumPageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	@Autowired
	private ArtistAlbumService artistalbumService;
	@Autowired
	private ArtistAlbumCategoryService albumCategoryService;
	private int albunnum;
	private int userNum;
	private String year;
	private Integer aacId;
	private String userName;
	private ArtistTop topPictureUrl;
	private int currentPage;

	//相册分类列表
	private List<ArtistAlbumCategory> albuncategory;
	//相册年代列表
	private List albunyear;
	//全部的相册
	private List allalbun;
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ArtistTopService artistTopService;

	/**
	 * 获取相册信息
	 * */
	public String album(){
		// 用户名
		userName = userInfoService.getUserNameByUserNum(userNum);
		// 顶部图片
		topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
		//显示头部所有年份
		albunyear=artistalbumService.getUniqueYearByUserNum(userNum);
		//显示头部所有类型
		albuncategory=albumCategoryService.getUniqueCategoryNameByName(userNum);
		allalbun=artistalbumService.getallAlbum(userNum);
		/**
		 * 分页用的一堆东西
		 */
		Page page=PageUtil.createPage(9, allalbun.size(),currentPage);
		int endIndex = page.getBeginIndex()+page.getEveryPage();
		if((page.getBeginIndex()+page.getEveryPage())>=page.getTotalCount()){
		   endIndex = page.getTotalCount();
		}
		allalbun=allalbun.subList(page.getBeginIndex(), endIndex);
		ServletActionContext.getRequest().setAttribute("page",page);//保存记录到request范围
		return SUCCESS;
	}
	public String photoByYear(){
		// 用户名
		userName = userInfoService.getUserNameByUserNum(userNum);
		// 顶部图片
		topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
		//显示头部所有年份
		albunyear=artistalbumService.getUniqueYearByUserNum(userNum);
		//显示头部所有类型
		albuncategory=albumCategoryService.getUniqueCategoryNameByName(userNum);
		allalbun=artistalbumService.getAlbumByYear(userNum, year);
		/**
		 * 分页用的一堆东西
		 */
		Page page=PageUtil.createPage(9, allalbun.size(),currentPage);
		int endIndex = page.getBeginIndex()+page.getEveryPage();
		if((page.getBeginIndex()+page.getEveryPage())>=page.getTotalCount()){
		   endIndex = page.getTotalCount();
		}
		allalbun=allalbun.subList(page.getBeginIndex(), endIndex);
		ServletActionContext.getRequest().setAttribute("page",page);//保存记录到request范围
		return SUCCESS;
	}
	public String photoByCategory(){
		// 用户名
		userName = userInfoService.getUserNameByUserNum(userNum);
		// 顶部图片
		topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
		//显示头部所有年份
		albunyear=artistalbumService.getUniqueYearByUserNum(userNum);
		//显示头部所有类型
		albuncategory=albumCategoryService.getUniqueCategoryNameByName(userNum);
		allalbun=artistalbumService.getAlbumByCategory(userNum, aacId);
		/**
		 * 分页用的一堆东西
		 */
		Page page=PageUtil.createPage(9, allalbun.size(),currentPage);
		int endIndex = page.getBeginIndex()+page.getEveryPage();
		if((page.getBeginIndex()+page.getEveryPage())>=page.getTotalCount()){
		   endIndex = page.getTotalCount();
		}
		allalbun=allalbun.subList(page.getBeginIndex(), endIndex);
		ServletActionContext.getRequest().setAttribute("page",page);//保存记录到request范围
		return SUCCESS;
	}

    public ArtistAlbumService getArtistalbumService() {
        return artistalbumService;
    }

    public void setArtistalbumService(ArtistAlbumService artistalbumService) {
        this.artistalbumService = artistalbumService;
    }

    public ArtistAlbumCategoryService getAlbumCategoryService() {
        return albumCategoryService;
    }

    public void setAlbumCategoryService(
            ArtistAlbumCategoryService albumCategoryService) {
        this.albumCategoryService = albumCategoryService;
    }

    public int getAlbunnum() {
        return albunnum;
    }

    public void setAlbunnum(int albunnum) {
        this.albunnum = albunnum;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public List<ArtistAlbumCategory> getAlbuncategory() {
        return albuncategory;
    }

    public void setAlbuncategory(List<ArtistAlbumCategory> albuncategory) {
        this.albuncategory = albuncategory;
    }

    public List getAlbunyear() {
        return albunyear;
    }

    public void setAlbunyear(List albunyear) {
        this.albunyear = albunyear;
    }

    public List getAllalbun() {
        return allalbun;
    }

    public void setAllalbun(List allalbun) {
        this.allalbun = allalbun;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getAacId() {
        return aacId;
    }

    public void setAacId(Integer aacId) {
        this.aacId = aacId;
    }




    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public ArtistTop getTopPictureUrl() {
        return topPictureUrl;
    }


    public void setTopPictureUrl(ArtistTop topPictureUrl) {
        this.topPictureUrl = topPictureUrl;
    }


    public UserInfoService getUserInfoService() {
        return userInfoService;
    }


    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }


    public ArtistTopService getArtistTopService() {
        return artistTopService;
    }


    public void setArtistTopService(ArtistTopService artistTopService) {
        this.artistTopService = artistTopService;
    }



    public int getCurrentPage() {
        return currentPage;
    }


    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }



}
