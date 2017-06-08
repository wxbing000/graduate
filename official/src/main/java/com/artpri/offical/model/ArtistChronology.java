package com.artpri.offical.model;

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
     /** default constructor */
    public ArtistChronology() {
    }


    // Constructors

    /** full constructor */
    public ArtistChronology(Integer userNum, String acYear, String acEvent) {
        this.userNum = userNum;
        this.acYear = acYear;
        this.acEvent = acEvent;
    }

    
    @Column(name="ac_event", nullable=false, length=1000)

    public String getAcEvent() {
        return this.acEvent;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ac_id", unique=true, nullable=false)

    public Integer getAcId() {
        return this.acId;
    }
    
    @Column(name="ac_year", nullable=false, length=10)

    public String getAcYear() {
        return this.acYear;
    }
    
    @Column(name="user_num", nullable=false)

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setAcEvent(String acEvent) {
        this.acEvent = acEvent;
    }
    
    public void setAcId(Integer acId) {
        this.acId = acId;
    }
    
    public void setAcYear(String acYear) {
        this.acYear = acYear;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    
    @Override
	public String toString() {
		return "ArtistChronology [acId=" + acId + ", userNum=" + userNum
				+ ", acYear=" + acYear + ", acEvent=" + acEvent + "]";
	}
   








}