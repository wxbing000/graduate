package com.artpri.offical.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

/**
 * ArtistExhibition entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "artist_exhibition", catalog = "jpw", schema = "")
public class ArtistExhibition implements Serializable {

	// Fields

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
    private Integer userNum;

	// Constructors
    private String exhibitionPicture;

	/** default constructor */
	public ArtistExhibition() {
	}

	/** minimal constructor */
	public ArtistExhibition(String exhibitName) {
		this.exhibitName = exhibitName;
	}

	/** full constructor */
	public ArtistExhibition(String exhibitName, String exhibitArea,
			String exhibitInfo, String exhibitHost, String exhibitMember,
			String exhibitSundertake, String exhibitJoin, String exhibitRemark,
			String exhibitTime) {
		this.exhibitName = exhibitName;
		this.exhibitArea = exhibitArea;
		this.exhibitInfo = exhibitInfo;
		this.exhibitHost = exhibitHost;
		this.exhibitMember = exhibitMember;
		this.exhibitSundertake = exhibitSundertake;
		this.exhibitJoin = exhibitJoin;
		this.exhibitRemark = exhibitRemark;
		this.exhibitTime = exhibitTime;
	}

    public void setExhibitId(int exhibitId) {
        this.exhibitId = exhibitId;
    }

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "exhibit_id", unique = true, nullable = false)
	public Integer getExhibitId() {
		return this.exhibitId;
	}

	public void setExhibitId(Integer exhibitId) {
		this.exhibitId = exhibitId;
	}

	@Basic
    @Column(name = "exhibit_name", nullable = false, length = 60)
	public String getExhibitName() {
		return this.exhibitName;
	}

	public void setExhibitName(String exhibitName) {
		this.exhibitName = exhibitName;
	}

	@Basic
    @Column(name = "exhibit_area", length = 60)
	public String getExhibitArea() {
		return this.exhibitArea;
	}

	public void setExhibitArea(String exhibitArea) {
		this.exhibitArea = exhibitArea;
	}

	@Basic
    @Column(name = "exhibit_info", length = 65535)
	public String getExhibitInfo() {
		return this.exhibitInfo;
	}

	public void setExhibitInfo(String exhibitInfo) {
		this.exhibitInfo = exhibitInfo;
	}

	@Basic
    @Column(name = "exhibit_host", length = 100)
	public String getExhibitHost() {
		return this.exhibitHost;
	}

	public void setExhibitHost(String exhibitHost) {
		this.exhibitHost = exhibitHost;
	}

	@Basic
    @Column(name = "exhibit_member", length = 150)
	public String getExhibitMember() {
		return this.exhibitMember;
	}

	public void setExhibitMember(String exhibitMember) {
		this.exhibitMember = exhibitMember;
	}

	@Basic
    @Column(name = "exhibit_sundertake", length = 100)
	public String getExhibitSundertake() {
		return this.exhibitSundertake;
	}

	public void setExhibitSundertake(String exhibitSundertake) {
		this.exhibitSundertake = exhibitSundertake;
	}

	@Basic
    @Column(name = "exhibit_join", length = 100)
	public String getExhibitJoin() {
		return this.exhibitJoin;
	}

	public void setExhibitJoin(String exhibitJoin) {
		this.exhibitJoin = exhibitJoin;
	}

	@Basic
    @Column(name = "exhibit_remark", length = 200)
	public String getExhibitRemark() {
		return this.exhibitRemark;
	}

	public void setExhibitRemark(String exhibitRemark) {
		this.exhibitRemark = exhibitRemark;
	}

	@Basic
    @Column(name = "exhibit_time", length = 30)
	public String getExhibitTime() {
		return this.exhibitTime;
	}

	public void setExhibitTime(String exhibitTime) {
		this.exhibitTime = exhibitTime;
	}

    @Basic
    @Column(name = "user_num")
    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    @Basic
    @Column(name = "exhibition_picture")
    public String getExhibitionPicture() {
        return exhibitionPicture;
    }

    public void setExhibitionPicture(String exhibitionPicture) {
        this.exhibitionPicture = exhibitionPicture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtistExhibition that = (ArtistExhibition) o;

        if (exhibitArea != null ? !exhibitArea.equals(that.exhibitArea) : that.exhibitArea != null) return false;
        if (exhibitHost != null ? !exhibitHost.equals(that.exhibitHost) : that.exhibitHost != null) return false;
        if (exhibitId != null ? !exhibitId.equals(that.exhibitId) : that.exhibitId != null) return false;
        if (exhibitInfo != null ? !exhibitInfo.equals(that.exhibitInfo) : that.exhibitInfo != null) return false;
        if (exhibitJoin != null ? !exhibitJoin.equals(that.exhibitJoin) : that.exhibitJoin != null) return false;
        if (exhibitMember != null ? !exhibitMember.equals(that.exhibitMember) : that.exhibitMember != null)
            return false;
        if (exhibitName != null ? !exhibitName.equals(that.exhibitName) : that.exhibitName != null) return false;
        if (exhibitRemark != null ? !exhibitRemark.equals(that.exhibitRemark) : that.exhibitRemark != null)
            return false;
        if (exhibitSundertake != null ? !exhibitSundertake.equals(that.exhibitSundertake) : that.exhibitSundertake != null)
            return false;
        if (exhibitTime != null ? !exhibitTime.equals(that.exhibitTime) : that.exhibitTime != null) return false;
        if (exhibitionPicture != null ? !exhibitionPicture.equals(that.exhibitionPicture) : that.exhibitionPicture != null)
            return false;
        if (userNum != null ? !userNum.equals(that.userNum) : that.userNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = exhibitId != null ? exhibitId.hashCode() : 0;
        result = 31 * result + (userNum != null ? userNum.hashCode() : 0);
        result = 31 * result + (exhibitName != null ? exhibitName.hashCode() : 0);
        result = 31 * result + (exhibitArea != null ? exhibitArea.hashCode() : 0);
        result = 31 * result + (exhibitInfo != null ? exhibitInfo.hashCode() : 0);
        result = 31 * result + (exhibitHost != null ? exhibitHost.hashCode() : 0);
        result = 31 * result + (exhibitMember != null ? exhibitMember.hashCode() : 0);
        result = 31 * result + (exhibitSundertake != null ? exhibitSundertake.hashCode() : 0);
        result = 31 * result + (exhibitJoin != null ? exhibitJoin.hashCode() : 0);
        result = 31 * result + (exhibitRemark != null ? exhibitRemark.hashCode() : 0);
        result = 31 * result + (exhibitTime != null ? exhibitTime.hashCode() : 0);
        result = 31 * result + (exhibitionPicture != null ? exhibitionPicture.hashCode() : 0);
        return result;
    }
}