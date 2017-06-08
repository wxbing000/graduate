/**
 * 
 */
package com.artpri.artist.service.impl;

import com.artpri.artist.dao.*;

/**
 * service的基类，其他类只需要继承它就可以继承其中的参数 该类使spring配置文件变少，配置变得更加简单 该类中注册所有的Dao层的类
 * 
 * @author 王校兵
 * @version 1.0, 2016-2-28
 */
public class BaseService {

    //以下定义的变量为dao类

	private BaseInfoManageDao baseInfoManageDao;

	private AlbumPhotoMangeDao albumPhotoMangeDao;

	private PublicBookMangeDao publicBookMangeDao;
	
	private LoginDao LoginDao;
	
	private WiningExperienceDao winingExperienceDao;

	private ChronologyManageDao chronologyManageDao;

	private AlbumCategoryMangeDao albumCategoryMangeDao;
	
	private NewsDao newsDao;

	private AuctionDao auctionDao;

    private ExhibitionMangeDao exhibitionMangeDao;

    //以下定义的变量为字符型变量

    //图片的根路径
    private String pictureRootPath;

    //图片文件夹image的路径
    private String imagePath;

    //网站url的根路径
    private String webUrl;

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getPictureRootPath() {
        return pictureRootPath;
    }

    public void setPictureRootPath(String pictureRootPath) {
        this.pictureRootPath = pictureRootPath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public ExhibitionMangeDao getExhibitionMangeDao() {
        return exhibitionMangeDao;
    }

    public void setExhibitionMangeDao(ExhibitionMangeDao exhibitionMangeDao) {
        this.exhibitionMangeDao = exhibitionMangeDao;
    }

    public AuctionDao getAuctionDao() {
		return auctionDao;
	}

	public void setAuctionDao(AuctionDao auctionDao) {
		this.auctionDao = auctionDao;
	}

	public NewsDao getNewsDao() {
		return newsDao;
	}

	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public AlbumCategoryMangeDao getAlbumCategoryMangeDao() {
		return albumCategoryMangeDao;
	}

	public AlbumPhotoMangeDao getAlbumPhotoMangeDao() {
		return albumPhotoMangeDao;
	}

	public BaseInfoManageDao getBaseInfoManageDao() {
		return baseInfoManageDao;
	}

	public ChronologyManageDao getChronologyManageDao() {
		return chronologyManageDao;
	}

	public LoginDao getLoginDao() {
		return LoginDao;
	}

	public PublicBookMangeDao getPublicBookMangeDao() {
		return publicBookMangeDao;
	}

	public WiningExperienceDao getWiningExperienceDao() {
		return winingExperienceDao;
	}

	public void setAlbumCategoryMangeDao(
			AlbumCategoryMangeDao albumCategoryMangeDao) {
		this.albumCategoryMangeDao = albumCategoryMangeDao;
	}

	public void setAlbumPhotoMangeDao(AlbumPhotoMangeDao albumPhotoMangeDao) {
		this.albumPhotoMangeDao = albumPhotoMangeDao;
	}

	public void setBaseInfoManageDao(BaseInfoManageDao baseInfoManageDao) {
		this.baseInfoManageDao = baseInfoManageDao;
	}

	public void setChronologyManageDao(ChronologyManageDao chronologyManageDao) {
		this.chronologyManageDao = chronologyManageDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		LoginDao = loginDao;
	}

	public void setPublicBookMangeDao(PublicBookMangeDao publicBookMangeDao) {
		this.publicBookMangeDao = publicBookMangeDao;
	}

	public void setWiningExperienceDao(WiningExperienceDao winingExperienceDao) {
		this.winingExperienceDao = winingExperienceDao;
	}

}
