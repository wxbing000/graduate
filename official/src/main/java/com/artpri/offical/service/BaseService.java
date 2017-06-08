package com.artpri.offical.service;

public interface BaseService<T> {
	
	/**
	 * 根据实体类对象进行更新
	 * @param t
	 */
	void updateEntity(T t);
	
	/**
	 * 根据实体类对象进行保存
	 * @param t
	 * @return 自增主键的值
	 */
	Integer saveEntity(T t);
	
	/**
	 * 根据ID查询单个对象
	 * @param entityId
	 */
	T getEntityById(Integer entityId);
	
	/**
	 * 根据ID进行删除
	 * @param entityId
	 */
	void removeEntityById(Integer entityId);

}
