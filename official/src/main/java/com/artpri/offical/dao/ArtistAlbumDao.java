/**
 * 
 */
package com.artpri.offical.dao;

import java.util.List;

import com.artpri.offical.model.ArtistAlbum;

/**
 * <p>Description: 艺术家相册信息逻辑处理类</p>
 * @author 王校兵
 * @time 2016年9月5日下午8:00:15
 * @version 1.0
 */

public interface ArtistAlbumDao extends BaseDao<ArtistAlbum> {

	/**
	 * 根据用户编码获取用户上传相册的年份（distinct）
	 * @param userNum 用户名
	 * @return 返回String对象的集合只包含年份
	 * */
	public List<String> getUniqueYearByUserNum(int userNum); 
	
	/**
	 * 根据用户名和要查询的类型，名称 获取用户相册图片的总数
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
	*@return:返回该用户名下所有的相册
	*@date： 日期：2017年2月22日 时间：上午10:59:44
	*@Description:
	 */
	public List<ArtistAlbum> getallAlbum(int userNum);

	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:用户id、年份
	*@return:根据用户id、年份查找相册
	*@date： 日期：2017年2月22日 时间：下午1:21:06
	*@Description:
	 */
	public List<ArtistAlbum> getAlbumByYear(int userNum, String year);
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:用户id,相册分类的id
	*@return:根据用户id、相册类型查找相册
	*@date： 日期：2017年2月22日 时间：下午5:46:30
	*@Description:
	 */
	public List<ArtistAlbum> getAlbumByCategory(int userNum, int aacId);
	
}
