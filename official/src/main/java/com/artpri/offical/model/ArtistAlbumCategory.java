package com.artpri.offical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ArtistAlbumCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="artist_album_category"
    ,catalog="jpw"
)

public class ArtistAlbumCategory  implements java.io.Serializable {


    // Fields    

     private Integer aacId;
     private Integer userNum;
     private String aacName;


    // Constructors

    /** default constructor */
    public ArtistAlbumCategory() {
    }

	/** minimal constructor */
    public ArtistAlbumCategory(Integer userNum) {
        this.userNum = userNum;
    }
    
    /** full constructor */
    public ArtistAlbumCategory(Integer userNum, String aacName) {
        this.userNum = userNum;
        this.aacName = aacName;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="aac_id", unique=true, nullable=false)

    public Integer getAacId() {
        return this.aacId;
    }
    
    public void setAacId(Integer aacId) {
        this.aacId = aacId;
    }
    
    @Column(name="user_num", nullable=false)

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    
    @Column(name="aac_name", length=100)

    public String getAacName() {
        return this.aacName;
    }
    
    public void setAacName(String aacName) {
        this.aacName = aacName;
    }
   








}