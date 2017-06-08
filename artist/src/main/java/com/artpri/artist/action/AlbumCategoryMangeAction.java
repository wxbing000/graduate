/**
 * 
 */
package com.artpri.artist.action;

import com.opensymphony.xwork2.Action;

/**
 * 相册分类管理action类，主要的进行管理的操作为增加分类、删除分类、修改分类
 * @author 王校兵
 * @version 1.0, 2016年4月1日
 */
public class AlbumCategoryMangeAction extends BaseAction {
	
	//相册分类名称
	private String category;

	//返回的友好的提示信息
	private String message;
	
	//艺术家相册分类id
	private int id;
	
	private int delState;
	
	/**
	 * 添加艺术家相册分类信息方法
	 * */
	public String addCategory(){
		
		String state = getAlbumCategoryMangeService().addCategory(category);
		
		if(state.equals("success")){ //插入成功
			message = "分类添加成功。";
		}else if(state.equals("error")){ //插入失败
			message = "分类添加失败，请重新尝试。";
		}else if(state.equals("exist")){ //数据库中存在分类信息
			message = "您已存在该分类请勿重新提交";
		}
		
		return Action.SUCCESS;
	}

	/**
	 * 删除艺术家相册分类信息方法
	 * */
	public String delCategory(){
		
		String state = getAlbumCategoryMangeService().delCategory(id);
		
		//如果删除成功
		if(state.equals("success")){
			delState = 1;
			return Action.SUCCESS;
		}
		
		return Action.SUCCESS;
	}
	
	/**
	 * 更新艺术家相册分类信息方法
	 * */
	public String updateCategory(){
		
		String state = getAlbumCategoryMangeService().updateCategory(id, category);
		
		if(state.equals("exist")){
			message = "已存在该分类！";
		}else if(state.equals("success")){
			message = "更新成功";
		}
		
		return Action.SUCCESS;
	}

	public String getCategory() {
		return category;
	}


	public int getDelState() {
		return delState;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDelState(int delState) {
		this.delState = delState;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
