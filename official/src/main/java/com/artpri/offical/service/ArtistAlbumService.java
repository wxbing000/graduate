/**
 * 
 */
package com.artpri.offical.service;

import java.util.List;

import com.artpri.offical.model.ArtistAlbum;

/**
 * <p>Description: ArtistAlbumService 艺术家相册逻辑处理类</p>
 * @author 王校兵
 * @time 2016年9月12日下午6:26:17
 * @version 1.0
 */

public interface ArtistAlbumService extends BaseService<ArtistAlbum> {

	/**
	 * 根据用户编码获取用户上传相册的年份列表（distinct）
	 * @param userNum 用户名
	 * @return 返回String对象的集合只包含年份
	 * */
	public List<String> getUniqueYearByUserNum(int userNum); 
	
	/**
	 * 根据用户名和要查询的类型，名称 获取用户上传的图片的总数
	 * ①查询所有图片 需传入的类型为“all”，类型参数为“all”
	 * ②相册分类  需传入的类型为“category”，类型参数为对应的查询类别
	 * ③拍摄年代 需传入的类型为“year”，类型参数为对应的查询类别
	 * @param userNum 用户名
	 * @param type 要查询的类型
	 * @param parameter 要查询类型对应的参数
	 * @return 查询出的用户的图片的总数
	 * */
	public int getTotalPhotosNumByUserNum(int userNum, String type, String parameter);
	
	/**
	 * 根据用户名和要查询的类型，名称 分页获取用户相册的图片
	 * ①查询所有图片 需传入的类型为“all”，类型参数为“all”
	 * ②相册分类  需传入的类型为“category”，类型参数为对应的查询类别
	 * ③拍摄年代 需传入的类型为“year”，类型参数为对应的查询类别
	 * @param userNum 用户名
	 * @param type 要查询的类型
	 * @param parameter 要查询类型对应的参数
	 * @param pageNo 当前的页面的页码数
	 * @param pageSize 一页上显示的图片的总数
	 * @return 查询出的用户的图片的总数
	 * */
	public List<ArtistAlbum> getPhotosByUserNumAndType(int userNum, String type, String parameter
            , int pageNo, int pageSize);
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:用户id
	*@return:该用户名下所有的相册
	*@date： 日期：2017年2月22日 时间：上午10:57:11
	*@Description:
	 */
	public List<ArtistAlbum> getallAlbum(int userNum);
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:用户id、查询年份
	*@return:根据条件查出的相册
	*@date： 日期：2017年2月22日 时间：下午5:48:48
	*@Description:
	 */
	public List<ArtistAlbum> getAlbumByYear(int userNum, String year);
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:用户id、分类的编码
	*@return:根据条件查出的相册
	*@date： 日期：2017年2月22日 时间：下午5:50:37
	*@Description:
	 */
	public List<ArtistAlbum> getAlbumByCategory(int userNum, int aacId);
	
	public void demo();
}
