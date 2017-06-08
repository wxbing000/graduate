/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

import com.artpri.artist.model.ArtistAward;

/**
 * 艺术家个人获奖经历管理数据库操作类
 * @author 王校兵
 * @version 1.0, 2016年3月30日
 */
public interface WiningExperienceDao {
	
	/**
	 * 取到数据库中指定艺术家的获奖经历数据库操作方法
	 * @param userNum 当前登录的艺术家的用户编码
	 * @param curpage 当前页码
	 * @param pageSize 每页显示的页数
	 * @return 查询到的艺术家获奖经历集合
	 * */
	public List getWinningExperience(int userNum, int curpage, int pageSize);
	
	/**
	 * 艺术家更新或者添加获奖经历的数据库操作方法
	 * @param zhujian 要修改的艺术家获奖经历表的主键
	 * @param years 要修改的年份
	 * @param experiense 要修改的经历
	 * @return 页面跳转逻辑代码
	 * */
	public int updateWinningExperience(int zhujian, String years, String experiense);
	
	/**
	 * 艺术家删除获奖经历的数据库操作方法
	 * */
	public void deleteWinningExperience(int shanchu);
	
	/**
	 * 获取数据库中当前艺术家获奖经历的总行数数据库操作方法
	 * @param userNum 艺术家编号
	 * @return 艺术家获奖经历的总行数
	 * */
	public int getWinningExperienceRowCount(int userNum);
	
	/**
	 * 保存获奖经历时相同的年份数据
	 * @param userNum 艺术家编码
	 * @param year 年份
	 * @return 查询出的艺术家的获奖经历
	 * */
	public List<ArtistAward> getExistExperience(int userNum, String year);
	
	/**
	 * 保存获奖经历
	 * @param aa 艺术家获奖经历
	 * */
	public void saveExperience(ArtistAward aa);

}
