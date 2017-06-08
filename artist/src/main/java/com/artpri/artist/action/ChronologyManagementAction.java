/**
 * 
 */
package com.artpri.artist.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

/**
 * 艺术家个人年表管理action类
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月22日
 */
public class ChronologyManagementAction extends BaseAction {

	// 艺术家年表信息id
	private int artistId;

	// 艺术家年表信息中年份
	private String year;

	// 艺术家年表信息中年表信息
	private String info;

	private String message;

	/**
	 * 删除当前艺术家的年表信息跳转方法
	 * */
	public String deleteChronology() {
		getChronologyManageService().deleteChronology(artistId);
		message = "删除成功";
		return Action.SUCCESS;
	}

    /**
     * 修改当前艺术家的年表信息跳转方法
     * */
    public String updateChronology() {
        int state = getChronologyManageService().updateChronology(artistId, year, info);

        if(state == 1){       //如果更新的行数为1
            message = "数据更新成功！";
        }else{        //如果更新的行数为其他行数
            message = "数据更新失败，请重新提交。";
        }

        return Action.SUCCESS;

    }

    /**
     * 添加艺术家的年表信息跳转方法
     * */
    public String saveChronology() {
        int state = getChronologyManageService().saveChronology(year, info);
        if(state >= 1){
            message = "数据插入成功！";
        }else{
            message = "提交的数据过长请缩短后重新提交！";
        }

        return Action.SUCCESS;

    }

	public int getArtistId() {
		return artistId;
	}

	public String getInfo() {
		return info;
	}

	public String getMessage() {
		return message;
	}

	public String getYear() {
		return year;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
