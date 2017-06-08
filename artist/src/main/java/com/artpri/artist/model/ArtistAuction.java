package com.artpri.artist.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/19  18:53
 */
@Entity
@Table(name = "artist_auction", schema = "", catalog = "jpw")
public class ArtistAuction {
    private int aaId;
    private int userNum;
    private String productName;
    private String productCategory;
    private String productSize;
    private String productYears;
    private String productImg;
    private String aaTime;
    private String aaAucompany;
    private String aaName;
    private BigDecimal aaBargainPrice;
    private BigDecimal aaEstimatPrice;
    private String aaSpeciallyName;
    private String aaExplain;

    @Id
    @Column(name = "aa_id")
    public int getAaId() {
        return aaId;
    }

    public void setAaId(int aaId) {
        this.aaId = aaId;
    }

    @Basic
    @Column(name = "user_num")
    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_category")
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Basic
    @Column(name = "product_size")
    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    @Basic
    @Column(name = "product_years")
    public String getProductYears() {
        return productYears;
    }

    public void setProductYears(String productYears) {
        this.productYears = productYears;
    }

    @Basic
    @Column(name = "product_img")
    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    @Basic
    @Column(name = "aa_time")
    public String getAaTime() {
        return aaTime;
    }

    public void setAaTime(String aaTime) {
        this.aaTime = aaTime;
    }

    @Basic
    @Column(name = "aa_aucompany")
    public String getAaAucompany() {
        return aaAucompany;
    }

    public void setAaAucompany(String aaAucompany) {
        this.aaAucompany = aaAucompany;
    }

    @Basic
    @Column(name = "aa_name")
    public String getAaName() {
        return aaName;
    }

    public void setAaName(String aaName) {
        this.aaName = aaName;
    }

    @Basic
    @Column(name = "aa_bargain_price")
    public BigDecimal getAaBargainPrice() {
        return aaBargainPrice;
    }

    public void setAaBargainPrice(BigDecimal aaBargainPrice) {
        this.aaBargainPrice = aaBargainPrice;
    }

    @Basic
    @Column(name = "aa_estimat_price")
    public BigDecimal getAaEstimatPrice() {
        return aaEstimatPrice;
    }

    public void setAaEstimatPrice(BigDecimal aaEstimatPrice) {
        this.aaEstimatPrice = aaEstimatPrice;
    }

    @Basic
    @Column(name = "aa_specially_name")
    public String getAaSpeciallyName() {
        return aaSpeciallyName;
    }

    public void setAaSpeciallyName(String aaSpeciallyName) {
        this.aaSpeciallyName = aaSpeciallyName;
    }

    @Basic
    @Column(name = "aa_explain")
    public String getAaExplain() {
        return aaExplain;
    }

    public void setAaExplain(String aaExplain) {
        this.aaExplain = aaExplain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtistAuction that = (ArtistAuction) o;

        if (aaId != that.aaId) return false;
        if (userNum != that.userNum) return false;
        if (aaAucompany != null ? !aaAucompany.equals(that.aaAucompany) : that.aaAucompany != null) return false;
        if (aaBargainPrice != null ? !aaBargainPrice.equals(that.aaBargainPrice) : that.aaBargainPrice != null)
            return false;
        if (aaEstimatPrice != null ? !aaEstimatPrice.equals(that.aaEstimatPrice) : that.aaEstimatPrice != null)
            return false;
        if (aaExplain != null ? !aaExplain.equals(that.aaExplain) : that.aaExplain != null) return false;
        if (aaName != null ? !aaName.equals(that.aaName) : that.aaName != null) return false;
        if (aaSpeciallyName != null ? !aaSpeciallyName.equals(that.aaSpeciallyName) : that.aaSpeciallyName != null)
            return false;
        if (aaTime != null ? !aaTime.equals(that.aaTime) : that.aaTime != null) return false;
        if (productCategory != null ? !productCategory.equals(that.productCategory) : that.productCategory != null)
            return false;
        if (productImg != null ? !productImg.equals(that.productImg) : that.productImg != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productSize != null ? !productSize.equals(that.productSize) : that.productSize != null) return false;
        if (productYears != null ? !productYears.equals(that.productYears) : that.productYears != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aaId;
        result = 31 * result + userNum;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productCategory != null ? productCategory.hashCode() : 0);
        result = 31 * result + (productSize != null ? productSize.hashCode() : 0);
        result = 31 * result + (productYears != null ? productYears.hashCode() : 0);
        result = 31 * result + (productImg != null ? productImg.hashCode() : 0);
        result = 31 * result + (aaTime != null ? aaTime.hashCode() : 0);
        result = 31 * result + (aaAucompany != null ? aaAucompany.hashCode() : 0);
        result = 31 * result + (aaName != null ? aaName.hashCode() : 0);
        result = 31 * result + (aaBargainPrice != null ? aaBargainPrice.hashCode() : 0);
        result = 31 * result + (aaEstimatPrice != null ? aaEstimatPrice.hashCode() : 0);
        result = 31 * result + (aaSpeciallyName != null ? aaSpeciallyName.hashCode() : 0);
        result = 31 * result + (aaExplain != null ? aaExplain.hashCode() : 0);
        return result;
    }
}
