package com.artpri.offical.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.artpri.offical.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{
	
	//===============准备工作=======================
	//1.声明一个entityType
	private Class<T> entityType;
	
	//2.在构造器中初始化entityType
	public BaseDaoImpl() {
		
		//①this：创建子类对象时，父类构造器中的this关键字指向的是子类对象
		//②通过this获取“带有泛型参数的父类类型”
		//Type接口代表“类型”：凡是可以用来声明“引用类型”变量的都是类型。
		Type type = this.getClass().getGenericSuperclass();
		
		//④将type转换成“带参数的类型”
		if(type instanceof ParameterizedType) {
			
			ParameterizedType pt = (ParameterizedType) type;
			
			//⑤获取具体的泛型参数的数组
			Type[] actualTypeArguments = pt.getActualTypeArguments();
			
			//⑥由于我们当前环境下能够确定只传一个泛型参数，所以直接访问下标0
			entityType = (Class<T>) actualTypeArguments[0];
			
		}
		
	}
	
	//3.通过IOC容器注入SessionFactory
	@Autowired
	private SessionFactory factory;
	
	//4.提供一个获取Session对象的方法
	public Session getSession() {
		
		//getCurrentSession()必须运行在声明式事务的环境下才能够得到Session对象
		return factory.getCurrentSession();
		//return factory.openSession();
	}
	
	//5.提供获取Query对象的方法
	public Query getQuery(String hql, Object ...params) {
		
		Query query = getSession().createQuery(hql);
		
		if(params != null) {
			
			for(int i = 0 , len = params.length ; i < len ; i++)
			{
				query.setParameter(i + "" , params[i]);
			}
		}
		
		return query;
		
	}
	
	/*public List<T> getlist(String sql, Object ...params){
		Session se=factory.getCurrentSession();
		List<T> list=getSQLQuery(sql,params).list();
		se.close();
		return list;
		
	}*/
	//6.提供获取SQLQuery对象的方法
	public SQLQuery getSQLQuery(String sql, Object ...params) {
		/*Session session=getSession();
		Transaction tran=session.beginTransaction();*/
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		if(params != null) {
			for(int i = 0 ; i < params.length; i++) {
				sqlQuery.setParameter(i + "", params[i]);
			}
		}
		
		//tran.commit();
		//session.close();
		return sqlQuery;
		
	}

	
	public int getTotalRecordNoBySQL(String sql, Object... params) {
		SQLQuery sqlQuery = getSQLQuery(sql, params);
		BigInteger count = (BigInteger) sqlQuery.uniqueResult();
		return count.intValue();
	}

	public void batchUpdate(final String sql, final Object[][] params) {
		
		getSession().doWork(new Work() {
			
			public void execute(Connection connection) throws SQLException {
				//1.创建PreparedStatement对象
				PreparedStatement ps = connection.prepareStatement(sql);
				
				//2.遍历二维数组，给PreparedStatement对象设置参数
				if(params != null) {
					
					for(int i = 0; i < params.length; i++) {
						
						Object[] param = params[i];
						
						for(int j = 0; j < param.length; j++) {
							ps.setObject(j+1, param[j]);
						}
						
						//3.在每一条SQL语句成功设置参数后都需要执行一次积攒操作
						ps.addBatch();
					}
					
				}
				
				//4.执行批量操作
				ps.executeBatch();
				
				//5.释放资源
				//原则：我们只负责关闭我们自己打开的资源
				ps.close();
				
				//※注意：connection对象在执行我们当前批量操作的方法之后还需要使用，千万不要关闭
				
			}
		});
		
	}

	public void updateBySQL(String sql, Object... params) {
		getSQLQuery(sql, params).executeUpdate();
	}

	/**
	 * 分页查找
	 */
	@SuppressWarnings("unchecked")
	public List<T> getLimitedEntityList(String hql, int pageNo, int pageSize,
			Object... params) {
		return getQuery(hql, params).setFirstResult((pageNo - 1)*pageSize).setMaxResults(pageSize).list();
	}

	public int getTotalRecordNo(String hql, Object... params) {
		
		long count = (Long) getQuery(hql, params).uniqueResult();
		
		return (int) count;
	}

	@SuppressWarnings("unchecked")
	public List<T> getEntitlList(String hql, Object... params) {
		return getQuery(hql, params).list();
	}

	@SuppressWarnings("unchecked")
	public T getSingleEntity(String hql, Object... params) {
		return (T) getQuery(hql, params).uniqueResult();
	}

	public void updateEntity(String hql, Object... params) {
		getQuery(hql, params).executeUpdate();
	}

	public void updateEntity(T t) {
		getSession().update(t);
	}

	public Integer saveEntity(T t) {
		return (Integer) getSession().save(t);
	}

	@SuppressWarnings("unchecked")
	public T getEntityById(Integer entityId) {
		return (T) getSession().get(entityType, entityId);
	}

	public void removeEntityById(Integer entityId) {
		
		//delete from 简单类名 别名 where 别名.id属性名=?
		
		String simpleName = entityType.getSimpleName();
		
		ClassMetadata classMetadata = factory.getClassMetadata(entityType);
		
		String idName = classMetadata.getIdentifierPropertyName();
		
		String hql = "delete from "+simpleName+" alias where alias."+idName+"=?";
		updateEntity(hql, entityId);
		
	}

}
