/**
 * 
 */
package com.artpri.artist.action;

import com.artpri.artist.service.*;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 本类为action的基类,该类中注册了所有的Service层中的Service类
 * 其他的Action需要继承自这个基类以获得spring对其中注入的bean
 * 
 * @author 王校兵
 * @version 1.0， 2016-2-28
 */
public class BaseAction extends ActionSupport {

	private AlbumPhotoMangeService albumPhotoMangeService;

	private BaseInfoManageService baseInfoManageService;

	private AlbumCategoryMangeService albumCategoryMangeService;

	private LoginService loginService;

	private WiningExperienceService winingExperienceService;

	private ChronologyManageService chronologyManageService;

	private PublicBookMangeService publicBookMangeService;
	
	protected NewsService newsService;
	
	protected AuctionService auctionService;

    private ExhibitionMangeService exhibitionMangeService;

    public ExhibitionMangeService getExhibitionMangeService() {
        return exhibitionMangeService;
    }

    public void setExhibitionMangeService(ExhibitionMangeService exhibitionMangeService) {
        this.exhibitionMangeService = exhibitionMangeService;
    }

    public AlbumCategoryMangeService getAlbumCategoryMangeService() {
		return albumCategoryMangeService;
	}

	public AlbumPhotoMangeService getAlbumPhotoMangeService() {
		return albumPhotoMangeService;
	}

	public BaseInfoManageService getBaseInfoManageService() {
		return baseInfoManageService;
	}

	public ChronologyManageService getChronologyManageService() {
		return chronologyManageService;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public PublicBookMangeService getPublicBookMangeService() {
		return publicBookMangeService;
	}

	public WiningExperienceService getWiningExperienceService() {
		return winingExperienceService;
	}

	public void setAlbumCategoryMangeService(
			AlbumCategoryMangeService albumCategoryMangeService) {
		this.albumCategoryMangeService = albumCategoryMangeService;
	}

	public void setAlbumPhotoMangeService(
			AlbumPhotoMangeService albumPhotoMangeService) {
		this.albumPhotoMangeService = albumPhotoMangeService;
	}

	public void setBaseInfoManageService(
			BaseInfoManageService baseInfoManageService) {
		this.baseInfoManageService = baseInfoManageService;
	}

	public void setChronologyManageService(
			ChronologyManageService chronologyManageService) {
		this.chronologyManageService = chronologyManageService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public void setPublicBookMangeService(
			PublicBookMangeService publicBookMangeService) {
		this.publicBookMangeService = publicBookMangeService;
	}

	public void setWiningExperienceService(
			WiningExperienceService winingExperienceService) {
		this.winingExperienceService = winingExperienceService;
	}

	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public AuctionService getAuctionService() {
		return auctionService;
	}

	public void setAuctionService(AuctionService auctionService) {
		this.auctionService = auctionService;
	}
	

}
