package com.artpri.offical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * GoodsAlbum entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="goods_album"
    ,catalog="jpw"
)

public class GoodsAlbum  implements java.io.Serializable {


    // Fields    

     private Integer gaId;
     private Integer goodsNum;
     private String gaOldname;
     private String gaName;
     private String gaPath;
     private Integer gaMain;


    // Constructors

    /** default constructor */
    public GoodsAlbum() {
    }

	/** minimal constructor */
    public GoodsAlbum(Integer goodsNum, String gaOldname, String gaName, String gaPath) {
        this.goodsNum = goodsNum;
        this.gaOldname = gaOldname;
        this.gaName = gaName;
        this.gaPath = gaPath;
    }
    
    /** full constructor */
    public GoodsAlbum(Integer goodsNum, String gaOldname, String gaName, String gaPath, Integer gaMain) {
        this.goodsNum = goodsNum;
        this.gaOldname = gaOldname;
        this.gaName = gaName;
        this.gaPath = gaPath;
        this.gaMain = gaMain;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ga_id", unique=true, nullable=false)

    public Integer getGaId() {
        return this.gaId;
    }
    
    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }
    
    @Column(name="goods_num", nullable=false)

    public Integer getGoodsNum() {
        return this.goodsNum;
    }
    
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
    
    @Column(name="ga_oldname", nullable=false)

    public String getGaOldname() {
        return this.gaOldname;
    }
    
    public void setGaOldname(String gaOldname) {
        this.gaOldname = gaOldname;
    }
    
    @Column(name="ga_name", nullable=false)

    public String getGaName() {
        return this.gaName;
    }
    
    public void setGaName(String gaName) {
        this.gaName = gaName;
    }
    
    @Column(name="ga_path", nullable=false, length=100)

    public String getGaPath() {
        return this.gaPath;
    }
    
    public void setGaPath(String gaPath) {
        this.gaPath = gaPath;
    }
    
    @Column(name="ga_main")

    public Integer getGaMain() {
        return this.gaMain;
    }
    
    public void setGaMain(Integer gaMain) {
        this.gaMain = gaMain;
    }
   








}