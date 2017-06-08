package com.artpri.offical.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.artpri.offical.model.ArtistExhibition;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.service.ArtistExhibitionService;
import com.artpri.offical.service.ArtistTopService;
import com.artpri.offical.service.UserInfoService;
import com.artpri.offical.util.Page;
import com.artpri.offical.util.PageUtil;
import com.opensymphony.xwork2.ActionSupport;
@Controller("ExhibitionPageAction")
public class ExhibitionPageAction extends ActionSupport {

	/**
	 * 用户编码
	 * */
	private int userNum;
	private String userName;
	private ArtistTop topPictureUrl;
	private int exhibitId;
	private int currentPage;
	@Autowired
	private ArtistExhibitionService artistExhibitionService;
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ArtistTopService artistTopService;
	private List exhibitioninfo;
	private List exhibition;
    private String pictureUrl;

    public String exhibition(){

        // 用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        // 顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        exhibition=artistExhibitionService.getHomePageExhibitionByUserNum(userNum);
        /**
         * 分页用的一堆东西
         */
        Page page=PageUtil.createPage(5, exhibition.size(),currentPage);
        int endIndex = page.getBeginIndex()+page.getEveryPage();
        if((page.getBeginIndex()+page.getEveryPage())>=page.getTotalCount()){
            endIndex = page.getTotalCount();
        }
        exhibition=exhibition.subList(page.getBeginIndex(), endIndex);
        ServletActionContext.getRequest().setAttribute("page",page);//保存记录到request范围

        return SUCCESS;

    }
    public String exhibitioninfo(){
        // 用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        // 顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        exhibitioninfo=artistExhibitionService.getExhibitionByID(exhibitId);
        pictureUrl = artistExhibitionService.getExhibitionPictureById(exhibitId);
        return SUCCESS;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public ArtistExhibitionService getArtistExhibitionService() {
		return artistExhibitionService;
	}

	public void setArtistExhibitionService(
			ArtistExhibitionService artistExhibitionService) {
		this.artistExhibitionService = artistExhibitionService;
	}

	public List getExhibitioninfo() {
		return exhibitioninfo;
	}

	public void setExhibitioninfo(List exhibitioninfo) {
		this.exhibitioninfo = exhibitioninfo;
	}
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	
	public ArtistTop getTopPictureUrl() {
		return topPictureUrl;
	}

	public void setTopPictureUrl(ArtistTop topPictureUrl) {
		this.topPictureUrl = topPictureUrl;
	}

	public ArtistTopService getArtistTopService() {
		return artistTopService;
	}

	public void setArtistTopService(ArtistTopService artistTopService) {
		this.artistTopService = artistTopService;
	}
	
	public int getExhibitId() {
		return exhibitId;
	}

	public void setExhibitId(int exhibitId) {
		this.exhibitId = exhibitId;
	}
	
	public List getExhibition() {
		return exhibition;
	}

	public void setExhibition(List exhibition) {
		this.exhibition = exhibition;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


}
