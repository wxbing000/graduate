package com.artpri.offical.action;

import com.artpri.offical.model.ArtistNews;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.service.ArtistNewsService;
import com.artpri.offical.service.ArtistTopService;
import com.artpri.offical.service.UserInfoService;
import com.artpri.offical.util.Page;
import com.artpri.offical.util.PageUtil;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("NewsPageAction")
public class NewsPageAction extends ActionSupport {

    private int userNum;
    private int anId;
    private String userName;
    private ArtistTop topPictureUrl;
    private int currentPage = 1;
    @Autowired
    private ArtistNewsService artistNewsService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ArtistTopService artistTopService;
    private List<ArtistNews> newsList;
    private List<ArtistNews> newsinfo;

    public String getNews() {
        System.out.println("new page===============" + currentPage);
        // 用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        // 顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        newsList = artistNewsService.getNewsPageNewsByUserNum(userNum);
        /**
         * 分页用的一堆东西
         */
        Page page = PageUtil.createPage(5, newsList.size(), currentPage);
        int endIndex = page.getBeginIndex() + page.getEveryPage();
        if ((page.getBeginIndex() + page.getEveryPage()) >= page.getTotalCount()) {
            endIndex = page.getTotalCount();
        }
        newsList = newsList.subList(page.getBeginIndex(), endIndex);
        ServletActionContext.getRequest().setAttribute("page", page);
        return SUCCESS;

    }

    public String getNewsInfo() {
        newsinfo = artistNewsService.getNewsinfoById(anId);
        return SUCCESS;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public ArtistNewsService getArtistNewsService() {
        return artistNewsService;
    }

    public void setArtistNewsService(ArtistNewsService artistNewsService) {
        this.artistNewsService = artistNewsService;
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

    public int getAnId() {
        return anId;
    }

    public void setAnId(int anId) {
        this.anId = anId;
    }

    public List<ArtistNews> getNewsinfo() {
        return newsinfo;
    }

    public void setNewsinfo(List<ArtistNews> newsinfo) {
        this.newsinfo = newsinfo;
    }

    public List<ArtistNews> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<ArtistNews> newsList) {
        this.newsList = newsList;
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
