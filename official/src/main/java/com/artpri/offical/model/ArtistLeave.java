package com.artpri.offical.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ArtistLeave entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="artist_leave"
    ,catalog="jpw"
)

public class ArtistLeave  implements java.io.Serializable {


    // Fields    

     private Integer alId;
     private Integer userNum;
     private String alName;
     private Timestamp alTime;
     private String alContent;


    // Constructors

    /** default constructor */
    public ArtistLeave() {
    }

    
    /** full constructor */
    public ArtistLeave(Integer userNum, String alName, Timestamp alTime, String alContent) {
        this.userNum = userNum;
        this.alName = alName;
        this.alTime = alTime;
        this.alContent = alContent;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="al_id", unique=true, nullable=false)

    public Integer getAlId() {
        return this.alId;
    }
    
    public void setAlId(Integer alId) {
        this.alId = alId;
    }
    
    @Column(name="user_num", nullable=false)

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    
    @Column(name="al_name", nullable=false, length=60)

    public String getAlName() {
        return this.alName;
    }
    
    public void setAlName(String alName) {
        this.alName = alName;
    }
    
    @Column(name="al_time", nullable=false, length=19)

    public Timestamp getAlTime() {
        return this.alTime;
    }
    
    public void setAlTime(Timestamp alTime) {
        this.alTime = alTime;
    }
    
    @Column(name="al_content", nullable=false, length=200)

    public String getAlContent() {
        return this.alContent;
    }
    
    public void setAlContent(String alContent) {
        this.alContent = alContent;
    }
   








}