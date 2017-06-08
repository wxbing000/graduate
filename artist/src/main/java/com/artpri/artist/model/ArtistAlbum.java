package com.artpri.artist.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * ArtistAlbum entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "artist_album", catalog = "jpw")
public class ArtistAlbum implements java.io.Serializable {

	// Fields

	private Integer aaId;
	private Integer userNum;
	private Integer aacId;
	private String aaPath;
	private String aaYear;
	private String aaName;
	private String aaExplain;

	// Constructors

	/** default constructor */
	public ArtistAlbum() {
	}

	/** minimal constructor */
	public ArtistAlbum(Integer userNum, String aaPath) {
		this.userNum = userNum;
		this.aaPath = aaPath;
	}

	/** full constructor */
	public ArtistAlbum(Integer userNum, Integer aacId, String aaPath,
			String aaYear, String aaName, String aaExplain) {
		this.userNum = userNum;
		this.aacId = aacId;
		this.aaPath = aaPath;
		this.aaYear = aaYear;
		this.aaName = aaName;
		this.aaExplain = aaExplain;
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

	@Column(name = "aac_id")
	public Integer getAacId() {
		return this.aacId;
	}

	public void setAacId(Integer aacId) {
		this.aacId = aacId;
	}

	@Column(name = "aa_path", nullable = false, length = 100)
	public String getAaPath() {
		return this.aaPath;
	}

	public void setAaPath(String aaPath) {
		this.aaPath = aaPath;
	}

	@Column(name = "aa_year", length = 10)
	public String getAaYear() {
		return this.aaYear;
	}

	public void setAaYear(String aaYear) {
		this.aaYear = aaYear;
	}

	@Column(name = "aa_name", length = 60)
	public String getAaName() {
		return this.aaName;
	}

	public void setAaName(String aaName) {
		this.aaName = aaName;
	}

	@Column(name = "aa_explain", length = 300)
	public String getAaExplain() {
		return this.aaExplain;
	}

	public void setAaExplain(String aaExplain) {
		this.aaExplain = aaExplain;
	}

}