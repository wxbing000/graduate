package com.artpri.offical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ArtistTop entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "artist_top", catalog = "jpw")
public class ArtistTop implements java.io.Serializable {

	// Fields

	private Integer atId;
	private Integer userNum;
	private String atPath;
	private String atName;

	// Constructors

	/** default constructor */
	public ArtistTop() {
	}

	/** full constructor */
	public ArtistTop(Integer userNum, String atPath, String atName) {
		this.userNum = userNum;
		this.atPath = atPath;
		this.atName = atName;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "at_id", unique = true, nullable = false)
	public Integer getAtId() {
		return this.atId;
	}

	public void setAtId(Integer atId) {
		this.atId = atId;
	}

	@Column(name = "user_num")
	public Integer getUserNum() {
		return this.userNum;
	}

	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}

	@Column(name = "at_path")
	public String getAtPath() {
		return this.atPath;
	}

	public void setAtPath(String atPath) {
		this.atPath = atPath;
	}

	@Column(name = "at_name")
	public String getAtName() {
		return this.atName;
	}

	public void setAtName(String atName) {
		this.atName = atName;
	}

}