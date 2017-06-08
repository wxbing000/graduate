/**
 * 
 */
package com.artpri.offical.pojo;

/**
 * <p>
 * Description: 首页对应的展览信息的pojo类
 * </p>
 * 
 * @author 王校兵
 * @time 2016年9月11日上午11:45:21
 * @version 1.0
 */

public class HomePageExhibition {

	/**
	 * 展览id
	 * */
	private int id;

	/**
	 * 展览的名称
	 * */
	private String name;

	/**
	 * 展览地点
	 * */
	private String place;

	/**
	 * 展览时间
	 * */
	private String time;

	/**
	 * 展览图片的url
	 * */
	private String pictureUrl;

	public HomePageExhibition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePageExhibition(int id, String name, String place, String time,
			String pictureUrl) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.time = time;
		this.pictureUrl = pictureUrl;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public String getPlace() {
		return place;
	}

	public String getTime() {
		return time;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "HomePageExhibition [id=" + id + ", name=" + name + ", place="
				+ place + ", time=" + time + ", pictureUrl=" + pictureUrl + "]";
	}

}
