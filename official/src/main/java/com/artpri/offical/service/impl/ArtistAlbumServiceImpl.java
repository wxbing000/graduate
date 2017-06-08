/**
 * 
 */
package com.artpri.offical.service.impl;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.artpri.offical.dao.ArtistAlbumDao;
import com.artpri.offical.model.ArtistAlbum;
import com.artpri.offical.service.ArtistAlbumService;

/**
 * <p>Description: </p>
 * @author 王校兵
 * @time 2016年9月12日下午6:27:01
 * @version 1.0
 */

@Service("artistAlbumService")
public class ArtistAlbumServiceImpl extends BaseServiceImpl<ArtistAlbum>
		implements ArtistAlbumService {
	
	@Value("#{configProperties['read.page']}")
    private String test; 
	
	
	
	public String getTest() {
		return test;
	}

	@Autowired
	private ArtistAlbumDao artistAlbumDao;

	@Override
	public List<String> getUniqueYearByUserNum(int userNum) {

		return artistAlbumDao.getUniqueYearByUserNum(userNum);
	}

	@Override
	public int getTotalPhotosNumByUserNum(int userNum, String type,
			String parameter) {

		return artistAlbumDao.getTotalPhotosNumByUserNum(userNum, type, parameter);
	}

	@Override
	public List<ArtistAlbum> getPhotosByUserNumAndType(int userNum,
			String type, String parameter, int pageNo, int pageSize) {

		return artistAlbumDao.getPhotosByUserNumAndType(userNum, type, parameter, pageNo, pageSize);
	}
	
	

	@Override
	public List<ArtistAlbum> getallAlbum(int userNum) {
		// TODO Auto-generated method stub
		return artistAlbumDao.getallAlbum(userNum);
	}
	@Override
	public List<ArtistAlbum> getAlbumByYear(int userNum,String year){
		return artistAlbumDao.getAlbumByYear(userNum, year);
	}
	@Override
	public List<ArtistAlbum> getAlbumByCategory(int userNum,int aacId){
		return artistAlbumDao.getAlbumByCategory(userNum, aacId);
	}
	
	public void demo(){
		System.out.println(test);
	}
	
}
