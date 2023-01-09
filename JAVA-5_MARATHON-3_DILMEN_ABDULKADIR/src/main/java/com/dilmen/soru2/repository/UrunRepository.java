package com.dilmen.soru2.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.dilmen.soru2.entity.Musteri;
import com.dilmen.soru2.entity.Urun;

public class UrunRepository implements IRepository<Urun>{

	@Override
	public void create(Urun entity) {
		Session session = null;
		try {
			session = dataBaseConnectionHibernate();
			session.getTransaction().begin();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("Musteri data is added to DB");
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
			Urun deletedBook = find(id);
			if (deletedBook != null) {
				session = dataBaseConnectionHibernate();
				session.getTransaction().begin();
				session.remove(deletedBook);
				session.getTransaction().commit();
				System.out.println("Urun data is deleted from DB");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some problem occured while deleting Urun from DB");
		} finally {
			session.close();
		}
	}

	@Override
	public void update(long id, Urun entity) {
		Session session = null;
		try {
			Urun musteri = find(id);
			
			if (musteri != null) {
				entity.setId(musteri.getId());
				session = dataBaseConnectionHibernate();
				session.getTransaction().begin();
				//update merge
				session.merge(musteri);
				session.getTransaction().commit();
				System.out.println("Urun data is updated to DB");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some problem occured while adding Book to DB");
		} finally {
			session.close();
		}
	}

	@Override
	public List<Urun> listAll() {
		Session session = null;
		session = dataBaseConnectionHibernate();
		String query = "select u from Urun as u";
		TypedQuery<Urun> typedQuery = session.createQuery(query, Urun.class);
		List<Urun> musteriList = typedQuery.getResultList();
		musteriList.forEach(System.out::println);
		return musteriList;
	}

	@Override
	public Urun find(long id) {
		Session session = dataBaseConnectionHibernate();
		Urun musteri;
		try {
			musteri = session.find(Urun.class, id);
			if (musteri != null) {
				System.out.println("Urun Found--> " + musteri);
				return musteri;
			} else {
				System.out.println("Urun not found");
				return null;
			}
		} catch (Exception e) {
			System.out.println("Some problem occured while adding Urun to DB");
		} finally {
			session.close();
		}
		return null;
	}

}
