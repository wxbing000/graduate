package com.artpri.service;

import com.artpri.artist.service.AlbumCategoryMangeService;
import org.aspectj.lang.annotation.Before;
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
 * @time : 2017/4/18  16:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class AlbumCategoryMangeServiceTest {

    @Autowired
    private AlbumCategoryMangeService albumCategoryMangeService;


    @Test
    public void testDelCategory() {

        albumCategoryMangeService.delCategory(28);


    }


}
