package com.artpri.offical.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * AdminInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="admin_info"
    ,catalog="jpw"
)

public class AdminInfo  implements java.io.Serializable {


    // Fields    

     private Integer adminNum;
     private String adminAccount;
     private String adminEmail;
     private String adminPhone;
     private String adminPasswd;
     private Timestamp adLogintime;
     private Integer adminLimit;


    // Constructors

    /** default constructor */
    public AdminInfo() {
    }

	/** minimal constructor */
    public AdminInfo(String adminAccount, String adminPasswd, Timestamp adLogintime) {
        this.adminAccount = adminAccount;
        this.adminPasswd = adminPasswd;
        this.adLogintime = adLogintime;
    }
    
    /** full constructor */
    public AdminInfo(String adminAccount, String adminEmail, String adminPhone, String adminPasswd, Timestamp adLogintime, Integer adminLimit) {
        this.adminAccount = adminAccount;
        this.adminEmail = adminEmail;
        this.adminPhone = adminPhone;
        this.adminPasswd = adminPasswd;
        this.adLogintime = adLogintime;
        this.adminLimit = adminLimit;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="admin_num", unique=true, nullable=false)

    public Integer getAdminNum() {
        return this.adminNum;
    }
    
    public void setAdminNum(Integer adminNum) {
        this.adminNum = adminNum;
    }
    
    @Column(name="admin_account", nullable=false, length=20)

    public String getAdminAccount() {
        return this.adminAccount;
    }
    
    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }
    
    @Column(name="admin_email", length=60)

    public String getAdminEmail() {
        return this.adminEmail;
    }
    
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }
    
    @Column(name="admin_phone", length=20)

    public String getAdminPhone() {
        return this.adminPhone;
    }
    
    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }
    
    @Column(name="admin_passwd", nullable=false, length=60)

    public String getAdminPasswd() {
        return this.adminPasswd;
    }
    
    public void setAdminPasswd(String adminPasswd) {
        this.adminPasswd = adminPasswd;
    }
    
    @Column(name="ad_logintime", nullable=false, length=19)

    public Timestamp getAdLogintime() {
        return this.adLogintime;
    }
    
    public void setAdLogintime(Timestamp adLogintime) {
        this.adLogintime = adLogintime;
    }
    
    @Column(name="admin_limit")

    public Integer getAdminLimit() {
        return this.adminLimit;
    }
    
    public void setAdminLimit(Integer adminLimit) {
        this.adminLimit = adminLimit;
    }
   








}