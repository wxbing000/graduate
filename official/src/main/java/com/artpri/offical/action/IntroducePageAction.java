/**
 * 
 */
package com.artpri.offical.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.artpri.offical.model.ArtistAward;
import com.artpri.offical.model.ArtistChronology;
import com.artpri.offical.model.ArtistTop;
import com.artpri.offical.service.ArtistAwardService;
import com.artpri.offical.service.ArtistChronologyService;
import com.artpri.offical.service.ArtistInfoService;
import com.artpri.offical.service.ArtistTopService;
import com.artpri.offical.service.UserInfoService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * <p>
 * Description: 跳转到艺术家介绍页面处理action
 * </p>
 * 
 * @author 王校兵
 * @time 2016年9月11日下午9:17:59
 * @version 1.0
 */

@Controller(value="IntroducePageAction")
public class IntroducePageAction extends ActionSupport {

	/**
	 * 用户编码
	 * */
	private int userNum;

	@Autowired
	private ArtistTopService artistTopService;

	/**
	 * 顶部图片的url
	 * */
	private ArtistTop topPictureUrl;

	@Autowired
	private ArtistInfoService artistInfoService;

	/**
	 * 用户的简介
	 * */
	private String introduce;

	@Autowired
	private UserInfoService userInfoService;

	/**
	 * 用户名
	 * */
	private String userName;

	/**
	 * 用户头像对应的url
	 * */
	private String pictureUrl;

	@Autowired
	private ArtistChronologyService artistChronologyService;

	/**
	 * 查询出用户所有的年表信息
	 * */
	private List<ArtistChronology> chronology;

	@Autowired
	private ArtistAwardService artistAwardService;

	/**
	 * 查询出的用户的所有的获奖信息
	 * */
	private List<ArtistAward> award;

	public List<ArtistAward> getAward() {
		return award;
	}

	public List<ArtistChronology> getChronology() {
		return chronology;
	}

	public String getIntroduce() {
		return introduce;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public ArtistTop getTopPictureUrl() {
		return topPictureUrl;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserNum() {
		return userNum;
	}

	/**
	 * 获取艺术家介绍页面上的信息
	 * */
	public String introductInfo() {

		// 顶部图片
		topPictureUrl = artistTopService.getArtistTopByUserNum(userNum);

		// 用户名
		userName = userInfoService.getUserNameByUserNum(userNum);

		// 用户简介
		introduce = artistInfoService.getIntroductByUserNum(userNum);

		// 用户头像对应的url
		pictureUrl = userInfoService.getUserPictureByUserNum(userNum);

		// 年表
		chronology = artistChronologyService.getAllChronologyByUserNum(userNum);

		// 获奖信息
		award = artistAwardService.getAllAwardByUserNum(userNum);

		return SUCCESS;
	}

	public void setAward(List<ArtistAward> award) {
		this.award = award;
	}

	public void setChronology(List<ArtistChronology> chronology) {
		this.chronology = chronology;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public void setTopPictureUrl(ArtistTop topPictureUrl) {
		this.topPictureUrl = topPictureUrl;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
}
