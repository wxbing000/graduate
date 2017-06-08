package com.artpri.artist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ArtistAward entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "artist_award", catalog = "jpw")
public class ArtistAward implements java.io.Serializable {

	// Fields

	private Integer aaId;
	private Integer userNum;
	private String aaYear;
	private String aaEvent;
	private String aaUrl;

	// Constructors

	/** default constructor */
	public ArtistAward() {
	}

	/** minimal constructor */
	public ArtistAward(Integer userNum) {
		this.userNum = userNum;
	}

	/** full constructor */
	public ArtistAward(Integer userNum, String aaYear, String aaEvent,
			String aaUrl) {
		this.userNum = userNum;
		this.aaYear = aaYear;
		this.aaEvent = aaEvent;
		this.aaUrl = aaUrl;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "aa_id", unique = true, nullable = false)
	public Integer getAaId() {
		return this.aaId;
	}

	public void setAaId(Integer aaId) {
		this.aaId = aaId;
	}

	@Column(name = "user_num", nullable = false)
	public Integer getUserNum() {
		return this.userNum;
	}

	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}

	@Column(name = "aa_year", length = 10)
	public String getAaYear() {
		return this.aaYear;
	}

	public void setAaYear(String aaYear) {
		this.aaYear = aaYear;
	}

	@Column(name = "aa_event", length = 1000)
	public String getAaEvent() {
		return this.aaEvent;
	}

	public void setAaEvent(String aaEvent) {
		this.aaEvent = aaEvent;
	}

	@Column(name = "aa_url", length = 60)
	public String getAaUrl() {
		return this.aaUrl;
	}

	public void setAaUrl(String aaUrl) {
		this.aaUrl = aaUrl;
	}

}