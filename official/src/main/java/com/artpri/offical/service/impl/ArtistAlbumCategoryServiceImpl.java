/**
 * 
 */
package com.artpri.offical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistAlbumCategoryDao;
import com.artpri.offical.model.ArtistAlbumCategory;
import com.artpri.offical.service.ArtistAlbumCategoryService;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月12日下午6:25:33
 * @version 1.0
 */

@Service("albumCategoryService")
public class ArtistAlbumCategoryServiceImpl extends
		BaseServiceImpl<ArtistAlbumCategory> implements
		ArtistAlbumCategoryService {
	
	@Autowired
	private ArtistAlbumCategoryDao artistAlbumCategoryDao;

	@Override
	public List<ArtistAlbumCategory> getUniqueCategoryNameByName(int userNum) {
		return artistAlbumCategoryDao.getUniqueCategoryNameByName(userNum);
	}

}
