package com.artpri.artist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ArtistInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "artist_info", catalog = "jpw")
public class ArtistInfo implements java.io.Serializable {

	// Fields

	private Integer artistId;
	private Integer userNum;
	private String artistIntroduct;
	private String artistGradcollege;
	private Integer artistTodayvis;
	private Integer artistHistoryvis;
	private String category;
	private String artistState;

	// Constructors

	/** default constructor */
	public ArtistInfo() {
	}

	/** minimal constructor */
	public ArtistInfo(Integer userNum, String artistIntroduct, String category,
			String artistState) {
		this.userNum = userNum;
		this.artistIntroduct = artistIntroduct;
		this.category = category;
		this.artistState = artistState;
	}

	/** full constructor */
	public ArtistInfo(Integer userNum, String artistIntroduct,
			String artistGradcollege, Integer artistTodayvis,
			Integer artistHistoryvis, String category, String artistState) {
		this.userNum = userNum;
		this.artistIntroduct = artistIntroduct;
		this.artistGradcollege = artistGradcollege;
		this.artistTodayvis = artistTodayvis;
		this.artistHistoryvis = artistHistoryvis;
		this.category = category;
		this.artistState = artistState;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "artist_id", unique = true, nullable = false)
	public Integer getArtistId() {
		return this.artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

	@Column(name = "user_num", nullable = false)
	public Integer getUserNum() {
		return this.userNum;
	}

	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}

	@Column(name = "artist_introduct", nullable = false, length = 4000)
	public String getArtistIntroduct() {
		return this.artistIntroduct;
	}

	public void setArtistIntroduct(String artistIntroduct) {
		this.artistIntroduct = artistIntroduct;
	}

	@Column(name = "artist_gradcollege", length = 60)
	public String getArtistGradcollege() {
		return this.artistGradcollege;
	}

	public void setArtistGradcollege(String artistGradcollege) {
		this.artistGradcollege = artistGradcollege;
	}

	@Column(name = "artist_todayvis")
	public Integer getArtistTodayvis() {
		return this.artistTodayvis;
	}

	public void setArtistTodayvis(Integer artistTodayvis) {
		this.artistTodayvis = artistTodayvis;
	}

	@Column(name = "artist_historyvis")
	public Integer getArtistHistoryvis() {
		return this.artistHistoryvis;
	}

	public void setArtistHistoryvis(Integer artistHistoryvis) {
		this.artistHistoryvis = artistHistoryvis;
	}

	@Column(name = "category", nullable = false, length = 20)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "artist_state", nullable = false, length = 10)
	public String getArtistState() {
		return this.artistState;
	}

	public void setArtistState(String artistState) {
		this.artistState = artistState;
	}

}