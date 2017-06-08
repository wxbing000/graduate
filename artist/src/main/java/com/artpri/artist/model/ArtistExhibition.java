package com.artpri.artist.model;

import javax.persistence.*;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/19  17:00
 */
@Entity
@Table(name = "artist_exhibition", schema = "", catalog = "jpw")
public class ArtistExhibition {
    private int exhibitId;
    private String exhibitName;
    private String exhibitArea;
    private String exhibitInfo;
    private String exhibitHost;
    private String exhibitMember;
    private String exhibitSundertake;
    private String exhibitJoin;
    private String exhibitRemark;
    private String exhibitTime;
    private String exhibitionPicture;
    private Integer userNum;

    public ArtistExhibition() {
    }

    public ArtistExhibition(String exhibitName, String exhibitArea, String exhibitInfo, String exhibitHost, String exhibitMember, String exhibitSundertake, String exhibitJoin, String exhibitRemark, String exhibitTime) {
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

    @Id
    @Column(name = "exhibit_id")
    public int getExhibitId() {
        return exhibitId;
    }

    public void setExhibitId(int exhibitId) {
        this.exhibitId = exhibitId;
    }

    @Basic
    @Column(name = "exhibit_name")
    public String getExhibitName() {
        return exhibitName;
    }

    public void setExhibitName(String exhibitName) {
        this.exhibitName = exhibitName;
    }

    @Basic
    @Column(name = "exhibit_area")
    public String getExhibitArea() {
        return exhibitArea;
    }

    public void setExhibitArea(String exhibitArea) {
        this.exhibitArea = exhibitArea;
    }

    @Basic
    @Column(name = "exhibit_info")
    public String getExhibitInfo() {
        return exhibitInfo;
    }

    public void setExhibitInfo(String exhibitInfo) {
        this.exhibitInfo = exhibitInfo;
    }

    @Basic
    @Column(name = "exhibit_host")
    public String getExhibitHost() {
        return exhibitHost;
    }

    public void setExhibitHost(String exhibitHost) {
        this.exhibitHost = exhibitHost;
    }

    @Basic
    @Column(name = "exhibit_member")
    public String getExhibitMember() {
        return exhibitMember;
    }

    public void setExhibitMember(String exhibitMember) {
        this.exhibitMember = exhibitMember;
    }

    @Basic
    @Column(name = "exhibit_sundertake")
    public String getExhibitSundertake() {
        return exhibitSundertake;
    }

    public void setExhibitSundertake(String exhibitSundertake) {
        this.exhibitSundertake = exhibitSundertake;
    }

    @Basic
    @Column(name = "exhibit_join")
    public String getExhibitJoin() {
        return exhibitJoin;
    }

    public void setExhibitJoin(String exhibitJoin) {
        this.exhibitJoin = exhibitJoin;
    }

    @Basic
    @Column(name = "exhibit_remark")
    public String getExhibitRemark() {
        return exhibitRemark;
    }

    public void setExhibitRemark(String exhibitRemark) {
        this.exhibitRemark = exhibitRemark;
    }

    @Basic
    @Column(name = "exhibit_time")
    public String getExhibitTime() {
        return exhibitTime;
    }

    public void setExhibitTime(String exhibitTime) {
        this.exhibitTime = exhibitTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtistExhibition that = (ArtistExhibition) o;

        if (exhibitId != that.exhibitId) return false;
        if (exhibitArea != null ? !exhibitArea.equals(that.exhibitArea) : that.exhibitArea != null) return false;
        if (exhibitHost != null ? !exhibitHost.equals(that.exhibitHost) : that.exhibitHost != null) return false;
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = exhibitId;
        result = 31 * result + (exhibitName != null ? exhibitName.hashCode() : 0);
        result = 31 * result + (exhibitArea != null ? exhibitArea.hashCode() : 0);
        result = 31 * result + (exhibitInfo != null ? exhibitInfo.hashCode() : 0);
        result = 31 * result + (exhibitHost != null ? exhibitHost.hashCode() : 0);
        result = 31 * result + (exhibitMember != null ? exhibitMember.hashCode() : 0);
        result = 31 * result + (exhibitSundertake != null ? exhibitSundertake.hashCode() : 0);
        result = 31 * result + (exhibitJoin != null ? exhibitJoin.hashCode() : 0);
        result = 31 * result + (exhibitRemark != null ? exhibitRemark.hashCode() : 0);
        result = 31 * result + (exhibitTime != null ? exhibitTime.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "exhibition_picture")
    public String getExhibitionPicture() {
        return exhibitionPicture;
    }

    public void setExhibitionPicture(String exhibitionPicture) {
        this.exhibitionPicture = exhibitionPicture;
    }

    @Basic
    @Column(name = "user_num")
    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
}
