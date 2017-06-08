/**
 *
 */
package com.artpri.offical.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.artpri.offical.dao.ArtistNewsDao;
import com.artpri.offical.model.ArtistNews;
import com.artpri.offical.pojo.HomePageNews;

/**
 * <p>Description: 咨讯操作类</p>
 *
 * @author 王校兵
 * @version 1.0
 * @time 2016年9月10日下午4:52:21
 */

@Repository
public class ArtistNewsDaoImpl extends BaseDaoImpl<ArtistNews> implements
        ArtistNewsDao {

    /**
     * 方法描述：
     *
     * @author:田坤
     * @input:userNum
     * @return:anid:咨讯id,newsName:咨讯名称,newsDigest:咨讯内容
     * @date： 日期：2017年2月1日 时间：上午10:31:11
     * @Description:
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<HomePageNews> getHomePageNewsByUserNum(int userNum) {

        String hql = " select new com.artpri.offical.pojo.HomePageNews(an.anId, an.newsName, an.newsDigest) from "
                + " ArtistNews an where an.userNum = ?0 order by an.newsTime desc";

        return (List<HomePageNews>) getQuery(hql, userNum).list();
    }

    /**
     * 方法描述：
     *
     * @author:田坤
     * @input:userNum
     * @return:anid:咨讯id,newsName:咨讯名称,newsDigest:评论内容
     * @date： 日期：2017年2月1日 时间：上午10:31:11
     * @Description:
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<HomePageNews> getHomePageCommentByUserNum(int userNum) {
//        String hql = " select new com.artpri.offical.pojo.HomePageNews(anr.anId, an.newsName, an.newsDigest) from "
//                + " ArtistNews an, ArtistNewsRelation anr where anr.userNum = ?0 and anr.newsPosition = ?1 "
//                + "	and an.anId = anr.anId order by anr.newsOrder ";

        String hql = " select new com.artpri.offical.pojo.HomePageNews(an.anId, an.newsName, an.newsDigest) from "
                + " ArtistNews an where an.userNum = ?0 order by an.newsTime desc";

        return (List<HomePageNews>) getQuery(hql, userNum).list();
    }

    /**
     * @param :userNum
     * @return :返回的是资讯页面需要的所有咨询
     * @date： 日期：2017年2月21日 时间：上午10:31:11
     * @Description:
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<ArtistNews> getNewsPageNewsByUserNum(int userNum) {
//        String hql = "select an from  ArtistNews an, ArtistNewsRelation anr "
//                + " where anr.userNum = ?0 "
//                + "	and an.anId = anr.anId order by anr.newsOrder";

        String hql = "select an from ArtistNews an where an.userNum = ?0 order by an.newsTime desc";

        return (List<ArtistNews>) getQuery(hql, userNum).list();
    }

    /**
     * 方法描述：
     *
     * @author:田坤
     * @input:anId
     * @return:返回的是单条咨询的详细信息
     * @date： 日期：2017年2月21日 时间：上午10:31:11
     * @Description:
     */

    @SuppressWarnings("unchecked")
    @Override
    public List<ArtistNews> getNewsinfoById(int anId) {
        String hql = "from  ArtistNews an  where  an.anId = ?0";

        return (List<ArtistNews>) getQuery(hql, anId).list();
    }


}
