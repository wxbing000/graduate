package com.artpri.offical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ArtistRExhibition entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "artist_r_exhibition", catalog = "jpw")
public class ArtistRExhibition implements java.io.Serializable {

	// Fields

	private Integer areId;
	private Integer exhibitId;
	private Integer userNum;

	// Constructors

	/** default constructor */
	public ArtistRExhibition() {
	}

	/** full constructor */
	public ArtistRExhibition(Integer exhibitId, Integer userNum) {
		this.exhibitId = exhibitId;
		this.userNum = userNum;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "are_id", unique = true, nullable = false)
	public Integer getAreId() {
		return this.areId;
	}

	public void setAreId(Integer areId) {
		this.areId = areId;
	}

	@Column(name = "exhibit_id", nullable = false)
	public Integer getExhibitId() {
		return this.exhibitId;
	}

	public void setExhibitId(Integer exhibitId) {
		this.exhibitId = exhibitId;
	}

	@Column(name = "user_num", nullable = false)
	public Integer getUserNum() {
		return this.userNum;
	}

	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}

}