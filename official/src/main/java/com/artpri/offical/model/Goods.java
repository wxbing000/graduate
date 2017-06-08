package com.artpri.offical.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Goods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="goods"
    ,catalog="jpw"
)

public class Goods  implements java.io.Serializable {


    // Fields    

     private Integer goodsNum;
     private Integer gcId;
     private Integer userNum;
     private Integer shopkeeperNum;
     private String goodsName;
     private Integer goodsType;
     private Integer awcId;
     private Integer goodsLeave;
     private Double goodsPrice;
     private String goodsDescribe;
     private String goodsContent;
     private Integer goodsReplace;
     private Integer goodsAudit;
     private Integer goodsSold;
     private Integer goodsSoldOnline;
     private Timestamp goodsAddTime;
     private Integer goodsDonate;
     private Float goodsDonateP;
     private Integer fwId;
     private String goodsArea;
     private String goodsLocal;


    // Constructors

    /** default constructor */
    public Goods() {
    }

    
    /** full constructor */
    public Goods(Integer gcId, Integer userNum, Integer shopkeeperNum, String goodsName, Integer goodsType, Integer awcId, Integer goodsLeave, Double goodsPrice, String goodsDescribe, String goodsContent, Integer goodsReplace, Integer goodsAudit, Integer goodsSold, Integer goodsSoldOnline, Timestamp goodsAddTime, Integer goodsDonate, Float goodsDonateP, Integer fwId, String goodsArea, String goodsLocal) {
        this.gcId = gcId;
        this.userNum = userNum;
        this.shopkeeperNum = shopkeeperNum;
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.awcId = awcId;
        this.goodsLeave = goodsLeave;
        this.goodsPrice = goodsPrice;
        this.goodsDescribe = goodsDescribe;
        this.goodsContent = goodsContent;
        this.goodsReplace = goodsReplace;
        this.goodsAudit = goodsAudit;
        this.goodsSold = goodsSold;
        this.goodsSoldOnline = goodsSoldOnline;
        this.goodsAddTime = goodsAddTime;
        this.goodsDonate = goodsDonate;
        this.goodsDonateP = goodsDonateP;
        this.fwId = fwId;
        this.goodsArea = goodsArea;
        this.goodsLocal = goodsLocal;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="goods_num", unique=true, nullable=false)

    public Integer getGoodsNum() {
        return this.goodsNum;
    }
    
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
    
    @Column(name="gc_id")

    public Integer getGcId() {
        return this.gcId;
    }
    
    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }
    
    @Column(name="user_num")

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    
    @Column(name="shopkeeper_num")

    public Integer getShopkeeperNum() {
        return this.shopkeeperNum;
    }
    
    public void setShopkeeperNum(Integer shopkeeperNum) {
        this.shopkeeperNum = shopkeeperNum;
    }
    
    @Column(name="goods_name", length=60)

    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    
    @Column(name="goods_type")

    public Integer getGoodsType() {
        return this.goodsType;
    }
    
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }
    
    @Column(name="awc_id")

    public Integer getAwcId() {
        return this.awcId;
    }
    
    public void setAwcId(Integer awcId) {
        this.awcId = awcId;
    }
    
    @Column(name="goods_leave")

    public Integer getGoodsLeave() {
        return this.goodsLeave;
    }
    
    public void setGoodsLeave(Integer goodsLeave) {
        this.goodsLeave = goodsLeave;
    }
    
    @Column(name="goods_price", precision=10)

    public Double getGoodsPrice() {
        return this.goodsPrice;
    }
    
    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
    
    @Column(name="goods_describe", length=200)

    public String getGoodsDescribe() {
        return this.goodsDescribe;
    }
    
    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }
    
    @Column(name="goods_content", length=100)

    public String getGoodsContent() {
        return this.goodsContent;
    }
    
    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }
    
    @Column(name="goods_replace")

    public Integer getGoodsReplace() {
        return this.goodsReplace;
    }
    
    public void setGoodsReplace(Integer goodsReplace) {
        this.goodsReplace = goodsReplace;
    }
    
    @Column(name="goods_audit")

    public Integer getGoodsAudit() {
        return this.goodsAudit;
    }
    
    public void setGoodsAudit(Integer goodsAudit) {
        this.goodsAudit = goodsAudit;
    }
    
    @Column(name="goods_sold")

    public Integer getGoodsSold() {
        return this.goodsSold;
    }
    
    public void setGoodsSold(Integer goodsSold) {
        this.goodsSold = goodsSold;
    }
    
    @Column(name="goods_sold_online")

    public Integer getGoodsSoldOnline() {
        return this.goodsSoldOnline;
    }
    
    public void setGoodsSoldOnline(Integer goodsSoldOnline) {
        this.goodsSoldOnline = goodsSoldOnline;
    }
    
    @Column(name="goods_add_time", length=19)

    public Timestamp getGoodsAddTime() {
        return this.goodsAddTime;
    }
    
    public void setGoodsAddTime(Timestamp goodsAddTime) {
        this.goodsAddTime = goodsAddTime;
    }
    
    @Column(name="goods_donate")

    public Integer getGoodsDonate() {
        return this.goodsDonate;
    }
    
    public void setGoodsDonate(Integer goodsDonate) {
        this.goodsDonate = goodsDonate;
    }
    
    @Column(name="goods_donate_p", precision=12, scale=0)

    public Float getGoodsDonateP() {
        return this.goodsDonateP;
    }
    
    public void setGoodsDonateP(Float goodsDonateP) {
        this.goodsDonateP = goodsDonateP;
    }
    
    @Column(name="fw_id")

    public Integer getFwId() {
        return this.fwId;
    }
    
    public void setFwId(Integer fwId) {
        this.fwId = fwId;
    }
    
    @Column(name="goods_area", length=20)

    public String getGoodsArea() {
        return this.goodsArea;
    }
    
    public void setGoodsArea(String goodsArea) {
        this.goodsArea = goodsArea;
    }
    
    @Column(name="goods_local", length=60)

    public String getGoodsLocal() {
        return this.goodsLocal;
    }
    
    public void setGoodsLocal(String goodsLocal) {
        this.goodsLocal = goodsLocal;
    }
   








}