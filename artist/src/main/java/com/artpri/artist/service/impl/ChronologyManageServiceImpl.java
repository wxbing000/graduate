/**
 * 
 */
package com.artpri.artist.service.impl;

import java.util.List;

import com.artpri.artist.model.ArtistChronology;
import com.artpri.artist.service.ChronologyManageService;
import com.artpri.artist.util.GetPagingInfoUtil;
import com.opensymphony.xwork2.ActionContext;

/**
 * ChronologyManageService实现类
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月30日
 */
public class ChronologyManageServiceImpl extends BaseService implements
		ChronologyManageService {

	@Override
	public List getChronology(int pageNow, int pageSize) {

		// 从session中取到登录的用户的用户编码
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");
		
		// 取到当前的page数
		int curpage = GetPagingInfoUtil.countCurrentPage(pageNow);

		// 返回查询结果
		return getChronologyManageDao().getChronology(userNum, curpage, pageSize);
	}

	public int totalpage(int pageSize) {
		
		// 从session中取到登录的用户的用户编码
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");
		
		// 数据库中当前艺术家年表信息总行数
		int  rowCount = (int) getChronologyManageDao().getChronologyRowCount(userNum);
		
		return GetPagingInfoUtil.countTatalPage(pageSize, rowCount);
	}
	
	@Override
	public int updateChronology(int artistId, String year, String info) {
		return getChronologyManageDao().updateChronology(artistId, year, info);
	}

	@Override
	public void deleteChronology(int artistId) {
		getChronologyManageDao().deleteChronology(artistId);
	}


	@Override
	public int saveChronology(String year, String info) {
		
		if(info.length() > 1000){
			return 0;
		}

		// 从session中取到登录的用户的用户编码
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");
		
		
		//从数据库中取到是否存在将要保存的对应年份的个人年表信息
		List<ArtistChronology> acList = getChronologyManageDao().getExitsChonology(userNum, year);
		
		// 创建ArtistChronology对象
		ArtistChronology ac = new ArtistChronology();

		//如果数据库中存在对应的年份的信息
		if(acList.size() > 0){
			ac = acList.get(0);
			ac.setAcEvent(ac.getAcEvent()  + info);
			
			if(ac.getAcEvent().length() > 1000){
				return 0;
			}
			
			getChronologyManageDao().saveChronology(ac);
			return 1;
		}
		
		ac.setUserNum(userNum);
		ac.setAcYear(year);
		ac.setAcEvent(info);
		
		getChronologyManageDao().saveChronology(ac);
		return 1;
	}

}
