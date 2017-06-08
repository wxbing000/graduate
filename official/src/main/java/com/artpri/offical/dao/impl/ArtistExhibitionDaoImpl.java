/**
 * 
 */
package com.artpri.offical.dao.impl;

import com.artpri.offical.dao.ArtistExhibitionDao;
import com.artpri.offical.model.ArtistExhibition;
import com.artpri.offical.pojo.HomePageExhibition;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Description:展览信息
 * </p>
 * 
 * @author 王校兵
 * @time 2016年9月11日上午11:51:07
 * @version 1.0
 */

@Repository
public class ArtistExhibitionDaoImpl extends BaseDaoImpl<ArtistExhibition>
		implements ArtistExhibitionDao {

    /**
     * use
     * */
	@Override
	public List<HomePageExhibition> getHomePageExhibitionByUserNum(int userNum) {

		String sql = " select ae.exhibit_id id,ae.exhibit_name name,ae.exhibit_area place, ae.exhibit_time time, ae.exhibition_picture pictureUrl "
				+ " from artist_exhibition ae where ae.user_num = ?0 ";

		return (List<HomePageExhibition>)getSQLQuery(sql, userNum)
				.setResultTransformer(Transformers.aliasToBean(HomePageExhibition.class)).list();
	}
	/**
     * use
	 * 获取单条展览信息
	 * @param exhibitId 展览id
	 * @return 查询出的展览的详细信息
	 * */
	@Override
	public List<ArtistExhibition> getExhibitionByID(int exhibitId){
		String hql = "from ArtistExhibition where exhibitId = ?0 ";
		
		return (List<ArtistExhibition>) getQuery(hql, exhibitId).list();
	}

    /**
     * 根据展览的id查询展览的图片
     *
     * @param exhibitId
     */
    @Override
    public String getExhibitionPictureById(int exhibitId) {
        ArtistExhibition artistExhibition = getEntityById(exhibitId);
        return artistExhibition.getExhibitionPicture();
    }

//    /**
//     * use
//     * */
//    @Override
//    public ArtistExhibitPicture getExhibitionPictureById(int exhibitId){
//        String hql = "from ArtistExhibitPicture where exhibitId = ?0 ";
//        return (ArtistExhibitPicture) getQuery(hql,exhibitId).uniqueResult();
//    }

}
