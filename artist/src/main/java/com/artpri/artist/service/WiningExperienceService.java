/**
 * 
 */
package com.artpri.artist.service;

import java.util.List;

/**
 * 艺术家个人获奖经历管理数据库操作类
 * @author 王校兵
 * @version 1.0, 2016年3月30日
 */
public interface WiningExperienceService {
	
	/**
	 * 取到数据库中指定艺术家的获奖经历逻辑处理方法
	 * @param pageNow 当前的获奖经历显示的页码数
	 * @param pageSize 每个页面显示的数据条数
	 * @return 查询到的艺术家获奖经历集合
	 * */
	public List getWinningExperience(int pageNow, int pageSize);
	
	/**
	 * 艺术家更新或者添加获奖经历的逻辑处理方法
	 * @param zhujian 要修改的艺术家获奖经历表的主键
	 * @param years 要修改的年份
	 * @param experiense 要修改的经历
	 * @return 操作成功的条数
	 * */
	public String updateWinningExperience(int zhujian, String years, String experiense);
	
	/**
	 * 向数据库中插入获奖经历
	 * @param year 年份
	 * @param info 获奖信息
	 * @param 插入成功后序列化信息
	 * */
	public int saveWinningExperience(String year, String info);
	
	/**
	 * 艺术家删除获奖经历的逻辑处理方法
	 * @param shanchu 要删除的艺术家获奖经历表的主键
	 * @return
	 * */
	public String deleteWinningExperience(int shanchu);
	
	/**
	 * 获取到将数据分页后的总页数
	 * @param pageSize 每个页面显示的数据条数
	 * @return 总页数
	 */
	public int totalpage(int pageSize);

}
