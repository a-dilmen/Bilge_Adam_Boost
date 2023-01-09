package com.dilmen.soru2.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.dilmen.soru2.entity.SiparisKalemi;
import com.dilmen.soru2.entity.SiparisKalemi;

public class SiparisKalemiRepository implements IRepository<SiparisKalemi> {

	@Override
	public void create(SiparisKalemi entity) {
		Session session = null;
		try {
			session = dataBaseConnectionHibernate();
			session.getTransaction().begin();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("SiparisKalemi data is added to DB");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some problem occured while adding Book to DB");
		} finally {
			session.close();
		}
	}

	@Override
	public void delete(long id) {
		Session session = null;
		try {
			SiparisKalemi deletedBook = find(id);
			if (deletedBook != null) {
				session = dataBaseConnectionHibernate();
				session.getTransaction().begin();
				session.remove(deletedBook);
				session.getTransaction().commit();
				System.out.println("SiparisKalemi data is deleted from DB");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some problem occured while deleting customer from DB");
		} finally {
			session.close();
		}
	}

	@Override
	public void update(long id, SiparisKalemi entity) {
		Session session = null;
		try {
			SiparisKalemi siparisKalemi = find(id);
			
			if (siparisKalemi != null) {
				entity.setId(siparisKalemi.getId());
				session = dataBaseConnectionHibernate();
				session.getTransaction().begin();
				//update merge
				session.merge(siparisKalemi);
				session.getTransaction().commit();
				System.out.println("Book data is updated to DB");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some problem occured while adding Book to DB");
		} finally {
			session.close();
		}
	}

	@Override
	public List<SiparisKalemi> listAll() {
		Session session = null;
		session = dataBaseConnectionHibernate();
		String query = "select siparisKalemi from SiparisKalemi as siparisKalemi";
		TypedQuery<SiparisKalemi> typedQuery = session.createQuery(query, SiparisKalemi.class);
		List<SiparisKalemi> siparisKalemiList = typedQuery.getResultList();
		siparisKalemiList.forEach(System.out::println);
		return siparisKalemiList;
	}

	@Override
	public SiparisKalemi find(long id) {
		Session session = dataBaseConnectionHibernate();
		SiparisKalemi siparisKalemi;
		try {
			siparisKalemi = session.find(SiparisKalemi.class, id);
			if (siparisKalemi != null) {
				System.out.println("SiparisKalemi Found--> " + siparisKalemi);
				return siparisKalemi;
			} else {
				System.out.println("SiparisKalemi not found");
				return null;
			}
		} catch (Exception e) {
			System.out.println("Some problem occured while adding SiparisKalemi to DB");
		} finally {
			session.close();
		}
		return null;
	}

}
