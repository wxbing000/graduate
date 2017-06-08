/**
 * 
 */
package com.artpri.artist.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * 验证用户身份逻辑跳转类
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月19日
 */
public class LoginAction extends BaseAction {

	/**
	 * 用户登录输入的账号
	 * */
	private String userName;

	/**
	 * 用户输入的登录密码
	 * */
	private String pass;

	/**
	 * 提示语
	 * */
	private String message;

	public String loginValidate() {

		if (getLoginService().loginValidate(userName, pass) == 1) { // 如果验证成功跳转到首页
			return Action.SUCCESS;
		} else if (getLoginService().loginValidate(userName, pass) == 2) { // 如果验证失败重新登录
			message = "您的密码输入错误，请重新登录";
			return Action.INPUT;
		} else if (getLoginService().loginValidate(userName, pass) == 3) { // 如果验证失败重新登录
			message = "您的账号输入错误，请重新登录";
			return Action.INPUT;
		} else if (getLoginService().loginValidate(userName, pass) == 4) { // 如果验证失败重新登录
			message = "您的账号密码输入错误，请重新登录";
			return Action.INPUT;
		}
		return Action.INPUT;

	}

	public String loginOut() {
		ActionContext.getContext().getSession().remove("userNum");
		ActionContext.getContext().getSession().remove("userRealNum");
		return SUCCESS;

	}

    public String getMessage() {
        return message;
    }

    public String getPass() {
        return pass;
    }

    public String getUserName() {
        return userName;
    }

	public void setMessage(String message) {
		this.message = message;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
