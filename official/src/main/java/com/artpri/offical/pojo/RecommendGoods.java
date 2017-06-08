/**
 * 
 */
package com.artpri.offical.pojo;

/**
 * <p>Description: 前台界面上轮播等艺术家的作品对应的pojo类</p>
 * @author 王校兵
 * @time 2016年9月10日下午2:21:42
 * @version 1.0
 */

public class RecommendGoods {
	
	/**
	 * 图片的url
	 * */
	private String url;

	/**
	 * 艺术家给图片的名称
	 * */
	private String name;

	/**
	 * 作品的编号
	 * */
	private int goodNum;

	public RecommendGoods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecommendGoods(int goodNum, String url, String name) {
		super();
		this.url = url;
		this.name = name;
		this.goodNum = goodNum;
	}

	public int getGoodNum() {
		return goodNum;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public void setGoodNum(int goodNum) {
		this.goodNum = goodNum;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "RecommendGoods [url=" + url + ", name=" + name + ", goodNum="
				+ goodNum + "]";
	}

}
