/**
 * 
 */
package com.artpri.artist.service.impl;

import java.util.List;

import com.artpri.artist.model.ArtistAlbumCategory;
import com.artpri.artist.service.AlbumCategoryMangeService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * 艺术家相册分类管理逻辑处理类AlbumCategoryMangeService类实现类
 * 
 * @author 王校兵
 * @version 1.0, 2016年4月1日
 */
public class AlbumCategoryMangeServiceImpl extends BaseService implements
		AlbumCategoryMangeService {

	@Override
	public String addCategory(String category) {

		// 从session中获取当前艺术家的编号
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");

		// 如果数据库中存在当前的分类则直接返回成功页面
		if (getAlbumCategoryMangeDao().getExistscategory(userNum, category) == 1) {

			// 返回数据库中存在信息代码
			return "exist";
		}

		// 创建艺术家相册分类对象
		ArtistAlbumCategory aac = new ArtistAlbumCategory();
		aac.setAacName(category);
		aac.setUserNum(userNum);

		if (getAlbumCategoryMangeDao().saveCategory(aac) > 0) {

			// 返回插入成功代码
			return "success";
		}

		// 返回未知错误
		return "error";
	}

	@Override
	public List getCategory() {

		// 从session中获取当前艺术家的编号
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");

		return getAlbumCategoryMangeDao().getCategory(userNum);
	}

	@Override
	public String delCategory(int delId) {
		getAlbumCategoryMangeDao().delCategory(delId);
		return "success";
	}

	@Override
	public String updateCategory(int id, String category) {
		
		// 从session中获取当前艺术家的编号
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");
		
		//如果数据库中存在该艺术家相册分类信息
		if (getAlbumCategoryMangeDao().getExistscategory(userNum, category) == 1) {

			// 返回数据库中存在信息代码
			return "exist";
		}
		
		getAlbumCategoryMangeDao().updateCategory(id, category);
		
		return "success";
	}

}
