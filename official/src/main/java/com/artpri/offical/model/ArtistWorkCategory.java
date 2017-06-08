package com.artpri.offical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ArtistWorkCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="artist_work_category"
    ,catalog="jpw"
)

public class ArtistWorkCategory  implements java.io.Serializable {


    // Fields    

     private Integer awcId;
     private Integer userNum;
     private String awcName;
     private String awcDescribe;


    // Constructors

    /** default constructor */
    public ArtistWorkCategory() {
    }

    
    /** full constructor */
    public ArtistWorkCategory(Integer userNum, String awcName, String awcDescribe) {
        this.userNum = userNum;
        this.awcName = awcName;
        this.awcDescribe = awcDescribe;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="awc_id", unique=true, nullable=false)

    public Integer getAwcId() {
        return this.awcId;
    }
    
    public void setAwcId(Integer awcId) {
        this.awcId = awcId;
    }
    
    @Column(name="user_num")

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    
    @Column(name="awc_name", length=30)

    public String getAwcName() {
        return this.awcName;
    }
    
    public void setAwcName(String awcName) {
        this.awcName = awcName;
    }
    
    @Column(name="awc_describe", length=100)

    public String getAwcDescribe() {
        return this.awcDescribe;
    }
    
    public void setAwcDescribe(String awcDescribe) {
        this.awcDescribe = awcDescribe;
    }
   








}