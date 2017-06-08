package com.artpri.offical.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.artpri.offical.model.ArtistBook;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.service.ArtistBookService;
import com.artpri.offical.service.ArtistTopService;
import com.artpri.offical.service.UserInfoService;
import com.artpri.offical.util.Page;
import com.artpri.offical.util.PageUtil;
import com.opensymphony.xwork2.ActionSupport;

@Controller("BookPageAction")
public class BookPageAction extends ActionSupport {

    private int userNum;
    private String userName;
    private ArtistTop topPictureUrl;
    private int bookId;
    private int currentPage;
    @Autowired
    private ArtistBookService artistBookService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ArtistTopService artistTopService;
    private List<ArtistBook> bookList;
    private List<ArtistBook> allBook;
    private List<ArtistBook> bookInfo;

    public String allBook() {
        // 用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        // 顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        bookList = artistBookService.getHomePageBookByUserNum(userNum);
        allBook = artistBookService.getallBookByUserNum(userNum);
        /**
         * 分页用的一堆东西
         */
        Page page = PageUtil.createPage(8, allBook.size(), currentPage);
        int endIndex = page.getBeginIndex() + page.getEveryPage();
        if ((page.getBeginIndex() + page.getEveryPage()) >= page.getTotalCount()) {
            endIndex = page.getTotalCount();
        }
        allBook = allBook.subList(page.getBeginIndex(), endIndex);
        ServletActionContext.getRequest().setAttribute("page", page);//保存记录到request范围
        return SUCCESS;

    }

    public String bookInfo() {
        // 用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        // 顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        bookInfo = artistBookService.getBookInfoById(bookId);
        return SUCCESS;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public ArtistBookService getArtistBookService() {
        return artistBookService;
    }

    public void setArtistBookService(ArtistBookService artistBookService) {
        this.artistBookService = artistBookService;
    }

    public List<ArtistBook> getBookList() {
        return bookList;
    }

    public void setBookList(List<ArtistBook> bookList) {
        this.bookList = bookList;
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

    public List<ArtistBook> getAllBook() {
        return allBook;
    }

    public void setAllBook(List<ArtistBook> allBook) {
        this.allBook = allBook;
    }

    public List<ArtistBook> getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(List<ArtistBook> bookInfo) {
        this.bookInfo = bookInfo;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

}
