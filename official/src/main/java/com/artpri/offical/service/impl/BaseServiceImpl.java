package com.artpri.offical.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.artpri.offical.dao.BaseDao;
import com.artpri.offical.service.BaseService;


public class BaseServiceImpl<T> implements BaseService<T>{

	@Autowired
	private BaseDao<T> baseDao;
	
	public void updateEntity(T t) {
		baseDao.updateEntity(t);
	}

	public Integer saveEntity(T t) {
		return baseDao.saveEntity(t);
	}

	public T getEntityById(Integer entityId) {
		return baseDao.getEntityById(entityId);
	}

	public void removeEntityById(Integer entityId) {
		baseDao.removeEntityById(entityId);
	}

}
