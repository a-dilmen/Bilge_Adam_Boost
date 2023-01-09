package com.dilmen.soru2.service;

import java.util.List;

import com.dilmen.soru2.entity.Musteri;
import com.dilmen.soru2.repository.MusteriRepository;

public class MusteriService implements IService<Musteri>{
	public MusteriService() {
		musteriDao = new MusteriRepository();
	}

	MusteriRepository musteriDao;

	@Override
	public void create(Musteri entity) {
		musteriDao.create(entity);
	}

	@Override
	public void delete(long id) {
		musteriDao.delete(id);
	}

	@Override
	public void update(long id, Musteri entity) {
		musteriDao.update(id, entity);
	}

	@Override
	public List<Musteri> listAll() {
		return musteriDao.listAll();
	}

	@Override
	public Musteri find(long id) {
		Musteri musteri = musteriDao.find(id);
		return musteri;
	}
	
	
}
