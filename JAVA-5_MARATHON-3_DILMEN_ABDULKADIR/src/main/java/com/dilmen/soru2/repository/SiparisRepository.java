package com.dilmen.soru2.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.dilmen.soru2.entity.Siparis;
import com.dilmen.soru2.entity.Siparis;

public class SiparisRepository implements IRepository<Siparis> {

	@Override
	public void create(Siparis entity) {
		Session session = null;
		try {
			session = dataBaseConnectionHibernate();
			session.getTransaction().begin();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("Siparis data is added to DB");
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
			Siparis deletedBook = find(id);
			if (deletedBook != null) {
				session = dataBaseConnectionHibernate();
				session.getTransaction().begin();
				session.remove(deletedBook);
				session.getTransaction().commit();
				System.out.println("Siparis data is deleted from DB");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some problem occured while deleting customer from DB");
		} finally {
			session.close();
		}
	}

	@Override
	public void update(long id, Siparis entity) {
		Session session = null;
		try {
			Siparis siparis = find(id);
			
			if (siparis != null) {
				entity.setId(siparis.getId());
				session = dataBaseConnectionHibernate();
				session.getTransaction().begin();
				//update merge
				session.merge(siparis);
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
	public List<Siparis> listAll() {
		Session session = null;
		session = dataBaseConnectionHibernate();
		String query = "select siparis from Siparis as siparis";
		TypedQuery<Siparis> typedQuery = session.createQuery(query, Siparis.class);
		List<Siparis> siparisList = typedQuery.getResultList();
		siparisList.forEach(System.out::println);
		return siparisList;
	}

	@Override
	public Siparis find(long id) {
		Session session = dataBaseConnectionHibernate();
		Siparis siparis;
		try {
			siparis = session.find(Siparis.class, id);
			if (siparis != null) {
				System.out.println("Siparis Found--> " + siparis);
				return siparis;
			} else {
				System.out.println("Siparis not found");
				return null;
			}
		} catch (Exception e) {
			System.out.println("Some problem occured while adding Siparis to DB");
		} finally {
			session.close();
		}
		return null;
	}

}
