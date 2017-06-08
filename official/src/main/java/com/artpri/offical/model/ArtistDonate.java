package com.artpri.offical.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ArtistDonate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="artist_donate"
    ,catalog="jpw"
)

public class ArtistDonate  implements java.io.Serializable {


    // Fields    

     private Integer adId;
     private Integer userNum;
     private Date donateTime;
     private String donateScontent;
     private String donateCategory;
     private Integer donateState;


    // Constructors

    /** default constructor */
    public ArtistDonate() {
    }

    
    /** full constructor */
    public ArtistDonate(Integer userNum, Date donateTime, String donateScontent, String donateCategory, Integer donateState) {
        this.userNum = userNum;
        this.donateTime = donateTime;
        this.donateScontent = donateScontent;
        this.donateCategory = donateCategory;
        this.donateState = donateState;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ad_id", unique=true, nullable=false)

    public Integer getAdId() {
        return this.adId;
    }
    
    public void setAdId(Integer adId) {
        this.adId = adId;
    }
    
    @Column(name="user_num")

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="donate_time", length=10)

    public Date getDonateTime() {
        return this.donateTime;
    }
    
    public void setDonateTime(Date donateTime) {
        this.donateTime = donateTime;
    }
    
    @Column(name="donate_scontent", length=20)

    public String getDonateScontent() {
        return this.donateScontent;
    }
    
    public void setDonateScontent(String donateScontent) {
        this.donateScontent = donateScontent;
    }
    
    @Column(name="donate_category", length=20)

    public String getDonateCategory() {
        return this.donateCategory;
    }
    
    public void setDonateCategory(String donateCategory) {
        this.donateCategory = donateCategory;
    }
    
    @Column(name="donate_state")

    public Integer getDonateState() {
        return this.donateState;
    }
    
    public void setDonateState(Integer donateState) {
        this.donateState = donateState;
    }
   








}