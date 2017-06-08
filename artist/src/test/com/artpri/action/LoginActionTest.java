package com.artpri.action;

import com.artpri.artist.action.LoginAction;
import com.artpri.artist.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * describe:
 *
 * @author : 王校兵
 * @version : v1.0
 * @time : 2017/4/18  16:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class LoginActionTest {

    @Autowired
    private LoginService loginService;

    @Test
    public void testLoginvalidate() {

        int status = loginService.loginValidate("齐梦慧", "123");
        System.out.println(status);

    }


}
