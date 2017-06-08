package com.artpri.artist.model;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user_info"
    ,catalog="jpw"
)

public class UserInfo  implements java.io.Serializable {


    // Fields    

     private Integer userNum;
     private String userName;
     private String userPhone;
     private String userEmail;
     private String userPasswd;
     private Integer userRole;
     private String userRealName;
     private String userSex;
     private Date userBirthday;
     private String userBirthplace;
     private Timestamp userRegTime;
     private String userPicture;


    // Constructors

    /** default constructor */
    public UserInfo() {
    }

	/** minimal constructor */
    public UserInfo(String userName, String userPasswd, Integer userRole, Timestamp userRegTime) {
        this.userName = userName;
        this.userPasswd = userPasswd;
        this.userRole = userRole;
        this.userRegTime = userRegTime;
    }
    
    /** full constructor */
    public UserInfo(String userName, String userPhone, String userEmail, String userPasswd, Integer userRole, String userRealName, String userSex, Date userBirthday, String userBirthplace, Timestamp userRegTime, String userPicture) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userPasswd = userPasswd;
        this.userRole = userRole;
        this.userRealName = userRealName;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
        this.userBirthplace = userBirthplace;
        this.userRegTime = userRegTime;
        this.userPicture = userPicture;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="user_num", unique=true, nullable=false)

    public Integer getUserNum() {
        return this.userNum;
    }
    
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    
    @Column(name="user_name", nullable=false, length=60)

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="user_phone", length=20)

    public String getUserPhone() {
        return this.userPhone;
    }
    
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    
    @Column(name="user_email", length=60)

    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    @Column(name="user_passwd", nullable=false, length=60)

    public String getUserPasswd() {
        return this.userPasswd;
    }
    
    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }
    
    @Column(name="user_role", nullable=false)

    public Integer getUserRole() {
        return this.userRole;
    }
    
    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }
    
    @Column(name="user_real_name", length=20)

    public String getUserRealName() {
        return this.userRealName;
    }
    
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }
    
    @Column(name="user_sex", length=5)

    public String getUserSex() {
        return this.userSex;
    }
    
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="user_birthday", length=10)

    public Date getUserBirthday() {
        return this.userBirthday;
    }
    
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }
    
    @Column(name="user_birthplace", length=80)

    public String getUserBirthplace() {
        return this.userBirthplace;
    }
    
    public void setUserBirthplace(String userBirthplace) {
        this.userBirthplace = userBirthplace;
    }
    
    @Column(name="user_reg_time", nullable=false, length=19)

    public Timestamp getUserRegTime() {
        return this.userRegTime;
    }
    
    public void setUserRegTime(Timestamp userRegTime) {
        this.userRegTime = userRegTime;
    }
    
    @Column(name="user_picture", length=100)

    public String getUserPicture() {
        return this.userPicture;
    }
    
    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }
   








}