/**
 *
 */
package com.artpri.artist.action;

import com.artpri.artist.model.ArtistNews;

import java.util.List;

/**
 * @author 王校兵
 * @version 1.0, 2017年2月17日
 */
public class NewsAction extends BaseAction {
    private String newsContent;
    private String newsTitle;
    private String newsDigest;
    private List<ArtistNews> allNew;
    private ArtistNews aNew;
    private int newsId;
    private String newsResource;
    private String message = "";

    public String addNews() {
        newsService.addNews(newsTitle, newsContent, newsDigest,newsResource);
        return SUCCESS;
    }

    public String getAllNews() {
        allNew = null;
        allNew = newsService.allNews();
        return SUCCESS;
    }

    public String newsDetail() {
        aNew = newsService.findNew(newsId);
        System.out.println(aNew.getNewsContent());
        return SUCCESS;
    }

    public String delNew() {
        message = null;
        message = "删除成功";
        newsService.delNew(newsId);
        return SUCCESS;
    }

    public String getNewsResource() {
        return newsResource;
    }

    public void setNewsResource(String newsResource) {
        this.newsResource = newsResource;
    }

    public ArtistNews getaNew() {
        return aNew;
    }

    public void setaNew(ArtistNews aNew) {
        this.aNew = aNew;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public List<ArtistNews> getAllNew() {
        return allNew;
    }

    public void setAllNew(List<ArtistNews> allNew) {
        this.allNew = allNew;
    }

    public ArtistNews getANew() {
        return aNew;
    }

    public void setANew(ArtistNews aNew) {
        this.aNew = aNew;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsDigest() {
        return newsDigest;
    }

    public void setNewsDigest(String newsDigest) {
        this.newsDigest = newsDigest;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
