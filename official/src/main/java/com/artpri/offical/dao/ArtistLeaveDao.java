package com.artpri.offical.dao;

import java.sql.Timestamp;
import java.util.List;

import com.artpri.offical.model.ArtistLeave;

public interface ArtistLeaveDao extends BaseDao<ArtistLeave>{
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:用户id
	*@return:根据用户id获取留言
	*@date： 日期：2017年2月23日 时间：下午2:20:23
	*@Description:
	 */
	public List<ArtistLeave> getall_leavemessage(int userNum);
	/**
	 * 
	*方法描述：
	*@author:田坤
	*@input:artistLeave对象
	*@return:正确与否
	*@date： 日期：2017年2月23日 时间：下午2:40:28
	*@Description:
	 */
	public boolean saveLeave(ArtistLeave artistLeave);
}
