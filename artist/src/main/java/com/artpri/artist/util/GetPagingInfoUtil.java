/**
 * 
 */
package com.artpri.artist.util;

import java.util.List;

/**
 * 获取到分页信息的工具类
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月27日
 */
public class GetPagingInfoUtil {

	/**
	 * 计算当前页，若为0或者请求的URL中没有“?page = ”则用1代替
	 * @param page 传入的参数（可能为空，即0 则返回1）
	 * @return
	 */
	public static int countCurrentPage(int page) {
		final int curpage = (page == 0 ? 1 : page);
		return curpage;
	}

	/**
	 * 计算当前页开始的记录起始数
	 * @param pageSize 每页记录数
	 * @param currentPage 当前第几页
	 * @return 当前页开始记录号
	 */
	public static int countOffset(final int pageSize, final int currentPage) {
		final int offset = pageSize * (currentPage - 1);
		return offset;
	}

	/**
	 * 计算总页数 静态方法
	 * @param pageSize 每页的记录数
	 * @param allRow 总记录数
	 * @return 总页数
	 */
	public static int countTatalPage(final int pageSize, final int allRow) {
		int toalPage = allRow % pageSize == 0 ? allRow / pageSize : allRow
				/ pageSize + 1;
		return toalPage;
	}

}
