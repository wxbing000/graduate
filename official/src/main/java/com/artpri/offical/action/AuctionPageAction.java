package com.artpri.offical.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.artpri.offical.model.ArtistAuction;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.service.ArtistAuctionService;
import com.artpri.offical.service.ArtistTopService;
import com.artpri.offical.service.UserInfoService;
import com.artpri.offical.util.Page;
import com.artpri.offical.util.PageUtil;
import com.opensymphony.xwork2.ActionSupport;
@Controller("AuctionPageAction")
public class AuctionPageAction extends ActionSupport{

	private Integer userNum;
	private String userName;
	private ArtistTop topPictureUrl;
	private List<ArtistAuction> AuctionList;
	@Autowired
	private ArtistAuctionService artistAuctionService;
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ArtistTopService artistTopService;
	private int currentPage;

    public String auction(){
        // 用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        // 顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        AuctionList=artistAuctionService.AuctionInfoByuserNum(userNum);
        /**
         * 分页用的一堆东西
         */
        Page page=PageUtil.createPage(9,AuctionList.size(),currentPage);
        int endIndex = page.getBeginIndex()+page.getEveryPage();
        if((page.getBeginIndex()+page.getEveryPage())>=page.getTotalCount()){
            endIndex = page.getTotalCount();
        }
        AuctionList=AuctionList.subList(page.getBeginIndex(), endIndex);
        ServletActionContext.getRequest().setAttribute("page",page);//保存记录到request范围
        return SUCCESS;

    }

	public Integer getUserNum() {
		return userNum;
	}

	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
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

	public List<ArtistAuction> getAuctionList() {
		return AuctionList;
	}

	public void setAuctionList(List<ArtistAuction> auctionList) {
		AuctionList = auctionList;
	}

	public ArtistAuctionService getArtistAuctionService() {
		return artistAuctionService;
	}

	public void setArtistAuctionService(ArtistAuctionService artistAuctionService) {
		this.artistAuctionService = artistAuctionService;
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
