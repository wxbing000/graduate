package com.artpri.artist.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/19  14:13
 */
@Entity
@Table(name = "artist_news", schema = "", catalog = "jpw")
public class ArtistNews {
    private int anId;
    private Integer userNum;
    private String newsName;
    private Timestamp newsTime;
    private String newsDigest;
    private String newsContent;
    private String newsResource;
    private String newsAuthor;
    private Integer newsState;

    @Id
    @Column(name = "an_id")
    public int getAnId() {
        return anId;
    }

    public void setAnId(int anId) {
        this.anId = anId;
    }

    @Basic
    @Column(name = "userNum")
    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    @Basic
    @Column(name = "news_name")
    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    @Basic
    @Column(name = "news_time")
    public Timestamp getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Timestamp newsTime) {
        this.newsTime = newsTime;
    }

    @Basic
    @Column(name = "news_digest")
    public String getNewsDigest() {
        return newsDigest;
    }

    public void setNewsDigest(String newsDigest) {
        this.newsDigest = newsDigest;
    }

    @Basic
    @Column(name = "news_content")
    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    @Basic
    @Column(name = "news_resource")
    public String getNewsResource() {
        return newsResource;
    }

    public void setNewsResource(String newsResource) {
        this.newsResource = newsResource;
    }

    @Basic
    @Column(name = "news_author")
    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    @Basic
    @Column(name = "news_state")
    public Integer getNewsState() {
        return newsState;
    }

    public void setNewsState(Integer newsState) {
        this.newsState = newsState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtistNews that = (ArtistNews) o;

        if (anId != that.anId) return false;
        if (newsAuthor != null ? !newsAuthor.equals(that.newsAuthor) : that.newsAuthor != null) return false;
        if (newsContent != null ? !newsContent.equals(that.newsContent) : that.newsContent != null) return false;
        if (newsDigest != null ? !newsDigest.equals(that.newsDigest) : that.newsDigest != null) return false;
        if (newsName != null ? !newsName.equals(that.newsName) : that.newsName != null) return false;
        if (newsResource != null ? !newsResource.equals(that.newsResource) : that.newsResource != null) return false;
        if (newsState != null ? !newsState.equals(that.newsState) : that.newsState != null) return false;
        if (newsTime != null ? !newsTime.equals(that.newsTime) : that.newsTime != null) return false;
        if (userNum != null ? !userNum.equals(that.userNum) : that.userNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anId;
        result = 31 * result + (userNum != null ? userNum.hashCode() : 0);
        result = 31 * result + (newsName != null ? newsName.hashCode() : 0);
        result = 31 * result + (newsTime != null ? newsTime.hashCode() : 0);
        result = 31 * result + (newsDigest != null ? newsDigest.hashCode() : 0);
        result = 31 * result + (newsContent != null ? newsContent.hashCode() : 0);
        result = 31 * result + (newsResource != null ? newsResource.hashCode() : 0);
        result = 31 * result + (newsAuthor != null ? newsAuthor.hashCode() : 0);
        result = 31 * result + (newsState != null ? newsState.hashCode() : 0);
        return result;
    }
}
