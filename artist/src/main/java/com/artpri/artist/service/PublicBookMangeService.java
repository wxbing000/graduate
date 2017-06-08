/**
 * 
 */
package com.artpri.artist.service;

import java.io.File;
import java.util.List;

/**
 * 艺术家著作管理逻辑处理类，包括增删改查著作信息
 * 
 * @author 王校兵
 * @version 1.0, 2016年4月11日
 */
public interface PublicBookMangeService {

	/**
	 * 上传艺术家著作信息
	 * @param book_sm 书名
	 * @param book_tp 书籍图片
	 * @param book_tpFileName  图片文件名称
	 * @param book_tpContentType 图片文件类型
	 * @param book_cbs 出版社
	 * @param book_zz 作者
	 * @param book_bz 编著
	 * @param book_date 出版日期
	 * @param book_kb 开本
	 * @param book_yc 印次
	 * @param book_lb 所属类别
	 * @param book_dj 定价
	 * @param book_isbn ISBN
	 * @param book_zy 内容提要
	 * @param book_mu 目录
	 * @return 跳转的状态信息
	 * */
	public String uploadPublicBook(String book_sm, File book_tp,
                                   String book_tpFileName, String book_tpContentType, String book_cbs,
                                   String book_zz, String book_bz, String book_date, String book_kb,
                                   String book_yc, String book_lb, String book_dj, String book_isbn,
                                   String book_zy, String book_mu);
	
	/**
	 * 分页获取艺术家出版著作
	 * @param pageNow 当前的页码
	 * @param pageSize 每个页面显示的数据条数
	 * */
	public List getPublicBook(int pageNow, int pageSize);
	
	/**
	 * 获取到将数据分页后的总页数
	 * 
	 * @return 总页数
	 */
	public int totalpage(int pageSize);
	
	/**
	 * 删除艺术家的出版著作
	 * @param delId 要删除的出版著作的id
	 * */
	public void delPublicBook(int delId);
	
	/**
	 * 更新书籍信息
	 * @param book_sm 书名
	 * @param book_tp 书籍图片
	 * @param book_tpFileName  图片文件名称
	 * @param book_tpContentType 图片文件类型
	 * @param book_cbs 出版社
	 * @param book_zz 作者
	 * @param book_bz 编著
	 * @param book_date 出版日期
	 * @param book_kb 开本
	 * @param book_yc 印次
	 * @param book_lb 所属类别
	 * @param book_dj 定价
	 * @param book_isbn ISBN
	 * @param book_zy 内容提要
	 * @param book_mu 目录
	 * @return 跳转的状态信息
	 * */
	public String updatePublicBook(int id, String book_sm, File book_tp,
                                   String book_tpFileName, String book_tpContentType, String book_cbs,
                                   String book_zz, String book_bz, String book_date, String book_kb,
                                   String book_yc, String book_lb, String book_dj, String book_isbn,
                                   String book_zy, String book_mu);
	
}
