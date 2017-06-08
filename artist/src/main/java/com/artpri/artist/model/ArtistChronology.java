package com.artpri.artist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ArtistChronology entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="artist_chronology"
    ,catalog="jpw"
)

public class ArtistChronology  implements java.io.Serializable {


    // Fields    

     private Integer acId;
     private Integer userNum;
     private String acYear;
     private String acEvent;


    // Constructors

    /** default constructor */
    public ArtistChronology() {
    }

    
    /** full constructor */
    public ArtistChronology(Integer userNum, String acYear, String acEvent) {
        this.userNum = userNum;
        this.acYear = acYear;
        this.acEvent = acEvent;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ac_id", unique=true, nullable=false)

    public Integer getAcId() {
        return this.acId;
    }
    
    public void setAcId(Integer acId) {
        this.acId = acId;
    }
    
    @Column(name="user_num", nullable=false)

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    
    @Column(name="ac_year", nullable=false, length=10)

    public String getAcYear() {
        return this.acYear;
    }
    
    public void setAcYear(String acYear) {
        this.acYear = acYear;
    }
    
    @Column(name="ac_event", nullable=false, length=200)

    public String getAcEvent() {
        return this.acEvent;
    }
    
    public void setAcEvent(String acEvent) {
        this.acEvent = acEvent;
    }
   








}