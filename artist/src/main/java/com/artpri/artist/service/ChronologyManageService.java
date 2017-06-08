/**
 * 
 */
package com.artpri.artist.service;

import java.util.List;

/**
 * 艺术家年表管理逻辑处理类
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月30日
 */
public interface ChronologyManageService {

	/**
	 * 取到数据库中当前艺术家已经提交的年表信息逻辑处理方法
	 * @param pageNow 当前的页码数
	 * @param pageSize 当前的页面的数据显示条数
	 * */
	public List getChronology(int pageNow, int pageSize);

	/**
	 * 更新数据库中当前艺术家已经提交的年表信息逻辑处理方法
	 * @param artistId  年表信息主键
	 * @param year 年份
	 * @param info 年表信息
	 * @return 操作成功的行数
	 * */
	public int updateChronology(int artistId, String year, String info);
	
	/**
	 * 向数据库中插入艺术家新提交的年表信息逻辑处理方法
	 * @param year 年份
	 * @param info 年表信息
	 * */
	public int saveChronology(String year, String info);

	/**
	 * 删除数据库中当前艺术家已经提交的年表信息逻辑处理方法
	 * 
	 * @param 艺术家要删除的艺术家年表的编码
	 * */
	public void deleteChronology(int artistId);

	/**
	 * 获取到将数据分页后的总页数
	 * @param pageSize 每一页的数据条数
	 * @return 总页数
	 */
	public int totalpage(int pageSize);

}
