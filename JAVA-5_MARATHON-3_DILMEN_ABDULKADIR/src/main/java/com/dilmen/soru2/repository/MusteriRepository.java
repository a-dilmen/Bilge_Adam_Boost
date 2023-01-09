package com.dilmen.soru2.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.dilmen.soru2.entity.Musteri;

public class MusteriRepository implements IRepository<Musteri> {

	@Override
	public void create(Musteri entity) {
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
			Musteri deletedBook = find(id);
			if (deletedBook != null) {
				session = dataBaseConnectionHibernate();
				session.getTransaction().begin();
				session.remove(deletedBook);
				session.getTransaction().commit();
				System.out.println("Musteri data is deleted from DB");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Some problem occured while deleting customer from DB");
		} finally {
			session.close();
		}

	}

	@Override
	public void update(long id, Musteri entity) {
		Session session = null;
		try {
			Musteri musteri = find(id);
			
			if (musteri != null) {
				entity.setId(musteri.getId());
				session = dataBaseConnectionHibernate();
				session.getTransaction().begin();
				//update merge
				session.merge(musteri);
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
	public List<Musteri> listAll() {
		Session session = null;
		session = dataBaseConnectionHibernate();
		String query = "select musteri from Musteri as musteri";
		TypedQuery<Musteri> typedQuery = session.createQuery(query, Musteri.class);
		List<Musteri> musteriList = typedQuery.getResultList();
		musteriList.forEach(System.out::println);
		return musteriList;
	}

	@Override
	public Musteri find(long id) {
		Session session = dataBaseConnectionHibernate();
		Musteri musteri;
		try {
			musteri = session.find(Musteri.class, id);
			if (musteri != null) {
				System.out.println("Musteri Found--> " + musteri);
				return musteri;
			} else {
				System.out.println("Musteri not found");
				return null;
			}
		} catch (Exception e) {
			System.out.println("Some problem occured while adding Musteri to DB");
		} finally {
			session.close();
		}
		return null;
	}

}
