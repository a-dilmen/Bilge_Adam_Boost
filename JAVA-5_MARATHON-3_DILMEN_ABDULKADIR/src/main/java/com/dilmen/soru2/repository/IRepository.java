package com.dilmen.soru2.repository;

import java.util.List;

import org.hibernate.Session;

import com.dilmen.soru2.utility.HibernateUtil;


public interface IRepository<T> {
	
	public void create(T entity);
	
	public void delete(long id);
	
	public void update(long id, T entity);
	
	public List<T> listAll();
	
	public T find(long id);
	
	default Session dataBaseConnectionHibernate() {

		return HibernateUtil.getSessionFactory().openSession();
	}

}