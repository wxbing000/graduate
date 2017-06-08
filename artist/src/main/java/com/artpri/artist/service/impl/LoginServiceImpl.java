/**
 * 
 */
package com.artpri.artist.service.impl;

import java.util.List;

import com.artpri.artist.service.LoginService;
import com.artpri.artist.util.Md5Util;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author 王校兵
 * @version 1.0, 2016年3月19日
 */
public class LoginServiceImpl extends BaseService implements LoginService {

	@Override
	public int loginValidate(String userName, String pass) {
		// TODO Auto-generated method stub

		// 用户登录提示语

		// 从数据库中查找到的用户名和密码
		List passAndRole = getLoginDao().getLoginPassAndRole(userName);

		// 计算出通过md5第一次加密后的密文
		String first = Md5Util.getMD5String(pass);

		String finalPass = Md5Util.getMD5String(first);

        //如果查询出的数据为空
		if(passAndRole == null || passAndRole.size() == 0){
            return 4;
        }

		Object[] allInfo = (Object[]) passAndRole.get(0);
		
		if (allInfo[0].equals(finalPass) && passAndRole != null) { // 数据库中密码和输入密码对应
			ActionContext.getContext().getSession().put("userNum", allInfo[2]);
			ActionContext.getContext().getSession().put("userRealNum", allInfo[3]);
			return 1;
		} else if (!allInfo[0].equals(finalPass) && passAndRole != null) {// 数据库中密码和输入密码不对应
			return 2;
		} else if (passAndRole == null) { // 如果没有查到数据则用户名输入错误。
			return 3;
		} else {
			return 4;
		}

	}

}
