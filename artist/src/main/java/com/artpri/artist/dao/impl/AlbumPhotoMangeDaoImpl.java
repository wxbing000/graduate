/**
 * 
 */
package com.artpri.artist.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artpri.artist.dao.AlbumPhotoMangeDao;
import com.artpri.artist.model.ArtistAlbum;

/**
 * 艺术家相册图片管理数据库操作类AlbumPhotoMangeDao实现类
 * @author 王校兵
 * @version 1.0, 2016年4月3日
 */
@Transactional
public class AlbumPhotoMangeDaoImpl extends HibernateDaoImpl implements
		AlbumPhotoMangeDao {

	@Override
	public List getAlbumCategory(int userNum) {
		return find("select aacId,aacName from ArtistAlbumCategory where userNum=?0 ", userNum);
	}

	@Override
	public int saveAlbumPhoto(ArtistAlbum aa) {
		return (Integer) save(aa);
	}

	@Override
	public List getPhotoYears(int userNum) {
		return find("select distinct aaYear from ArtistAlbum where userNum=?0 ", userNum);
	}

	@Override
	public List getPhotoByCategory(int userNum, int queryCategory) {
		return find("from ArtistAlbum where userNum= ?0 and aacId= ?1", userNum, queryCategory);
	}

	@Override
	public List getPhotoByTime(int userNum, String queryTime) {
		return find("from ArtistAlbum where userNum= ?0 and aaYear= ?1", userNum, queryTime);
	}

	@Override
	public List getPhotoByTitle(int userNum, String queryTitle) {
		return find("from ArtistAlbum where userNum= ?0 and aaName like ?1", userNum, queryTitle);
	}

	@Override
	public void delPhotoInfo(int delInfoId) {
		delete(ArtistAlbum.class, delInfoId);
	}

	@Override
	public ArtistAlbum getPhotoById(int id) {
		return  (ArtistAlbum) get(ArtistAlbum.class, id);
	}

	@Override
	public void updateAlbumInfo(ArtistAlbum aa) {
		update(aa);
	}
	
	

}
