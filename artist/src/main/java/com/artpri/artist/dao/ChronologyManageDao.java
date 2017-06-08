/**
 * 
 */
package com.artpri.artist.dao;

import java.util.List;

import com.artpri.artist.model.ArtistChronology;

/**
 * 艺术家年表管理数据库操作类
 * @author 王校兵
 * @version 1.0, 2016年3月30日
 */
public interface ChronologyManageDao {
	
	/**
	 * 获取数据库中当前艺术家年表的总行数
	 * @param userNum 艺术家编号
	 * @return 查询到的总行数
	 * */
	public int getChronologyRowCount(int userNum);
	
	/**
	 * 更新数据库中当前艺术家已经提交的年表信息逻辑处理方法
	 * @param artistId  年表信息主键
	 * @param year 年份
	 * @param info 年表信息
	 * @return 操作成功的行数
	 * */
	public int updateChronology(int artistId, String year, String info);
	
	/**
	 * 向数据库中插入艺术家提交的年表信息逻辑处理方法
	 * @param ac ArtistChronology对象
	 * */
	public void saveChronology(ArtistChronology ac);
	
	/**
	 * 删除数据库中当前艺术家已经提交的年表信息逻辑处理方法
	 * @param artistId 艺术家要删除的艺术家年表的编码
	 * */
	public void deleteChronology(int artistId);

	/**
	* 分页查询数据库中当前艺术家已经提交的年表信息数据库操作方法 
	 * @param userNum 用户编号
	 * @param curpage 当前页面
	 * @param pageSize 每页数据条数
	 * @return 返回艺术家已经提交年表的集合
	 */
	public List getChronology(int userNum, int curpage, int pageSize);
	
	/**
	 * 根据年份查找年表信息
	 * @param userNum 艺术家编号
	 * @param year 年份
	 * @return 返回查询到的指定的结果
	 * */
	public List<ArtistChronology> getExitsChonology(int userNum, String year);

}
