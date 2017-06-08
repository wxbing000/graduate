package com.artpri.offical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ArtistRecommend entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "artist_recommend", catalog = "jpw")
public class ArtistRecommend implements java.io.Serializable {

	// Fields

	private Integer arId;
	private Integer userNum;
	private String recommendType;
	private Integer recommendNum;
	private Integer recommendPosition;
	private Integer recommendOrder;

	// Constructors

	/** default constructor */
	public ArtistRecommend() {
	}

	/** full constructor */
	public ArtistRecommend(Integer userNum, String recommendType,
			Integer recommendNum, Integer recommendPosition,
			Integer recommendOrder) {
		this.userNum = userNum;
		this.recommendType = recommendType;
		this.recommendNum = recommendNum;
		this.recommendPosition = recommendPosition;
		this.recommendOrder = recommendOrder;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ar_id", unique = true, nullable = false)
	public Integer getArId() {
		return this.arId;
	}

	public void setArId(Integer arId) {
		this.arId = arId;
	}

	@Column(name = "user_num")
	public Integer getUserNum() {
		return this.userNum;
	}

	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}

	@Column(name = "recommend_type", length = 20)
	public String getRecommendType() {
		return this.recommendType;
	}

	public void setRecommendType(String recommendType) {
		this.recommendType = recommendType;
	}

	@Column(name = "recommend_num")
	public Integer getRecommendNum() {
		return this.recommendNum;
	}

	public void setRecommendNum(Integer recommendNum) {
		this.recommendNum = recommendNum;
	}

	@Column(name = "recommend_position")
	public Integer getRecommendPosition() {
		return this.recommendPosition;
	}

	public void setRecommendPosition(Integer recommendPosition) {
		this.recommendPosition = recommendPosition;
	}

	@Column(name = "recommend_order")
	public Integer getRecommendOrder() {
		return this.recommendOrder;
	}

	public void setRecommendOrder(Integer recommendOrder) {
		this.recommendOrder = recommendOrder;
	}

}