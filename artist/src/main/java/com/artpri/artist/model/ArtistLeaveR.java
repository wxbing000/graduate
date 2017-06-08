package com.artpri.artist.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ArtistLeaveR entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="artist_leave_r"
    ,catalog="jpw"
)

public class ArtistLeaveR  implements java.io.Serializable {


    // Fields    

     private Integer alrId;
     private Integer alId;
     private String alrName;
     private Timestamp alrTime;
     private String alrContent;


    // Constructors

    /** default constructor */
    public ArtistLeaveR() {
    }

    
    /** full constructor */
    public ArtistLeaveR(Integer alId, String alrName, Timestamp alrTime, String alrContent) {
        this.alId = alId;
        this.alrName = alrName;
        this.alrTime = alrTime;
        this.alrContent = alrContent;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="alr_id", unique=true, nullable=false)

    public Integer getAlrId() {
        return this.alrId;
    }
    
    public void setAlrId(Integer alrId) {
        this.alrId = alrId;
    }
    
    @Column(name="al_id", nullable=false)

    public Integer getAlId() {
        return this.alId;
    }
    
    public void setAlId(Integer alId) {
        this.alId = alId;
    }
    
    @Column(name="alr_name", nullable=false, length=60)

    public String getAlrName() {
        return this.alrName;
    }
    
    public void setAlrName(String alrName) {
        this.alrName = alrName;
    }
    
    @Column(name="alr_time", nullable=false, length=19)

    public Timestamp getAlrTime() {
        return this.alrTime;
    }
    
    public void setAlrTime(Timestamp alrTime) {
        this.alrTime = alrTime;
    }
    
    @Column(name="alr_content", nullable=false, length=200)

    public String getAlrContent() {
        return this.alrContent;
    }
    
    public void setAlrContent(String alrContent) {
        this.alrContent = alrContent;
    }
   








}