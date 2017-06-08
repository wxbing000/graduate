package com.artpri.offical.pojo;

public class ArtistExhibitionpojo {
	private Integer exhibitId;
	private String exhibitName;
	private String exhibitArea;
	private String exhibitInfo;
	private String exhibitHost;
	private String exhibitMember;
	private String exhibitSundertake;
	private String exhibitJoin;
	private String exhibitRemark;
	private String exhibitTime;
	private String pictureUrl;
	public Integer getExhibitId() {
		return exhibitId;
	}
	public void setExhibitId(Integer exhibitId) {
		this.exhibitId = exhibitId;
	}
	public String getExhibitName() {
		return exhibitName;
	}
	public void setExhibitName(String exhibitName) {
		this.exhibitName = exhibitName;
	}
	public String getExhibitArea() {
		return exhibitArea;
	}
	public void setExhibitArea(String exhibitArea) {
		this.exhibitArea = exhibitArea;
	}
	public String getExhibitInfo() {
		return exhibitInfo;
	}
	public void setExhibitInfo(String exhibitInfo) {
		this.exhibitInfo = exhibitInfo;
	}
	public String getExhibitHost() {
		return exhibitHost;
	}
	public void setExhibitHost(String exhibitHost) {
		this.exhibitHost = exhibitHost;
	}
	public String getExhibitMember() {
		return exhibitMember;
	}
	public void setExhibitMember(String exhibitMember) {
		this.exhibitMember = exhibitMember;
	}
	public String getExhibitSundertake() {
		return exhibitSundertake;
	}
	public void setExhibitSundertake(String exhibitSundertake) {
		this.exhibitSundertake = exhibitSundertake;
	}
	public String getExhibitJoin() {
		return exhibitJoin;
	}
	public void setExhibitJoin(String exhibitJoin) {
		this.exhibitJoin = exhibitJoin;
	}
	public String getExhibitRemark() {
		return exhibitRemark;
	}
	public void setExhibitRemark(String exhibitRemark) {
		this.exhibitRemark = exhibitRemark;
	}
	public String getExhibitTime() {
		return exhibitTime;
	}
	public void setExhibitTime(String exhibitTime) {
		this.exhibitTime = exhibitTime;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	@Override
	public String toString() {
		return "ArtistExhibitionpojo [exhibitId=" + exhibitId
				+ ", exhibitName=" + exhibitName + ", exhibitArea="
				+ exhibitArea + ", exhibitInfo=" + exhibitInfo
				+ ", exhibitHost=" + exhibitHost + ", exhibitMember="
				+ exhibitMember + ", exhibitSundertake=" + exhibitSundertake
				+ ", exhibitJoin=" + exhibitJoin + ", exhibitRemark="
				+ exhibitRemark + ", exhibitTime=" + exhibitTime
				+ ", pictureUrl=" + pictureUrl + "]";
	}
	public ArtistExhibitionpojo(Integer exhibitId, String exhibitName,
			String exhibitArea, String exhibitInfo, String exhibitHost,
			String exhibitMember, String exhibitSundertake, String exhibitJoin,
			String exhibitRemark, String exhibitTime, String pictureUrl) {
		super();
		this.exhibitId = exhibitId;
		this.exhibitName = exhibitName;
		this.exhibitArea = exhibitArea;
		this.exhibitInfo = exhibitInfo;
		this.exhibitHost = exhibitHost;
		this.exhibitMember = exhibitMember;
		this.exhibitSundertake = exhibitSundertake;
		this.exhibitJoin = exhibitJoin;
		this.exhibitRemark = exhibitRemark;
		this.exhibitTime = exhibitTime;
		this.pictureUrl = pictureUrl;
	}
	
}
