/**
 * 
 */
package com.artpri.offical.pojo;

/**
 * <p>
 * Description: 首页上的新闻和评论的pojo类
 * </p>
 * 
 * @author 王校兵
 * @time 2016年9月10日下午5:01:51
 * @version 1.0
 */

public class HomePageNews {

	/**
	 * 新闻资讯的id
	 * */
	private int id;

	/**
	 * 新闻标题
	 * */
	private String title;

	/**
	 * 新闻的摘要
	 * */
	private String digest;

	public HomePageNews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePageNews(int id, String title, String digest) {
		super();
		this.title = title;
		this.digest = digest;
		this.id = id;
	}

	public String getDigest() {
		return digest;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
