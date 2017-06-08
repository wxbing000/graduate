/**
 *
 */
package com.artpri.artist.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.dao.LoginDao;

/**
 * @author 王校兵
 * @version 1.0, 2016年3月19日
 */
@Transactional
public class LoginDaoImpl extends HibernateDaoImpl implements LoginDao {

    /* (non-Javadoc)
     * @see com.artpri.dao.LoginDao#getLoginPass(java.lang.String)
     */
    @Override
    public List getLoginPassAndRole(String userName) {
        // TODO Auto-generated method stub
        return find("select userPasswd,userRole,userNum,userRealName from UserInfo where userName = ?0", userName);
    }

}
