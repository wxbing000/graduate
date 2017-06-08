package com.artpri.offical.action;

import com.artpri.offical.model.ArtistLeave;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.service.ArtistLeaveService;
import com.artpri.offical.service.ArtistTopService;
import com.artpri.offical.service.UserInfoService;
import com.artpri.offical.util.Page;
import com.artpri.offical.util.PageUtil;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.Timestamp;
import java.util.List;

@Controller("LeavePageAction")
public class LeavePageAction extends ActionSupport {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String userName;
    private ArtistTop topPictureUrl;
    private int userNum;
    private String alName;
    private Timestamp alTime;
    private String alContent;
    //private ArtistLeave artistLeave;
    @Autowired
    private ArtistLeaveService artistLeaveService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private ArtistTopService artistTopService;
    private List<ArtistLeave> leaveList;
    private int currentPage;

    public String getLeave() {
        // 用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        // 顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        leaveList = artistLeaveService.getallLeavemessage(userNum);
        /**
         * 分页用的一堆东西
         */
        Page page = PageUtil.createPage(8, leaveList.size(), currentPage);
        int endIndex = page.getBeginIndex() + page.getEveryPage();
        if ((page.getBeginIndex() + page.getEveryPage()) >= page.getTotalCount()) {
            endIndex = page.getTotalCount();
        }
        leaveList = leaveList.subList(page.getBeginIndex(), endIndex);
        ServletActionContext.getRequest().setAttribute("page", page);
        return SUCCESS;

    }

    public String fabiaoLeave() {
        // 用户名
        userName = userInfoService.getUserNameByUserNum(userNum);
        // 顶部图片
        topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);
        ArtistLeave artistLeave = new ArtistLeave();
        artistLeave.setAlContent(alContent);
        artistLeave.setAlName(alName);
        artistLeave.setAlTime(new Timestamp(System.currentTimeMillis()));
        artistLeave.setUserNum(userNum);
        artistLeaveService.saveLeave(artistLeave);
        return SUCCESS;
    }

    public ArtistLeaveService getArtistLeaveService() {
        return artistLeaveService;
    }

    public void setArtistLeaveService(ArtistLeaveService artistLeaveService) {
        this.artistLeaveService = artistLeaveService;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<ArtistLeave> getLeaveList() {
        return leaveList;
    }

    public void setLeaveList(List<ArtistLeave> leaveList) {
        this.leaveList = leaveList;
    }

    public String getUserName() {
        return userName;
    }

    public String getAlName() {
        return alName;
    }

    public void setAlName(String alName) {
        this.alName = alName;
    }

    public Timestamp getAlTime() {
        return alTime;
    }

    public void setAlTime(Timestamp alTime) {
        this.alTime = alTime;
    }

    public String getAlContent() {
        return alContent;
    }

    public void setAlContent(String alContent) {
        this.alContent = alContent;
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
