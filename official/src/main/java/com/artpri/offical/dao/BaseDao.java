package com.artpri.offical.dao;

import java.util.List;

/**
 * 声明基类接口的目的是为了给上层方法调用时提供一些通用的方法
 * @author Creathin
 *
 */
public interface BaseDao<T> {
	
	/**
	 * 根据SQL查询总记录数
	 * @param sql
	 * @param params
	 * @return
	 */
	int getTotalRecordNoBySQL(String sql, Object... params);
	
	/**
	 * 根据SQL语句进行批量增删改操作，使用原生的JDBC API
	 * @param sql
	 * @param params二维数组
	 */
	void batchUpdate(String sql, Object[][] params);
	
	/**
	 * 根据SQL语句进行更新
	 * @param sql
	 * @param params
	 */
	void updateBySQL(String sql, Object... params);
	
	/**
	 * 根据一定的查询条件查询当前页的集合
	 * @param hql
	 * @param pageNo
	 * @param pageSize
	 * @param params
	 * @return
	 */
	List<T> getLimitedEntityList(String hql, int pageNo, int pageSize, Object... params);
	
	/**
	 * 根据一定的查询条件查询总记录数
	 * @param hql
	 * @param params
	 * @return
	 */
	int getTotalRecordNo(String hql, Object... params);
	
	/**
	 * 根据HQL语句查询对象的List集合
	 * @param hql
	 * @param params
	 * @return
	 */
	List<T> getEntitlList(String hql, Object... params);
	
	/**
	 * 根据HQL查询单个对象
	 * @param hql
	 * @param params
	 * @return
	 */
	T getSingleEntity(String hql, Object... params);
	
	/**
	 * 根据HQL语句和传入的参数更新数据库记录
	 * @param hql
	 * @param params
	 */
	void updateEntity(String hql, Object... params);
	
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
