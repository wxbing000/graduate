package com.artpri.offical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

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

	/** default constructor */
	public ArtistAlbum() {
	}

	// Constructors

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

	/** minimal constructor */
	public ArtistAlbum(Integer userNum, String aaPath) {
		this.userNum = userNum;
		this.aaPath = aaPath;
	}

	@Column(name = "aac_id")
	public Integer getAacId() {
		return this.aacId;
	}

	@Column(name = "aa_explain", length = 300)
	public String getAaExplain() {
		return this.aaExplain;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "aa_id", unique = true, nullable = false)
	public Integer getAaId() {
		return this.aaId;
	}

	@Column(name = "aa_name", length = 60)
	public String getAaName() {
		return this.aaName;
	}

	@Column(name = "aa_path", nullable = false, length = 100)
	public String getAaPath() {
		return this.aaPath;
	}

	@Column(name = "aa_year", length = 10)
	public String getAaYear() {
		return this.aaYear;
	}

	@Column(name = "user_num", nullable = false)
	public Integer getUserNum() {
		return this.userNum;
	}

	public void setAacId(Integer aacId) {
		this.aacId = aacId;
	}

	public void setAaExplain(String aaExplain) {
		this.aaExplain = aaExplain;
	}

	public void setAaId(Integer aaId) {
		this.aaId = aaId;
	}

	public void setAaName(String aaName) {
		this.aaName = aaName;
	}

	public void setAaPath(String aaPath) {
		this.aaPath = aaPath;
	}

	public void setAaYear(String aaYear) {
		this.aaYear = aaYear;
	}

	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}

	@Override
	public String toString() {
		return "ArtistAlbum [aaId=" + aaId + ", userNum=" + userNum
				+ ", aacId=" + aacId + ", aaPath=" + aaPath + ", aaYear="
				+ aaYear + ", aaName=" + aaName + ", aaExplain=" + aaExplain
				+ "]";
	}
}