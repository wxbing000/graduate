package com.artpri.offical.pojo;

import java.sql.Timestamp;

public class NewsPagepojo {
	private Integer anId;
    private String newsCategory;
    private String newsName;
    private Timestamp newsTime;
    private String newsDigest;
    private String newsContent;
    private String newsResource;
    private String newsAuthor;
    private Integer newsState;
	public Integer getAnId() {
		return anId;
	}
	public void setAnId(Integer anId) {
		this.anId = anId;
	}
	public String getNewsCategory() {
		return newsCategory;
	}
	public void setNewsCategory(String newsCategory) {
		this.newsCategory = newsCategory;
	}
	public String getNewsName() {
		return newsName;
	}
	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}
	public Timestamp getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(Timestamp newsTime) {
		this.newsTime = newsTime;
	}
	public String getNewsDigest() {
		return newsDigest;
	}
	public void setNewsDigest(String newsDigest) {
		this.newsDigest = newsDigest;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getNewsResource() {
		return newsResource;
	}
	public void setNewsResource(String newsResource) {
		this.newsResource = newsResource;
	}
	public String getNewsAuthor() {
		return newsAuthor;
	}
	public void setNewsAuthor(String newsAuthor) {
		this.newsAuthor = newsAuthor;
	}
	public Integer getNewsState() {
		return newsState;
	}
	public void setNewsState(Integer newsState) {
		this.newsState = newsState;
	}
	@Override
	public String toString() {
		return "NewsPagepojo [anId=" + anId + ", newsCategory=" + newsCategory
				+ ", newsName=" + newsName + ", newsTime=" + newsTime
				+ ", newsDigest=" + newsDigest + ", newsContent=" + newsContent
				+ ", newsResource=" + newsResource + ", newsAuthor="
				+ newsAuthor + ", newsState=" + newsState + "]";
	}
	public NewsPagepojo(Integer anId, String newsCategory, String newsName,
			Timestamp newsTime, String newsDigest, String newsContent,
			String newsResource, String newsAuthor, Integer newsState) {
		super();
		this.anId = anId;
		this.newsCategory = newsCategory;
		this.newsName = newsName;
		this.newsTime = newsTime;
		this.newsDigest = newsDigest;
		this.newsContent = newsContent;
		this.newsResource = newsResource;
		this.newsAuthor = newsAuthor;
		this.newsState = newsState;
	}
    
}
