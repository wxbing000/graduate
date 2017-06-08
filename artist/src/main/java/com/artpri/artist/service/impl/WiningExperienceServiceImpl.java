/**
 * 
 */
package com.artpri.artist.service.impl;

import java.util.List;

import com.artpri.artist.model.ArtistAward;
import com.artpri.artist.service.WiningExperienceService;
import com.artpri.artist.util.GetPagingInfoUtil;
import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月30日
 */
public class WiningExperienceServiceImpl extends BaseService implements
		WiningExperienceService {

	@Override
	public List getWinningExperience(int pageNow, int pageSize) {

		// 取到当前的page数
		int curpage = GetPagingInfoUtil.countCurrentPage(pageNow);

		// 从session中取到登录的用户的用户编码
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");

		// 返回查询结果
		return getWiningExperienceDao().getWinningExperience(userNum, curpage, pageSize);
	}

	public int totalpage(int pageSize) {
		
		// 从session中取到登录的用户的用户编码
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");

		// 数据库中当前艺术家年表信息总行数
		int rowCount = (int) getWiningExperienceDao().getWinningExperienceRowCount(userNum);
		return GetPagingInfoUtil.countTatalPage(pageSize, rowCount);
	}
	
	@Override
	public String updateWinningExperience(int zhujian, String years,
			String experiense) {
		if (getWiningExperienceDao().updateWinningExperience(zhujian, years,
				experiense) == 1) {
			return "success";
		}
		return "success";
	}

	@Override
	public String deleteWinningExperience(int shanchu) {
		getWiningExperienceDao().deleteWinningExperience(shanchu);
		return "success";
	}

	@Override
	public int saveWinningExperience(String year, String info) {
		
		int userNum = (int) ActionContext.getContext().getSession().get("userNum");
		
		//查询数据库中是否存在相同年份的获奖经历信息如果存在则返回该对象
		List<ArtistAward> experienceList = (List<ArtistAward>) getWiningExperienceDao().getExistExperience(userNum, year);
		
		//创建ArtistAward对象
		ArtistAward aa = new ArtistAward();
		
		//如果数据库中存在相同年份的获奖经历信息
		if(experienceList.size() > 0){
			
			aa = experienceList.get(0);
			
			
			
			//将新提交的艺术家获奖经历添加到已经存在的信息后
			aa.setAaEvent(experienceList.get(0).getAaEvent()+ "<br/>" + info);
			
			if(aa.getAaEvent().length() > 300){
				return 0;
			}
			
			//保存
			getWiningExperienceDao().saveExperience(aa);
			
			return 1;
		}
		
		//数据库中不存在则将数据直接放入数据库
		aa.setAaYear(year);
		aa.setUserNum(userNum);
		aa.setAaEvent(info);
		
		 getWiningExperienceDao().saveExperience(aa);
		 
		 return 1;
		
	}

}
