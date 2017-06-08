/**
 *
 */
package com.artpri.offical.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.artpri.offical.model.ArtistAward;
import com.artpri.offical.model.ArtistBook;
import com.artpri.offical.model.ArtistChronology;
import com.artpri.offical.model.ArtistInfo;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.pojo.HomePageNews;
import com.artpri.offical.pojo.RecommendGoods;
import com.artpri.offical.service.ArtistAwardService;
import com.artpri.offical.service.ArtistBookService;
import com.artpri.offical.service.ArtistChronologyService;
import com.artpri.offical.service.ArtistExhibitionService;
import com.artpri.offical.service.ArtistInfoService;
import com.artpri.offical.service.ArtistNewsService;
import com.artpri.offical.service.ArtistRecommendService;
import com.artpri.offical.service.ArtistTopService;
import com.artpri.offical.service.UserInfoService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * <p>
 * Description: 读取艺术家官网首页action
 * </p>
 *
 * @author 王校兵
 * @version 1.0
 * @time 2016年9月5日下午8:04:37
 */
@Controller(value = "homePageAction")
public class HomePageAction extends ActionSupport {

    //用户编码
    private int userNum;

    @Autowired
    private ArtistTopService artistTopService;

    //顶部图片的url
    private ArtistTop topPictureUrl;

    @Autowired
    private ArtistRecommendService artistRecommendService;

    //首页轮播图片
    private List<RecommendGoods> lunbo;

    //首页推荐作品
    private List<RecommendGoods> recommend;

    @Autowired
    private ArtistNewsService artistNewsService;

    //首页上的新闻的集合
    private List<HomePageNews> news;

    //首页上的艺术家评论集合
    private List<HomePageNews> comment;

    @Autowired
    private ArtistExhibitionService artistExhibitionService;

    //首页上的展览信息
    private List exhibitioninfo;

    @Autowired
    private ArtistBookService artistBookService;


    /**
     * 首页上的图书集合
     */
    private List<ArtistBook> bookList;


    @Autowired
    private ArtistInfoService artistInfoService;

    /**
     * 用户个人信息
     */
    private ArtistInfo info;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Autowired
    private UserInfoService userInfoService;

    /**
     * 用户名
     */
    private String userName;
    private String userPicture;

    @Autowired
    private ArtistChronologyService artistChronologyService;

    /**
     * 用户年表
     */
    private List<ArtistChronology> chronology;

    @Autowired
    private ArtistAwardService artistAwardService;

    /**
     * 艺术家获奖信息
     */
    private List<ArtistAward> award;


    /**
     * 取到官网首页页面中的信息
     *
     * @return 返回页面跳转的代码
     */
    public String homePageInfo() {
        //顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        //第一个轮播图
        lunbo = artistRecommendService.getUserRecommendGoods(userNum, "paint", 1);
        //推荐作品
        recommend = artistRecommendService.getUserRecommendGoods(userNum, "paint", 2);
        //新闻资讯
        news = artistNewsService.getHomePageNewsByUserNum(userNum);

        //艺术家评论
        comment = artistNewsService.getHomePageCommentByUserNum(userNum);

        //展览
        exhibitioninfo = artistExhibitionService.getHomePageExhibitionByUserNum(userNum);
        if (exhibitioninfo.size() < 4) {
            exhibitioninfo = exhibitioninfo.subList(0, exhibitioninfo.size());
        }else{
            exhibitioninfo = exhibitioninfo.subList(0, 4);

        }
        //图书
        bookList = artistBookService.getHomePageBookByUserNum(userNum);

        //用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        userPicture = userInfoService.getUserPictureByUserNum(userNum);

        //艺术家基本信息
        info = artistInfoService.getHomepageInfoByUserNum(userNum);

        //年表
        chronology = artistChronologyService.getHomePageInfoByUserNum(userNum);

        //获奖
        award = artistAwardService.getHomePageInfoByUserNum(userNum);

        return SUCCESS;
    }

    public List<ArtistAward> getAward() {
        return award;
    }

    public List<ArtistChronology> getChronology() {
        return chronology;
    }

    public List<HomePageNews> getComment() {
        return comment;
    }

    public ArtistInfo getInfo() {
        return info;
    }

    public List<RecommendGoods> getLunbo() {
        return lunbo;
    }

    public List<HomePageNews> getNews() {
        return news;
    }

    public List<RecommendGoods> getRecommend() {
        return recommend;
    }

    public ArtistTop getTopPictureUrl() {
        return topPictureUrl;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setAward(List<ArtistAward> award) {
        this.award = award;
    }

    public List<ArtistBook> getBookList() {
        return bookList;
    }

    public void setBookList(List<ArtistBook> bookList) {
        this.bookList = bookList;
    }

    public void setChronology(List<ArtistChronology> chronology) {
        this.chronology = chronology;
    }

    public void setComment(List<HomePageNews> comment) {
        this.comment = comment;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public void setInfo(ArtistInfo info) {
        this.info = info;
    }

    public void setLunbo(List<RecommendGoods> lunbo) {
        this.lunbo = lunbo;
    }

    public void setNews(List<HomePageNews> news) {
        this.news = news;
    }


    public void setRecommend(List<RecommendGoods> recommend) {
        this.recommend = recommend;
    }


    public void setTopPictureUrl(ArtistTop topPictureUrl) {
        this.topPictureUrl = topPictureUrl;
    }


    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public ArtistTopService getArtistTopService() {
        return artistTopService;
    }

    public void setArtistTopService(ArtistTopService artistTopService) {
        this.artistTopService = artistTopService;
    }

    public ArtistRecommendService getArtistRecommendService() {
        return artistRecommendService;
    }

    public void setArtistRecommendService(
            ArtistRecommendService artistRecommendService) {
        this.artistRecommendService = artistRecommendService;
    }

    public ArtistNewsService getArtistNewsService() {
        return artistNewsService;
    }

    public void setArtistNewsService(ArtistNewsService artistNewsService) {
        this.artistNewsService = artistNewsService;
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

    public ArtistBookService getArtistBookService() {
        return artistBookService;
    }

    public void setArtistBookService(ArtistBookService artistBookService) {
        this.artistBookService = artistBookService;
    }

    public ArtistInfoService getArtistInfoService() {
        return artistInfoService;
    }

    public void setArtistInfoService(ArtistInfoService artistInfoService) {
        this.artistInfoService = artistInfoService;
    }

    public UserInfoService getUserInfoService() {
        return userInfoService;
    }

    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    public ArtistChronologyService getArtistChronologyService() {
        return artistChronologyService;
    }

    public void setArtistChronologyService(
            ArtistChronologyService artistChronologyService) {
        this.artistChronologyService = artistChronologyService;
    }

    public ArtistAwardService getArtistAwardService() {
        return artistAwardService;
    }

    public void setArtistAwardService(ArtistAwardService artistAwardService) {
        this.artistAwardService = artistAwardService;
    }
}
